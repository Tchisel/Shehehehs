package Wuxia.generator;

import java.util.Random;

import Wuxia.init.BlockInit;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class FlowerDecorator extends BiomeDecorator{
	protected FlowerGenerator flowerGen;
	
	public FlowerDecorator() {
		super();
		}
	 private void generateFlowers(World worldIn, Biome biomeIn, Random random, BlockPos chunkPos)
	    {
	        if(TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.FLOWERS))
	        for (int numFlowersGenerated = 0; numFlowersGenerated < flowersPerChunk; ++numFlowersGenerated)
	        {
	            int flowerX = random.nextInt(16) + 8;
	            int flowerZ = random.nextInt(16) + 8;
	            int yRange = worldIn.getHeight(chunkPos.add(flowerX, 0, flowerZ)).getY() + 32;

	            flowerGen = new FlowerGenerator();
	            
	            if (yRange > 0)
	            {
	                int flowerY = random.nextInt(yRange);
	                BlockPos flowerBlockPos = chunkPos.add(flowerX, flowerY, flowerZ);
	                flowerGen.generate(worldIn, random, flowerBlockPos);
	            }
	        }
	    }
	
}
