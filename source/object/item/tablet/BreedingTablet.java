package net.tslat.aoa3.object.item.tablet;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.object.entity.tablet.BreedingTabletEntity;
import net.tslat.aoa3.object.entity.tablet.SoulTabletEntity;
import net.tslat.aoa3.util.LocaleUtil;

import javax.annotation.Nullable;
import java.util.List;

public class BreedingTablet extends TabletItem {
	public BreedingTablet() {
		super(75f, 0.51f, 29, 15);
	}

	@Override
	protected SoulTabletEntity getTabletEntity(World world, ServerPlayerEntity placer) {
		return new BreedingTabletEntity(AoAEntities.Misc.BREEDING_TABLET.get(), world, placer);
	}


	@Override
	public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
	}
}