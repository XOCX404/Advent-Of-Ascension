package net.tslat.aoa3.entity.mob.voxponds;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.util.DamageUtil;

import javax.annotation.Nullable;

public class GrocculateEntity extends AoAMeleeMob {
    public GrocculateEntity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 2f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0.9;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 112;
    }

    @Override
    protected double getBaseMeleeDamage() {
        return 13;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.29;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return AoASounds.ENTITY_GROCCULATE_AMBIENT.get();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return AoASounds.ENTITY_GROCCULATE_DEATH.get();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return AoASounds.ENTITY_GROCCULATE_HURT.get();
    }

    @Nullable
    @Override
    protected SoundEvent getStepSound(BlockPos pos, BlockState blockState) {
        return AoASounds.ENTITY_GENERIC_VERY_HEAVY_STEP.get();
    }

    @Override
    protected void onAttack(Entity target) {
        if (target instanceof LivingEntity)
            DamageUtil.doBodySlamKnockback((LivingEntity)target, this, 10.5f, 1f, 10.5f);
    }
}
