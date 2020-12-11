package net.tslat.aoa3.client.render.entity.projectile.mob;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tslat.aoa3.client.render.entity.projectile.ParticleProjectileRenderer;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.mob.OmnilightShotEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

public class OmnilightShotRenderer extends ParticleProjectileRenderer<OmnilightShotEntity> {
	public OmnilightShotRenderer(final EntityRendererManager manager) {
		super(manager);
	}

	@Override
	protected void addParticles(OmnilightShotEntity entity, float partialTicks) {
		entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(0, 255, 255)), entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0, 0);
		entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(255, 255, 0)), entity.getPosX(), entity.getPosY() + 0.25, entity.getPosZ(), 0, 0, 0);
		entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(255, 255, 255)), entity.getPosX(), entity.getPosY() - 0.25, entity.getPosZ(), 0, 0, 0);
	}
}
