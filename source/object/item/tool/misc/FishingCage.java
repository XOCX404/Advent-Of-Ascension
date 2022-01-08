package net.tslat.aoa3.object.item.tool.misc;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.object.entity.misc.FishingCageEntity;
import net.tslat.aoa3.util.LocaleUtil;

import javax.annotation.Nullable;
import java.util.List;

public class FishingCage extends Item {
	public FishingCage(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public ActionResult<ItemStack> use(World level, PlayerEntity player, Hand hand) {
		ItemStack stack = player.getItemInHand(hand);

		if (!level.isClientSide()) {
			level.addFreshEntity(new FishingCageEntity(level, player, stack));
			stack.shrink(1);
		}

		return ActionResult.sidedSuccess(stack, level.isClientSide());
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable World pLevel, List<ITextComponent> tooltip, ITooltipFlag pFlag) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.GENERAL_INFO, 1));
	}
}