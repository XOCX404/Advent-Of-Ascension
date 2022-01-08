package net.tslat.aoa3.client.render.entity.projectile.mob;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tslat.aoa3.client.render.entity.projectile.ParticleProjectileRenderer;
import net.tslat.aoa3.common.particletype.CustomisableParticleType;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.object.entity.projectile.mob.BlueGuardianShotEntity;
import net.tslat.aoa3.util.ColourUtil;

public class BlueGuardianShotRenderer extends ParticleProjectileRenderer<BlueGuardianShotEntity> {
	public BlueGuardianShotRenderer(final EntityRendererManager manager) {
		super(manager);
	}

	@Override
	protected void addParticles(BlueGuardianShotEntity entity, float partialTicks) {
		entity.level.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, ColourUtil.BLUE), entity.getX(), entity.getY(), entity.getZ(), 0, 0, 0);
	}
}