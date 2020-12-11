package net.tslat.aoa3.block.functional.sapling;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.tslat.aoa3.block.decoration.sapling.SaplingBlock;
import net.tslat.aoa3.block.generation.leaves.LeavesBlock;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.util.RandomUtil;
import net.tslat.aoa3.worldgen.trees.CelevusTreeGenerator;
import net.tslat.aoa3.worldgen.trees.TreeGenerator;

import java.util.Random;

public class GreenCelevusSapling extends SaplingBlock {
	public GreenCelevusSapling() {
		super(MaterialColor.FOLIAGE, false);
	}

	@Override
	protected TreeGenerator getTree(ServerWorld world, BlockPos pos, BlockState groundBlock, Random rand) {
		return new CelevusTreeGenerator(this, (LeavesBlock)AoABlocks.GREEN_CELEVUS_LEAVES.get(), RandomUtil.RANDOM.source());
	}
}
