package Wuxia.objects.items;

import Wuxia.Wuxia;
import Wuxia.init.ItemInit;
import Wuxia.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item implements IHasModel
{
	public ItemTest(String name) {
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
