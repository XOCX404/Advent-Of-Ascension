package net.tslat.aoa3.player.skill;

import com.google.gson.JsonObject;
import net.minecraft.nbt.CompoundNBT;
import net.tslat.aoa3.common.registration.custom.AoASkills;
import net.tslat.aoa3.player.ServerPlayerDataManager;

public class FarmingSkill extends AoASkill.Instance {
	public FarmingSkill(ServerPlayerDataManager plData, JsonObject jsonData) {
		super(AoASkills.FARMING.get(), plData, jsonData);
	}

	public FarmingSkill(CompoundNBT nbtData) {
		super(AoASkills.FARMING.get(), nbtData);
	}
}