<<<<<<< HEAD
package intricateoreprocessing;

public abstract class CommonProxy {

	public void preInit() {
	
	
		
		
		
		newBlock.StartupCommon.preInitCommon();
		poorDiamondOre.StartupCommon.preInitCommon();
		poorCoalOre.StartupCommon.preInitCommon();
		poorEmeraldOre.StartupCommon.preInitCommon();
		poorGoldOre.StartupCommon.preInitCommon();
		poorIronOre.StartupCommon.preInitCommon();
		poorLapisOre.StartupCommon.preInitCommon();
		poorRedstoneOre.StartupCommon.preInitCommon();
		richDiamondOre.StartupCommon.preInitCommon();
		richCoalOre.StartupCommon.preInitCommon();
		richEmeraldOre.StartupCommon.preInitCommon();
		richIronOre.StartupCommon.preInitCommon();
		richLapisOre.StartupCommon.preInitCommon();
		richGoldOre.StartupCommon.preInitCommon();
		richRedstoneOre.StartupCommon.preInitCommon();
		
		
		
		
		
	}	
	
	
	public void init() {
		
		newBlock.StartupCommon.initCommon();
		poorDiamondOre.StartupCommon.initCommon();
		poorCoalOre.StartupCommon.initCommon();
		poorEmeraldOre.StartupCommon.initCommon();
		poorGoldOre.StartupCommon.initCommon();
		poorIronOre.StartupCommon.initCommon();
		poorLapisOre.StartupCommon.initCommon();
		poorRedstoneOre.StartupCommon.initCommon();
		richDiamondOre.StartupCommon.initCommon();
		richCoalOre.StartupCommon.initCommon();
		richEmeraldOre.StartupCommon.initCommon();
		richIronOre.StartupCommon.initCommon();
		richLapisOre.StartupCommon.initCommon();
		richGoldOre.StartupCommon.initCommon();
		richRedstoneOre.StartupCommon.initCommon();
		
		
	}
	
	
	public void postInit() {
		
		
		newBlock.StartupCommon.postInitCommon();
		poorDiamondOre.StartupCommon.postInitCommon();
		poorCoalOre.StartupCommon.postInitCommon();
		poorEmeraldOre.StartupCommon.postInitCommon();
		poorGoldOre.StartupCommon.postInitCommon();
		poorIronOre.StartupCommon.postInitCommon();
		poorLapisOre.StartupCommon.postInitCommon();
		poorRedstoneOre.StartupCommon.postInitCommon();
		richDiamondOre.StartupCommon.postInitCommon();
		richCoalOre.StartupCommon.postInitCommon();
		richIronOre.StartupCommon.postInitCommon();
		richLapisOre.StartupCommon.postInitCommon();
		richEmeraldOre.StartupCommon.postInitCommon();
		richGoldOre.StartupCommon.postInitCommon();
		richRedstoneOre.StartupCommon.postInitCommon();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
=======
package intricateoreprocessing;

//import basicCrusher.TileEntityBasicCrusher;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy {

	//Really no idea here.
//	NetworkRegistry.INSTANCE.registerGuiHandler(Intricateoreprocessing.instance, 
//		      new GuiHandler());  
	
	
	public void preInit() {
	
	
//		GameRegistry.registerTileEntity(TileEntityBasicCrusher.class, "tileEntityBasicCrusher");       
		
		
		newBlock.StartupCommon.preInitCommon();
		poorDiamondOre.StartupCommon.preInitCommon();
		basicCrusher.StartupCommon.preInitCommon();
		richDiamondOre.StartupCommon.preInitCommon();
		richRedstoneOre.StartupCommon.preInitCommon();
		
		
		
		
		
	}	
	
	
	public void init() {
		
		newBlock.StartupCommon.initCommon();
		poorDiamondOre.StartupCommon.initCommon();
		basicCrusher.StartupCommon.initCommon();
		richDiamondOre.StartupCommon.initCommon();
		richRedstoneOre.StartupCommon.initCommon();
		
		
	}
	
	
	public void postInit() {
		
		
		newBlock.StartupCommon.postInitCommon();
		poorDiamondOre.StartupCommon.postInitCommon();
		basicCrusher.StartupCommon.postInitCommon();
		richDiamondOre.StartupCommon.postInitCommon();
		richRedstoneOre.StartupCommon.postInitCommon();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
>>>>>>> 353bcad194114ce4cfeaa102bcbe64cd48d589f1