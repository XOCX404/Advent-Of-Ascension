package net.tslat.aoa3.worldgen.worlds.lborean;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraftforge.client.IRenderHandler;
import net.tslat.aoa3.common.registration.AoABiomes;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoAWorldGen;
import net.tslat.aoa3.worldgen.chunkgenerator.AdjustableOceanChunkBuilder;

import javax.annotation.Nullable;

public class LBoreanDimension extends Dimension {
	public LBoreanDimension(World world, DimensionType dimType) {
		super(world, dimType, 0);
	}

	@Override
	public ChunkGenerator<? extends GenerationSettings> createChunkGenerator() {
		ChunkGeneratorType<OverworldGenSettings, AdjustableOceanChunkBuilder> chunkGeneratorType = AoAWorldGen.ChunkGeneratorTypes.ADJUSTABLE_OCEAN.get();
		BiomeProviderType<SingleBiomeProviderSettings, SingleBiomeProvider> biomeProviderType = BiomeProviderType.FIXED;
		BiomeProvider biomeProvider = biomeProviderType.create(biomeProviderType.createSettings(world.getWorldInfo()).setBiome(AoABiomes.LBOREAN.get()));
		BlockState fillerBlock = AoABlocks.CORAL_ROCK.get().getDefaultState();
		BlockState liquidBlock = Blocks.AIR.getDefaultState();
		OverworldGenSettings settings = chunkGeneratorType.createSettings();

		settings.setDefaultBlock(fillerBlock);
		settings.setDefaultFluid(liquidBlock);

		return chunkGeneratorType.create(world, biomeProvider, settings);
	}

	@Nullable
	@Override
	public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid) {
		return null;
	}

	@Nullable
	@Override
	public BlockPos findSpawn(int posX, int posZ, boolean checkValid) {
		return null;
	}

	@Override
	public float getCloudHeight() {
		return -1000f;
	}

	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0.0F;
	}

	@Override
	public boolean isSurfaceWorld() {
		return true;
	}

	@Override
	public int getSeaLevel() {
		return 0;
	}

	@Override
	public Vec3d getFogColor(float celestialAngle, float partialTicks) {
		float f2 = MathHelper.clamp(MathHelper.cos(celestialAngle * (float)Math.PI * 2.0F) * 2.0F + 0.5F, 1.5f, 5f);
		float f3 = 0.114F * f2;
		float f4 = 0.321F * f2;
		float f5 = 1.93F * f2;
		return new Vec3d(f3, f4, f5);
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public boolean doesXZShowFog(int x, int z) {
		return false;
	}

	@Nullable
	@Override
	public IRenderHandler getSkyRenderer() {
		return (ticks, partialTicks, world, mc) -> {};
	}

	@Nullable
	@Override
	public IRenderHandler getCloudRenderer() {
		return (ticks, partialTicks, world, mc) -> {};
	}

	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}

	@Override
	public boolean canDoLightning(Chunk chunk) {
		return false;
	}
}
