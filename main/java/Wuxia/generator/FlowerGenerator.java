package Wuxia.generator;

import java.util.Random;

import Wuxia.init.BlockInit;
import Wuxia.init.ItemInit;
import Wuxia.objects.blocks.flowers.FlowerBase;
import net.minecraft.block.BlockBush;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class FlowerGenerator extends WorldGenerator implements IWorldGenerator{

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		
		BlockBush test_flower = (BlockBush) BlockInit.TEST_FLOWER;
		for(int i = 0; i < 64; i++){
			 BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

	            if (worldIn.isAirBlock(blockpos) && (blockpos.getY() < 255) && test_flower.canBlockStay(worldIn, blockpos, test_flower.getDefaultState()))
	            {
	                worldIn.setBlockState(blockpos, test_flower.getDefaultState(), 2);
	            }
	        }
		
		
		return true;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}

}
