package net.tslat.aoa3.object.entity.projectile.blaster;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.object.entity.projectile.staff.BaseEnergyShot;
import net.tslat.aoa3.object.item.EnergyProjectileWeapon;

public class SoulDrainerShotEntity extends BaseEnergyShot {
	public SoulDrainerShotEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}
	
	public SoulDrainerShotEntity(World world) {
		super(AoAEntities.Projectiles.SOUL_DRAINER_SHOT.get(), world);
	}

	public SoulDrainerShotEntity(LivingEntity shooter, EnergyProjectileWeapon weapon, int maxAge) {
		super(AoAEntities.Projectiles.SOUL_DRAINER_SHOT.get(), shooter, weapon, maxAge);
	}

	public SoulDrainerShotEntity(World world, double x, double y, double z) {
		super(AoAEntities.Projectiles.SOUL_DRAINER_SHOT.get(), world, x, y, z);
	}
}