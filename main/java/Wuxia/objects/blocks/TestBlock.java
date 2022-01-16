package Wuxia.objects.blocks;

import Wuxia.Wuxia;
import Wuxia.init.BlockInit;
import Wuxia.init.ItemInit;
import Wuxia.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.gen.structure.template.Template.BlockInfo;

public class TestBlock extends Block implements IHasModel{

	public TestBlock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Wuxia.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
