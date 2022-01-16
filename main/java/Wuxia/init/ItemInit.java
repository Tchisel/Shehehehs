package Wuxia.init;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

import Wuxia.objects.items.AxeTest;
import Wuxia.objects.items.HoeTest;
import Wuxia.objects.items.ItemTest;
import Wuxia.objects.items.PickaxeTest;
import Wuxia.objects.items.ShovelTest;
import Wuxia.objects.items.SwordTest;
import Wuxia.objects.items.TestArmour;
import Wuxia.util.References;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//NewItem-1
	public static final Item TEST_ITEM = new ItemTest("test_item");
	
	public static final ToolMaterial TEST_TOOLMATERIAL = EnumHelper.addToolMaterial("test_toolmaterial", 2, 250, 6.0f, 2.0f, 14);
	public static final ArmorMaterial TEST_ARMORMATERIAL = EnumHelper.addArmorMaterial("test_armormaterial", References.MODID + ":test", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final Item TEST_HELMET = new TestArmour("test_helmet", TEST_ARMORMATERIAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item TEST_CHESTPLATE = new TestArmour("test_chestplate", TEST_ARMORMATERIAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item TEST_LEGS = new TestArmour("test_legs", TEST_ARMORMATERIAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item TEST_BOOTS = new TestArmour("test_boots", TEST_ARMORMATERIAL, 1, EntityEquipmentSlot.FEET);
	
	public static final Item TEST_PICKAXE = new PickaxeTest("test_pickaxe", TEST_TOOLMATERIAL);
	public static final Item TEST_AXE = new AxeTest("test_axe", TEST_TOOLMATERIAL);
	public static final Item TEST_SHOVEL = new ShovelTest("test_shovel", TEST_TOOLMATERIAL);
	public static final Item TEST_HOE = new HoeTest("test_hoe", TEST_TOOLMATERIAL);
	public static final Item TEST_SWORD = new SwordTest("test_sword", TEST_TOOLMATERIAL);
}
