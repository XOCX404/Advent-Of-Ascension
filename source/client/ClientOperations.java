package net.tslat.aoa3.client;

import com.mojang.datafixers.util.Pair;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ReadBookScreen;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.IParticleData;
import net.minecraft.resources.SimpleReloadableResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.GameType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.tslat.aoa3.advent.Logging;
import net.tslat.aoa3.client.gui.adventgui.AdventGuiTabLore;
import net.tslat.aoa3.client.gui.hud.RecoilRenderer;
import net.tslat.aoa3.client.gui.hud.toasts.AbilityUnlockToast;
import net.tslat.aoa3.client.gui.hud.toasts.LevelRequirementToast;
import net.tslat.aoa3.client.gui.hud.toasts.ResourceRequirementToast;
import net.tslat.aoa3.client.gui.realmstone.BlankRealmstoneScreen;
import net.tslat.aoa3.client.particle.*;
import net.tslat.aoa3.client.render.entity.misc.OccultBlockRenderer;
import net.tslat.aoa3.common.packet.packets.ToastPopupPacket;
import net.tslat.aoa3.common.packet.packets.UpdateClientMovementPacket;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.common.registration.custom.AoAAbilities;
import net.tslat.aoa3.common.registration.custom.AoAResources;
import net.tslat.aoa3.common.registration.custom.AoASkills;
import net.tslat.aoa3.config.AoAConfig;
import net.tslat.aoa3.data.client.AdventGuiThemeReloadListener;
import net.tslat.aoa3.data.client.BestiaryReloadListener;
import net.tslat.aoa3.data.client.MiscellaneousReloadListener;
import net.tslat.aoa3.data.client.RealmstoneInsertsReloadListener;
import net.tslat.aoa3.object.entity.mob.greckon.SilencerEntity;
import net.tslat.aoa3.object.item.misc.WornBook;
import net.tslat.aoa3.player.ClientPlayerDataManager;
import net.tslat.aoa3.player.ability.AoAAbility;
import net.tslat.aoa3.player.resource.AoAResource;
import net.tslat.aoa3.player.skill.AoASkill;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.NumberUtil;
import org.apache.logging.log4j.Level;
import software.bernie.geckolib3.resource.ResourceListener;

import javax.annotation.Nullable;
import java.util.ArrayList;

public final class ClientOperations {
	public static final ClientPlayerDataManager CLIENT_PLAYER_DATA = new ClientPlayerDataManager();

	public static void displayWornBookGui() {
		PlayerEntity player = Minecraft.getInstance().player;
		ItemStack bookStack = player.getMainHandItem().getItem() == AoAItems.WORN_BOOK.get() ? player.getMainHandItem() : player.getOffhandItem();

		Minecraft.getInstance().setScreen(new ReadBookScreen(new ReadBookScreen.WrittenBookInfo(WornBook.getBook(bookStack))));
	}

	public static void displayBlankRealmstoneGui() {
		Minecraft.getInstance().setScreen(new BlankRealmstoneScreen());
	}

	public static void addRecoil(final float recoil, final int firingTime) {
		RecoilRenderer.addRecoil(recoil);
	}

	public static void addOccultBlocks(int renderUntil, ArrayList<Pair<BlockPos, BlockState>> blocks) {
		OccultBlockRenderer.addOccultBlocks(renderUntil, blocks);
	}

	public static void registerResourceListeners() {
		Minecraft mc = Minecraft.getInstance();

		if (mc == null)
			return;

		ResourceListener.registerReloadListener();

		SimpleReloadableResourceManager resourceManager = (SimpleReloadableResourceManager)mc.getResourceManager();

		resourceManager.registerReloadListener(new BestiaryReloadListener());
		resourceManager.registerReloadListener(new MiscellaneousReloadListener());
		resourceManager.registerReloadListener(new RealmstoneInsertsReloadListener());
		resourceManager.registerReloadListener(new AdventGuiThemeReloadListener());
	}

	public static void registerParticleFactories(ParticleFactoryRegisterEvent ev) {
		final ParticleManager particleManager = Minecraft.getInstance().particleEngine;

		particleManager.register(AoAParticleTypes.PORTAL_FLOATER.get(), PortalFloaterParticle.Factory::new);
		particleManager.register(AoAParticleTypes.SPARKLER.get(), SparklerParticle.Factory::new);
		particleManager.register(AoAParticleTypes.FLICKERING_SPARKLER.get(), FlickeringSparklerParticle.Factory::new);
		particleManager.register(AoAParticleTypes.LINGERING_SPARKLER.get(), LingeringSparklerParticle.Factory::new);
		particleManager.register(AoAParticleTypes.RAINBOW_SPARKLER.get(), RainbowSparklerParticle.Factory::new);
		particleManager.register(AoAParticleTypes.SWIRLY.get(), SwirlyParticle.Factory::new);
		particleManager.register(AoAParticleTypes.FLOATING_ITEM_FRAGMENT.get(), new FloatingItemFragmentParticle.Factory());
	}

