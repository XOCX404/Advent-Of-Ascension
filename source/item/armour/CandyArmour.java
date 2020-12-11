package net.tslat.aoa3.item.armour;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Food;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.player.PlayerDataManager;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;

public class CandyArmour extends AdventArmour {
	public CandyArmour(EquipmentSlotType slot) {
		super(ItemUtil.customArmourMaterial("aoa3:candy", 59, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5), slot);
	}

	@Override
	public AdventArmour.Type setType() {
		return AdventArmour.Type.CANDY;
	}

	@Override
	public void onEffectTick(PlayerDataManager plData, @Nullable HashSet<EquipmentSlotType> slots) {
		if (plData.player().getFoodStats().needFood()) {
			if (slots == null || plData.equipment().isCooledDown("candy_armour")) {
				if (findAndConsumeFood(plData.player()))
					plData.equipment().setCooldown("candy_armour", 12000 / (slots == null ? 4 : slots.size()));
			}
		}
	}

	private boolean findAndConsumeFood(PlayerEntity player) {
		for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
			ItemStack stack = player.inventory.getStackInSlot(i);

			if (stack.getItem().isFood()) {
				Food food = stack.getItem().getFood();

				if (food.getHealing() > 0 && food.getSaturation() > 0) {
					player.inventory.setInventorySlotContents(i, stack.getItem().onItemUseFinish(stack, player.world, player));

					return true;
				}
			}
		}

		return false;
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText("item.aoa3.candy_armour.desc.1", LocaleUtil.ItemDescriptionType.BENEFICIAL));
		tooltip.add(pieceEffectHeader());
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText("item.aoa3.candy_armour.desc.2", LocaleUtil.ItemDescriptionType.BENEFICIAL));
		tooltip.add(setEffectHeader());
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText("item.aoa3.candy_armour.desc.3", LocaleUtil.ItemDescriptionType.BENEFICIAL));
	}
}
