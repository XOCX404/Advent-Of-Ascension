package net.tslat.aoa3.entity.mob.overworld;

import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class ShadeEntity extends AoAMeleeMob {
	public ShadeEntity(EntityType<? extends MonsterEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 1.5f;
	}

	@Override
	protected double getBaseKnockbackResistance() {
		return 1d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 15;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 4;
	}

	@Override
	protected double getBaseMovementSpeed() {
		return 0.23d;
	}

	@Override
	public int getMaxSpawnHeight() {
		return 30;
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return AoASounds.ENTITY_SHADE_AMBIENT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AoASounds.ENTITY_SHADE_DEATH.get();
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return AoASounds.ENTITY_SHADE_HURT.get();
	}

	@Override
	public CreatureAttribute getCreatureAttribute() {
		return CreatureAttribute.UNDEAD;
	}

	@Override
	public boolean addPotionEffect(EffectInstance effect) {
		return false;
	}

	@Override
	public boolean canBeHitWithPotion() {
		return false;
	}

	@Override
	protected boolean isOverworldMob() {
		return true;
	}
}
