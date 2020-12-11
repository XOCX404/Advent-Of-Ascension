package net.tslat.aoa3.entity.mob.dustopia;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;

import javax.annotation.Nullable;

public class ArkzyneEntity extends AoAMeleeMob {
    public ArkzyneEntity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 2.5f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0.4d;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 135;
    }

    @Override
    protected double getBaseMeleeDamage() {
        return 15.5d;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.2875;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return AoASounds.ENTITY_ARKZYNE_AMBIENT.get();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return AoASounds.ENTITY_ARKZYNE_DEATH.get();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return AoASounds.ENTITY_ARKZYNE_HURT.get();
    }
}
