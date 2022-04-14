package net.tslat.aoa3.client.gui.hud;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.gui.ForgeIngameGui;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.tslat.aoa3.advent.AdventOfAscension;
import net.tslat.aoa3.config.AoAConfig;
import net.tslat.aoa3.util.*;

public class HealthStatusRenderer {
	private static final ResourceLocation HEALTH_BAR = AdventOfAscension.id("textures/gui/overlay/misc/health_bar.png");
	private static float deltaHealth = 0;
	private static int lastHealthTime = 0;
	private static float lastTickHealth = 0;

	public static void init() {
		MinecraftForge.EVENT_BUS.addListener(EventPriority.LOWEST, false, RenderGameOverlayEvent.PreLayer.class, HealthStatusRenderer::onHealthRender);
	}

	private static void onHealthRender(RenderGameOverlayEvent.PreLayer ev) {
		if (ev.isCanceled() || ev.getOverlay() != ForgeIngameGui.PLAYER_HEALTH_ELEMENT)
			return;

		HealthRenderType renderType = AoAConfig.CLIENT.healthRenderType.get();

		if (renderType == HealthRenderType.HEARTS)
			return;

		Minecraft mc = Minecraft.getInstance();

		if (!(mc.gui instanceof ForgeIngameGui gui) || mc.options.hideGui || !gui.shouldDrawSurvivalElements())
			return;

		LocalPlayer player = mc.player;
		PoseStack matrix = ev.getMatrixStack();

		int left = (mc.getWindow().getGuiScaledWidth() / 2) - 91;
		int top = mc.getWindow().getGuiScaledHeight() - gui.left_height;
		gui.left_height += 10;

		gui.setupOverlayRenderState(true, false);
		ev.setCanceled(true);

		mc.getProfiler().push("health");
		RenderSystem.enableBlend();

		float currentHealth = player.getHealth();
		float maxHealth = player.getMaxHealth();
		boolean poisoned = mc.player.hasEffect(MobEffects.POISON);
		boolean withered = mc.player.hasEffect(MobEffects.WITHER);
		boolean frozen = mc.player.isFullyFrozen();
		float absorption = mc.player.getAbsorptionAmount();

		if (renderType == HealthRenderType.NUMERIC) {
			renderNumeric(matrix, mc, gui, left, top, currentHealth, maxHealth, poisoned, withered, frozen, absorption);
		}
		else {
			renderBar(matrix, mc, gui, left, top, currentHealth, maxHealth, poisoned, withered, frozen, absorption);

			if (renderType ==  HealthRenderType.BAR_NUMERIC)
				renderNumeric(matrix, mc, gui, left, top, currentHealth, maxHealth, poisoned, withered, frozen, absorption);
		}

		RenderSystem.disableBlend();
		mc.getProfiler().pop();
		MinecraftForge.EVENT_BUS.post(new RenderGameOverlayEvent.Post(matrix, ev, RenderGameOverlayEvent.ElementType.LAYER));
	}

	private static void renderBar(PoseStack matrix, Minecraft mc, ForgeIngameGui gui, int left, int top, float currentHealth, float maxHealth, boolean poisoned, boolean withered, boolean frozen, float absorption) {
		int uvY = 0;

		if (absorption > 0) {
			uvY = 48;
		}
		else if (frozen) {
			uvY = 96;
		}
		else if (withered) {
			uvY = 84;
		}
		else if (poisoned) {
			uvY = 72;
		}
		else if (mc.player.hasEffect(MobEffects.HEALTH_BOOST)) {
			uvY = 60;
		}
		else if (mc.level.getLevelData().isHardcore()) {
			uvY = 108;
		}

		if (!NumberUtil.roundToNthDecimalPlace(lastTickHealth, 1).equals(NumberUtil.roundToNthDecimalPlace(currentHealth, 1))) {
			if (lastTickHealth < currentHealth) {
				if (lastHealthTime == 0) {
					lastTickHealth = currentHealth;
					lastHealthTime = mc.player.tickCount;

					return;
				}

				/*if (deltaHealth > 0) {
					deltaHealth -= Math.max(0, (mc.player.tickCount - lastHealthTime - 8)) * ((12 - (mc.player.tickCount - 8 - lastHealthTime)) / (float)12) * deltaHealth;
				}
				else if (deltaHealth < 0) {
					deltaHealth = 0;
				}*/

				if (deltaHealth < 0)
					deltaHealth = 0;

				deltaHealth += currentHealth - lastTickHealth;
			}
			else {
				if (deltaHealth > 0)
					deltaHealth = 0;

				deltaHealth -= lastTickHealth - currentHealth;
			}

			lastHealthTime = mc.player.tickCount + 12;
		}

		if (deltaHealth != 0 && lastHealthTime + 20 < mc.player.tickCount)
			deltaHealth = 0;

		lastTickHealth = currentHealth;
		matrix.pushPose();
		matrix.translate(left, top - 1.9, 0);
		RenderUtil.prepRenderTexture(HEALTH_BAR);

		float healthWidth = 81 * (currentHealth / maxHealth);

		if (currentHealth < maxHealth)
			RenderUtil.renderCustomSizedTexture(matrix, 0, 0, 0, 12, 81, 12, 81, 120);

		if (!mc.player.isAlive()) {
			matrix.popPose();

			return;
		}

		RenderUtil.renderCustomSizedTexture(matrix, 0, 0, 0, uvY, healthWidth, 12, 81, 120);

		if (deltaHealth != 0) {
			int deltaUvY = deltaHealth < 0 ? 24 : 36;
			float deltaWidth = mc.player.tickCount - lastHealthTime < 8 ? 1 : ((12 - (mc.player.tickCount - 8 - lastHealthTime)) / (float)12);
			float width = Math.min(Math.abs(deltaHealth), maxHealth) / maxHealth * 81 * deltaWidth;
			float x = deltaHealth < 0 ? healthWidth : healthWidth - width;

			if (deltaHealth < 0 && x + width > 81)
				width = 81 - x;

			RenderUtil.renderScaledCustomSizedTexture(matrix, x, 0, x, deltaUvY, width, 12, width, 12, 81, 120);
		}

		RenderUtil.drawColouredBox(matrix, 0, 0, 0, 81, 11, 0x44000000);
		matrix.popPose();
	}

