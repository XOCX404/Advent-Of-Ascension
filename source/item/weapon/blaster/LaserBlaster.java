package net.tslat.aoa3.item.weapon.blaster;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.projectile.blaster.LaserShotEntity;

import javax.annotation.Nullable;

public class LaserBlaster extends BaseBlaster {
	public LaserBlaster(double dmg, int durability, int fireDelayTicks, float energyCost) {
		super(dmg, durability, fireDelayTicks, energyCost);
	}

	@Nullable
	@Override
	public SoundEvent getFiringSound() {
		return AoASounds.ITEM_ILLUSION_SMG_FIRE.get();
	}

	@Override
	public void fire(ItemStack blaster, LivingEntity shooter) {
		shooter.world.addEntity(new LaserShotEntity(shooter, this, 60));
	}
}
