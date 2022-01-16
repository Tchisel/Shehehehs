package Wuxia.init;

import Wuxia.generator.FlowerGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGen {
	 public static void registerWorldGenerators()
	    {
	        // DEBUG
	        System.out.println("Registering world generators");
	        GameRegistry.registerWorldGenerator((IWorldGenerator) new FlowerGenerator(), 10);
	    }
}