	public static void addToast(ToastPopupPacket.ToastPopupType type, Object subject, Object value) {
		switch (type) {
			case SKILL_REQUIREMENT:
				AoASkill skill = AoASkills.getSkill((ResourceLocation)subject);

				if (AoAConfig.CLIENT.useToasts.get()) {
					Minecraft.getInstance().getToasts().addToast(new LevelRequirementToast(skill, (Integer)value));
				}
				else {
					Minecraft.getInstance().player.sendMessage(LocaleUtil.getLocaleMessage("message.feedback.insufficientLevels", TextFormatting.RED, skill.getName(), LocaleUtil.numToComponent((Integer)value)), Util.NIL_UUID);
				}
				break;
			case RESOURCE_REQUIREMENT:
				AoAResource resource = AoAResources.getResource((ResourceLocation)subject);

				if (AoAConfig.CLIENT.useToasts.get()) {
					Minecraft.getInstance().getToasts().addToast(new ResourceRequirementToast(resource, (Float)value));
				}
				else {
					Minecraft.getInstance().player.sendMessage(LocaleUtil.getLocaleMessage("message.feedback.insufficientResource", TextFormatting.RED, resource.getName(), new StringTextComponent(NumberUtil.roundToNthDecimalPlace((Float)value, 2))), Util.NIL_UUID);
				}
				break;
			case ABILITY_UNLOCK:
				AoASkill skill2 = AoASkills.getSkill((ResourceLocation)subject);
				AoAAbility ability = AoAAbilities.getAbility((ResourceLocation)value);

				if (AoAConfig.CLIENT.useToasts.get()) {
					Minecraft.getInstance().getToasts().addToast(new AbilityUnlockToast(skill2, ability));
				}
				else {
					Minecraft.getInstance().player.sendMessage(LocaleUtil.getLocaleMessage("message.feedback.abilityUnlocked", TextFormatting.GREEN, skill2.getName(), ability.getName()), Util.NIL_UUID);
				}
				break;
		}
	}

	public static void doSilencerSilence(SilencerEntity silencer) {
		if (!SilencerEntity.isClientNearby) {
			Minecraft mc = Minecraft.getInstance();

			if (mc.getSoundManager().soundEngine.getVolume(SoundCategory.MASTER) > 0) {
				if (silencer.distanceToSqr(mc.player) < 8 * 8) {
					SilencerEntity.isClientNearby = true;
					SilencerEntity.previousGain = mc.getSoundManager().soundEngine.listener.getGain();

					mc.getSoundManager().soundEngine.listener.setGain(0);
				}
			}
		}
	}

	public static void syncPatchouliBooks(ArrayList<ResourceLocation> books) {
		AdventGuiTabLore.syncBooks(books);
	}

	public static void adjustPlayerMovement(@Nullable Float x, @Nullable Float y, @Nullable Float z, UpdateClientMovementPacket.Operation operation) {
		PlayerEntity player = Minecraft.getInstance().player;
		Vector3d velocity = player.getDeltaMovement();

		switch (operation) {
			case SET:
				player.setDeltaMovement(x != null ? x : velocity.x(), y != null ? y : velocity.y(), z != null ? z : velocity.z());
				break;
			case ADD:
				player.setDeltaMovement(velocity.add(x != null ? x : 0, y != null ? y : 0, z != null ? z : 0));
				break;
			case MULTIPLY:
				player.setDeltaMovement(velocity.multiply(x != null ? x : 1, y != null ? y : 1, z != null ? z : 1));
				break;
			case MAX:
				player.setDeltaMovement(x != null ? Math.min(x, velocity.x()) : velocity.x(), y != null ? Math.min(y, velocity.y()) : velocity.y(), z != null ? Math.min(z, velocity.z()) : velocity.z());
				break;
			case MIN:
				player.setDeltaMovement(x != null ? Math.max(x, velocity.x()) : velocity.x(), y != null ? Math.max(y, velocity.y()) : velocity.y(), z != null ? Math.max(z, velocity.z()) : velocity.z());
				break;
		}
	}

	public static boolean harvestAdditionalBlock(BlockPos breakPos) {
		if (Minecraft.getInstance().gameMode == null)
			return false;

		return Minecraft.getInstance().gameMode.destroyBlock(breakPos);
	}

	public static ITextComponent getPlayerName() {
		return Minecraft.getInstance().player.getDisplayName();
	}

	public static void addParticle(IParticleData particle, double x, double y, double z, double velocityX, double velocityY, double velocityZ, int amount) {
		ClientWorld level = Minecraft.getInstance().level;

		for (int i = 0; i < amount; i++) {
			try {
				level.addParticle(particle, false, x, y, z, velocityX, velocityY, velocityZ);
			} catch (Exception ex) {
				Logging.logMessage(Level.WARN, "Unable to spawn particle " + particle, ex);
			}
		}
	}

	public static GameType getGameMode() {
		return Minecraft.getInstance().gameMode.getPlayerMode();
	}
}