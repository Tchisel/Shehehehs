package Wuxia.objects.blocks.flowers;

import javax.annotation.meta.When;

import Wuxia.Wuxia;
import Wuxia.init.BlockInit;
import Wuxia.init.ItemInit;
import Wuxia.util.IHasModel;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item.ToolMaterial;

public class FlowerBase extends BlockBush implements IHasModel{
	
	public FlowerBase(String name, CreativeTabs tab) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		Wuxia.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}



}
