package net.tslat.aoa3.entity.mob.overworld.lunarinvasion;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.event.dimension.OverworldEvents;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class WalkerEntity extends AoAMeleeMob {
	public WalkerEntity(EntityType<? extends MonsterEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 1.75f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 0d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 45;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 3.5;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.25;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_WALKER_AMBIENT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_WALKER_DEATH.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_WALKER_HURT.get();
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}

	@Override
	protected void onAttack(Entity target) {
		if (!world.isRemote)
			target.setFire(30);
	}

	@Nonnull
	@Override
	protected OverworldEvents.Event getEventRequirement() {
		return OverworldEvents.Event.LUNAR_INVASION;
	}
}
