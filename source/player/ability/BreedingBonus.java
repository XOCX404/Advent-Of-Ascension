package net.tslat.aoa3.player.ability;

import com.google.gson.JsonObject;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import net.tslat.aoa3.common.registration.custom.AoAAbilities;
import net.tslat.aoa3.common.registration.custom.AoASkills;
import net.tslat.aoa3.player.skill.AoASkill;
import net.tslat.aoa3.util.PlayerUtil;

public class BreedingBonus extends ScalableModAbility {
	private static final ListenerType[] LISTENERS = new ListenerType[] {ListenerType.ANIMAL_BREED};

	public BreedingBonus(AoASkill.Instance skill, JsonObject data) {
		super(AoAAbilities.BREEDING_BONUS.get(), skill, data);
	}

	public BreedingBonus(AoASkill.Instance skill, CompoundTag data) {
		super(AoAAbilities.BREEDING_BONUS.get(), skill, data);
	}

	@Override
	public ListenerType[] getListenerTypes() {
		return LISTENERS;
	}

	@Override
	public void handleAnimalBreed(BabyEntitySpawnEvent ev) {
		if (testAsChance()) {
			Mob parentA = ev.getParentA();
			AgeableMob childB = (AgeableMob)ev.getChild().getType().create(parentA.level);

			childB.setBaby(true);
			childB.moveTo(parentA.getX(), parentA.getY(), parentA.getZ(), 0, 0);
			((ServerLevelAccessor)parentA.level).addFreshEntityWithPassengers(childB);
			PlayerUtil.giveXpToPlayer((ServerPlayer)ev.getCausedByPlayer(), AoASkills.FARMING.get(), PlayerUtil.getTimeBasedXpForLevel(PlayerUtil.getLevel(ev.getCausedByPlayer(), AoASkills.FARMING.get()), 3), false);
		}
	}
}