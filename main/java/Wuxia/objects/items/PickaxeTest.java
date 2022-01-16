package Wuxia.objects.items;

import Wuxia.Wuxia;
import Wuxia.init.ItemInit;
import Wuxia.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class PickaxeTest extends ItemPickaxe implements IHasModel{
	public PickaxeTest(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() {
		Wuxia.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
