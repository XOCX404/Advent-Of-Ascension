package net.tslat.aoa3.entity.npc.skillmaster;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAArmour;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.entity.npc.AoATraderRecipe;

public class AuguryMasterEntity extends AoASkillMaster {
	public AuguryMasterEntity(EntityType<? extends CreatureEntity> entityType, World world) {
		super(entityType, world);
	}

	@Override
	protected void getTradesList(final NonNullList<AoATraderRecipe> newTradesList) {
		newTradesList.add(new AoATraderRecipe(new ItemStack(AoAItems.LUNAVER_COIN.get()), new ItemStack(AoAArmour.AUGURY_ARMOUR.helmet.get())));
		newTradesList.add(new AoATraderRecipe(new ItemStack(AoAItems.LUNAVER_COIN.get()), new ItemStack(AoAArmour.AUGURY_ARMOUR.chestplate.get())));
		newTradesList.add(new AoATraderRecipe(new ItemStack(AoAItems.LUNAVER_COIN.get()), new ItemStack(AoAArmour.AUGURY_ARMOUR.leggings.get())));
		newTradesList.add(new AoATraderRecipe(new ItemStack(AoAItems.LUNAVER_COIN.get()), new ItemStack(AoAArmour.AUGURY_ARMOUR.boots.get())));
	}
}
