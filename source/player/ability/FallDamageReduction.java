package net.tslat.aoa3.player.ability;

import com.google.gson.JsonObject;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.tslat.aoa3.common.registration.custom.AoAAbilities;
import net.tslat.aoa3.player.skill.AoASkill;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.NumberUtil;

public class FallDamageReduction extends AoAAbility.Instance {
	private static final ListenerType[] LISTENERS = new ListenerType[] {ListenerType.PLAYER_FALL};

	private final int minHeight;
	private final int maxHeight;
	private final float baseReduction;
	private final float perLevelReduction;

	public FallDamageReduction(AoASkill.Instance skill, JsonObject data) {
		super(AoAAbilities.FALL_DAMAGE_REDUCTION.get(), skill, data);

		this.minHeight = JSONUtils.getAsInt(data, "min_height", 0);
		this.maxHeight = JSONUtils.getAsInt(data, "max_height", Integer.MAX_VALUE);
		this.baseReduction = JSONUtils.getAsFloat(data, "base_reduction", 0);
		this.perLevelReduction = JSONUtils.getAsFloat(data, "per_level_reduction", 0);
	}

	public FallDamageReduction(AoASkill.Instance skill, CompoundNBT data) {
		super(AoAAbilities.FALL_DAMAGE_REDUCTION.get(), skill, data);

		this.minHeight = data.getInt("min_height");
		this.maxHeight = data.getInt("max_height");
		this.baseReduction = data.getFloat("base_reduction");
		this.perLevelReduction = data.getFloat("per_level_reduction");
	}

	@Override
	protected void updateDescription(TranslationTextComponent defaultDescription) {
		String key = defaultDescription.getKey();

		if (minHeight > 0) {
			if (maxHeight == Integer.MAX_VALUE)
				key += ".min";
		}
		else if (maxHeight < Integer.MAX_VALUE) {
			key += ".max";
		}

		super.updateDescription(new TranslationTextComponent(key,
				minHeight - 1,
				maxHeight,
				LocaleUtil.getAbilityValueDesc(
						baseReduction != 0,
						perLevelReduction != 0,
						true,
						NumberUtil.roundToNthDecimalPlace(baseReduction * 100, 2),
						NumberUtil.roundToNthDecimalPlace(perLevelReduction * 100, 2))
		));
	}

	@Override
	public ListenerType[] getListenerTypes() {
		return LISTENERS;
	}

	@Override
	public void handlePlayerFall(LivingFallEvent ev) {
		if (ev.getDistance() >= minHeight && ev.getDistance() <= maxHeight) {
			ev.setDamageMultiplier(Math.max(0, ev.getDamageMultiplier() * (1 - Math.min(1, baseReduction + skill.getLevel(false) * perLevelReduction))));

			if (ev.getDamageMultiplier() * ev.getDistance() < 1)
				ev.setDamageMultiplier(0);
		}
	}

	@Override
	public CompoundNBT getSyncData(boolean forClientSetup) {
		CompoundNBT data = super.getSyncData(forClientSetup);

		if (forClientSetup) {
			data.putInt("min_height", this.minHeight);
			data.putInt("max_height", this.maxHeight);
			data.putFloat("base_reduction", this.baseReduction);
			data.putFloat("per_level_reduction", this.perLevelReduction);
		}

		return data;
	}
}