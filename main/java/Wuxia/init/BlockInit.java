package Wuxia.init;

import java.util.ArrayList;
import java.util.List;

import Wuxia.objects.blocks.TestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//New Block - 1
	public static final Block TEST_BLOCK = new TestBlock("test_block", Material.CLAY);
	public static final Block TEST_FLOWER = new TestBlock("test_flower", Material.VINE);
}
