package Wuxia;

import Wuxia.proxy.CommonProxy;
import Wuxia.util.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Wuxia {
	@Instance
	public static Wuxia instance;
	
	@SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		
    }
	@EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }
	@EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
