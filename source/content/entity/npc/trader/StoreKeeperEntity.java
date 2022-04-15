package net.tslat.aoa3.content.entity.npc.trader;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoADimensions;
import net.tslat.aoa3.common.registration.item.AoAItems;
import net.tslat.aoa3.content.entity.base.AoATrader;
import net.tslat.aoa3.library.builder.EffectBuilder;
import net.tslat.aoa3.library.builder.PotionBuilder;
import net.tslat.aoa3.util.WorldUtil;

import javax.annotation.Nullable;

public class StoreKeeperEntity extends AoATrader {
	private static final Int2ObjectMap<VillagerTrades.ItemListing[]> TRADES = new TradeListBuilder()
			.trades(1,
					BuildableTrade.trade(AoABlocks.VOX_GLASS, 32).cost(AoAItems.GOLD_COIN).xp(25),
					BuildableTrade.trade(AoAItems.COPPER_COIN, 16).cost(Items.POISONOUS_POTATO).xp(10),
					BuildableTrade.trade(AoAItems.COPPER_COIN, 8).cost(AoAItems.TOXIC_LUMP).xp(5))
			.trades(3,
					BuildableTrade.trade(poisonPotionStack()).cost(AoAItems.SILVER_COIN, 4).xp(20)).build();

	public StoreKeeperEntity(EntityType<? extends AoATrader> entityType, Level world) {
		super(entityType, world);
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return !WorldUtil.isWorld(level, AoADimensions.VOX_PONDS.key);
	}

	@Nullable
	@Override
	public Int2ObjectMap<VillagerTrades.ItemListing[]> getTradesMap() {
		return TRADES;
	}

	public static ItemStack poisonPotionStack() {
		return new PotionBuilder(Items.LINGERING_POTION).addEffect(new EffectBuilder(MobEffects.POISON, 600).build()).withTranslationKey("item.minecraft.lingering_potion.effect.poison").build();
	}
}