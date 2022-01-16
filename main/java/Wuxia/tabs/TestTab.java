package Wuxia.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import Wuxia.init.ItemInit;

public class TestTab extends CreativeTabs{

	public TestTab(String label) {
		super("testtab");
		this.setBackgroundImageName("testtab.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.TEST_ITEM);
	}

}
