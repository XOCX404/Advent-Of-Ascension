package net.tslat.aoa3.player.ability;

import com.google.gson.JsonObject;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.tslat.aoa3.common.registration.custom.AoAAbilities;
import net.tslat.aoa3.event.custom.events.ItemSmeltingEvent;
import net.tslat.aoa3.player.skill.AoASkill;

import java.util.Random;

public class BonusSmeltResult extends ScalableModAbility {
	private static final ListenerType[] LISTENERS = new ListenerType[] {ListenerType.ITEM_SMELTING};

	private final Random random = new Random();

	public BonusSmeltResult(AoASkill.Instance skill, JsonObject data) {
		super(AoAAbilities.BONUS_SMELT_RESULT.get(), skill, data);
	}

	public BonusSmeltResult(AoASkill.Instance skill, CompoundTag data) {
		super(AoAAbilities.BONUS_SMELT_RESULT.get(), skill, data);
	}

	@Override
	public ListenerType[] getListenerTypes() {
		return LISTENERS;
	}

	@Override
	public void handleItemSmelting(ItemSmeltingEvent ev) {
		ItemStack smeltedStack = ev.getOutputStack();

		if (smeltedStack.getItem().getFoodProperties() == null) {
			random.setSeed(ev.getPlayer().tickCount);

			if (random.nextFloat() < getScaledValue())
				smeltedStack.setCount(smeltedStack.getCount() + 1);
		}
	}
}