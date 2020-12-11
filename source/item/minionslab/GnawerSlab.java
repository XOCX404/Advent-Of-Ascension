package net.tslat.aoa3.item.minionslab;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.minion.AoAMinion;
import net.tslat.aoa3.entity.minion.GnawerEntity;

public class GnawerSlab extends BaseSlab {
	public GnawerSlab() {
		super(60, 180, 60, 2000);
	}

	@Override
	public AoAMinion activateSlab(PlayerEntity pl, ItemStack stack) {
		GnawerEntity gnawer = new GnawerEntity(AoAEntities.Minions.GNAWER.get(), pl.world);

		gnawer.setPositionAndUpdate(pl.getPosX(), pl.getPosY(), pl.getPosZ());
		gnawer.setTamedBy(pl);
		pl.world.addEntity(gnawer);

		return gnawer;
	}
}
