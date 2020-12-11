package net.tslat.aoa3.entity.projectile.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.base.AoAFlyingRangedMob;

public class ValkyrieShotEntity extends BaseMobProjectile {
	public ValkyrieShotEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}

	public ValkyrieShotEntity(World world) {
		super(AoAEntities.Projectiles.VALKYRIE_SHOT.get(), world);
	}

	public ValkyrieShotEntity(AoAFlyingRangedMob shooter, Type projectileType) {
		super(AoAEntities.Projectiles.VALKYRIE_SHOT.get(), shooter.world, shooter, projectileType);
	}

	@Override
	public float getGravityVelocity() {
		return 0;
	}
}
