package net.tslat.aoa3.content.block.generation.plants;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.tslat.aoa3.util.BlockUtil;

public class VinesBlock extends VineBlock {
	public VinesBlock(MaterialColor mapColour) {
		super(new BlockUtil.CompactProperties(Material.REPLACEABLE_PLANT, mapColour).stats(0.2f, 0f).sound(SoundType.GRASS).noClip().randomTicks().get());
	}

	public BlockState getStateForPosition(LevelAccessor world, BlockPos pos) {
		BlockState state = defaultBlockState();
		boolean attached = false;

		 if (VineBlock.isAcceptableNeighbour(world, pos.relative(Direction.UP), Direction.UP)) {
			 state = state.setValue(UP, true);
			 attached = true;
		 }

		 if (VineBlock.isAcceptableNeighbour(world, pos.relative(Direction.NORTH), Direction.NORTH)) {
		 	state = state.setValue(NORTH, true);
			 attached = true;
		 }

		 if (VineBlock.isAcceptableNeighbour(world, pos.relative(Direction.SOUTH), Direction.SOUTH)) {
		 	state = state.setValue(SOUTH, true);
			 attached = true;
		 }

		 if (VineBlock.isAcceptableNeighbour(world, pos.relative(Direction.EAST), Direction.EAST)) {
		 	state = state.setValue(EAST, true);
			 attached = true;
		 }

		 if (VineBlock.isAcceptableNeighbour(world, pos.relative(Direction.WEST), Direction.WEST)) {
		 	state = state.setValue(WEST, true);
			 attached = true;
		 }

		 if (!attached) {
		 	BlockState upState = world.getBlockState(pos.above());

		 	if (upState.getBlock() == this)
		 		return upState;
		 }

		 return state;
	}
}