	private static void renderNumeric(PoseStack matrix, Minecraft mc, ForgeIngameGui gui, int left, int top, float currentHealth, float maxHealth, boolean poisoned, boolean withered, boolean frozen, float absorption) {
		int healthColour;

		if (poisoned) {
			healthColour = ColourUtil.RGB(117, 113, 0);
		}
		else if (withered) {
			healthColour = ColourUtil.RGB(28, 28, 28);
		}
		else {
			healthColour = ColourUtil.RGB(252, 20, 0);
		}

		if (absorption > 0)
			left -= 15;

		matrix.pushPose();
		matrix.translate(left + 15, top + 0.9, 0);
		matrix.scale(0.9f, 0.9f, 1);

		if (currentHealth > 0) {
			renderHeart(matrix, mc, currentHealth, maxHealth, handleHealthState(mc.player, gui, (int)Math.ceil(currentHealth)), poisoned, withered, frozen, absorption);

			RenderUtil.drawCenteredScaledString(matrix, mc.font, NumberUtil.roundToNthDecimalPlace(currentHealth, 1) + "/" + NumberUtil.roundToNthDecimalPlace(maxHealth, 1), 34, 0, 1, healthColour, RenderUtil.StringRenderType.OUTLINED);

			if (absorption > 0) {
				RenderUtil.drawCenteredScaledString(matrix, mc.font, "-->", 67, 0, 1, ColourUtil.RGB(255, 204, 0), RenderUtil.StringRenderType.OUTLINED);
				RenderUtil.drawCenteredScaledString(matrix, mc.font, NumberUtil.roundToNthDecimalPlace(absorption, 1), 83, 0, 1, ColourUtil.RGB(255, 204, 0), RenderUtil.StringRenderType.OUTLINED);
			}
		}
		else {
			RenderUtil.drawCenteredScaledString(matrix, mc.font, LocaleUtil.getLocaleString("deathScreen.title"), (AoAConfig.CLIENT.healthRenderType.get() == HealthRenderType.BAR_NUMERIC ? 28.5f : 24), 0, 1, ColourUtil.RGB(150, 0, 0), RenderUtil.StringRenderType.OUTLINED);
		}

		matrix.popPose();
	}

	private static void renderHeart(PoseStack matrix, Minecraft mc, float currentHealth, float maxHealth, boolean flashing, boolean poisoned, boolean withered, boolean frozen, float absorb) {
		int uvX = 16;
		int uvY = mc.level.getLevelData().isHardcore() ? 45 : 0;
		int y = -1;

		if (absorb <= 0) {
			if (poisoned) {
				uvX += 36;
			}
			else if (withered) {
				uvX += 72;
			}
		}

		if (currentHealth <= maxHealth * 0.2f && RandomUtil.fiftyFifty())
			y += 1;

		if (mc.gui.tickCount % 25 == 0 && mc.player.hasEffect(MobEffects.REGENERATION))
			y -= 2;

		RenderSystem.setShaderTexture(0, GuiComponent.GUI_ICONS_LOCATION);
		RenderUtil.renderCustomSizedTexture(matrix, 0, y, Gui.HeartType.CONTAINER.getX(false, flashing), uvY, 9, 9, 256, 256);

		if (flashing)
			RenderUtil.renderCustomSizedTexture(matrix, 0, y, uvX + 54, uvY, 9, 9, 256, 256);

		if (absorb > 0) {
			RenderUtil.renderCustomSizedTexture(matrix, 0, y, uvX + 144, uvY, 9, 9, 256, 256);
		}
		else if (frozen) {
			RenderUtil.renderCustomSizedTexture(matrix, 0, y, uvX + 162, uvY, 9, 9, 256, 256);
		}
		else {
			RenderUtil.renderCustomSizedTexture(matrix, 0, y, uvX + (currentHealth >= maxHealth ? 36 : 45), uvY, 9, 9, 256, 256);
		}
	}

	private static boolean handleHealthState(LocalPlayer player, ForgeIngameGui gui, float currentHealth) {
		boolean shouldFlash = gui.healthBlinkTime > (long)gui.tickCount && (gui.healthBlinkTime - (long)gui.tickCount) / 3L % 2L == 1L;

		if (currentHealth < gui.lastHealth && player.invulnerableTime > 0) {
			gui.lastHealthTime = Util.getMillis();
			gui.healthBlinkTime = gui.tickCount + 20;
		}
		else if (currentHealth > gui.lastHealth && player.invulnerableTime > 0) {
			gui.lastHealthTime = Util.getMillis();
			gui.healthBlinkTime = gui.tickCount + 10;
		}

		if (Util.getMillis() - gui.lastHealthTime > 1000L) {
			gui.lastHealth = (int)currentHealth;
			gui.displayHealth = (int)currentHealth;
			gui.lastHealthTime = Util.getMillis();
		}

		gui.lastHealth = (int)currentHealth;

		return shouldFlash;
	}

	public enum HealthRenderType {
		HEARTS,
		BAR,
		NUMERIC,
		BAR_NUMERIC
	}
}