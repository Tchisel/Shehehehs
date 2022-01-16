package Wuxia.objects.items;

import Wuxia.Wuxia;
import Wuxia.init.ItemInit;
import Wuxia.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class AxeTest extends ItemAxe implements IHasModel{

	public AxeTest(String name, ToolMaterial material) {
		super(material, 3.0f, 1.0f);
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
