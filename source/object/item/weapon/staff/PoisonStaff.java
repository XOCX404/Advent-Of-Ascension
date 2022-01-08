package net.tslat.aoa3.object.item.weapon.staff;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.object.entity.projectile.staff.BaseEnergyShot;
import net.tslat.aoa3.object.entity.projectile.staff.PoisonShotEntity;
import net.tslat.aoa3.util.DamageUtil;
import net.tslat.aoa3.util.EntityUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.PotionUtil;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;

public class PoisonStaff extends BaseStaff<Object> {
	public PoisonStaff(int durability) {
		super(durability);
	}

	@Nullable
	@Override
	public SoundEvent getCastingSound() {
		return AoASounds.ITEM_STAFF_CAST.get();
	}

	@Override
	protected void populateRunes(HashMap<Item, Integer> runes) {
		runes.put(AoAItems.WIND_RUNE.get(), 2);
		runes.put(AoAItems.POISON_RUNE.get(), 2);
	}

	@Override
	public void cast(World world, ItemStack staff, LivingEntity caster, Object args) {
		world.addFreshEntity(new PoisonShotEntity(caster, this, 60));
	}

	@Override
	public boolean doEntityImpact(BaseEnergyShot shot, Entity target, LivingEntity shooter) {
		if (DamageUtil.dealMagicDamage(shot, shooter, target, getDmg(), false)) {
			EntityUtil.applyPotions(target, new PotionUtil.EffectBuilder(Effects.POISON, 220));

			return true;
		}

		return false;
	}

	@Override
	public float getDmg() {
		return 10;
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		super.appendHoverText(stack, world, tooltip, flag);
	}
}