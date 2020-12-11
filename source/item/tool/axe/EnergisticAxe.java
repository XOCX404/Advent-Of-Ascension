package net.tslat.aoa3.item.tool.axe;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.tslat.aoa3.capabilities.persistentstack.PersistentStackCapabilityHandles;
import net.tslat.aoa3.capabilities.persistentstack.PersistentStackCapabilityProvider;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.constant.Resources;
import net.tslat.aoa3.util.player.PlayerDataManager;
import net.tslat.aoa3.util.player.PlayerUtil;

import javax.annotation.Nullable;
import java.util.List;

public class EnergisticAxe extends BaseAxe {
	public EnergisticAxe() {
		super(ItemUtil.customItemTier(2000, 11.0f, 6.0f, 6, 10, null));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		float speed = super.getDestroySpeed(stack, state);

		if (speed != 1.0f && hasEnergy(stack))
			return speed * 3f;

		return speed;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entity) {
		PersistentStackCapabilityHandles cap = getCapability(stack);

		if (super.getDestroySpeed(stack, state) != 1.0f)
			cap.setValue(Math.max(0, cap.getValue() - 5));

		return super.onBlockDestroyed(stack, world, state, pos, entity);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		if (!world.isRemote) {
			PersistentStackCapabilityHandles cap = getCapability(player.getHeldItem(hand));
			PlayerDataManager plData = PlayerUtil.getAdventPlayer((ServerPlayerEntity)player);
			float storeAmount = MathHelper.clamp(2000f - cap.getValue(), 0, Math.min(20, plData.stats().getResourceValue(Resources.ENERGY)));

			cap.setValue(cap.getValue() + storeAmount);
			plData.stats().consumeResource(Resources.ENERGY, storeAmount, true);

			return ActionResult.resultSuccess(player.getHeldItem(hand));
		}

		return super.onItemRightClick(world, player, hand);
	}

	private boolean hasEnergy(ItemStack stack) {
		return getCapability(stack).getValue() >= 5;
	}

	@Nullable
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) {
		return new PersistentStackCapabilityProvider(null);
	}

	@Nullable
	@Override
	public CompoundNBT getShareTag(ItemStack stack) {
		CompoundNBT tag = super.getShareTag(stack);

		if (tag == null)
			tag = new CompoundNBT();

		tag.putFloat("AoAEnergyStored", getCapability(stack).getValue());

		return tag;
	}

	@Override
	public void readShareTag(ItemStack stack, @Nullable CompoundNBT nbt) {
		if (nbt != null && nbt.contains("AoAEnergyStored"))
			getCapability(stack).setValue(Math.min(2000, nbt.getFloat("AoAEnergyStored")));

		super.readShareTag(stack, nbt);
	}

	public static PersistentStackCapabilityHandles getCapability(ItemStack stack) {
		return PersistentStackCapabilityProvider.getOrDefault(stack, null);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText("items.description.tool.energisticCharge", LocaleUtil.ItemDescriptionType.NEUTRAL));

		PersistentStackCapabilityHandles cap = getCapability(stack);

		tooltip.add(LocaleUtil.getFormattedItemDescriptionText("items.description.tool.energisticStorage", LocaleUtil.ItemDescriptionType.NEUTRAL,  Integer.toString((int)cap.getValue())));
	}
}
