package intricateoreprocessing;

import copperItems.Calcine;
import copperItems.Chalcopyrite;
import copperItems.CopperIngot;
import copperItems.CopperMatte;
import copperItems.GroundCopper;
import copperItems.GroundIron;
import copperItems.Hammer;
import copperItems.IronLump;
import copperItems.IronSlag;
import copperItems.LimestoneShard;
import copperItems.RoughDiamond;
import copperItems.Sandpaper;
import copperItems.UncutDiamond;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item calcine;
	public static Item limestoneShard;
	public static Item chalcopyrite;
	public static Item groundCopper;
	public static Item copperIngot;
	public static Item copperMatte;
	public static Item groundIron;
	public static Item ironLump;
	public static Item ironSlag;
	public static Item sandpaper;
	public static Item roughDiamond;
	public static Item uncutDiamond;
	public static Item hammer;
	
	public static void createItems() {
		GameRegistry.registerItem(calcine = new Calcine("calcine"), "calcine");
		GameRegistry.registerItem(limestoneShard = new LimestoneShard("limestoneShard"), "limestoneShard");
		GameRegistry.registerItem(chalcopyrite = new Chalcopyrite("chalcopyrite"), "chalcopyrite");
		GameRegistry.registerItem(groundCopper = new GroundCopper("groundCopper"), "groundCopper");
		GameRegistry.registerItem(copperIngot = new CopperIngot("copperIngot"), "copperIngot");
		GameRegistry.registerItem(copperMatte = new CopperMatte("copperMatte"), "copperMatte");
		GameRegistry.registerItem(groundIron = new GroundIron("groundIron"), "groundIron");
		GameRegistry.registerItem(sandpaper = new Sandpaper("sandpaper"), "sandpaper");
		GameRegistry.registerItem(ironLump = new IronLump("ironLump"), "ironLump");
		GameRegistry.registerItem(roughDiamond = new RoughDiamond("roughDiamond"), "roughDiamond");
		GameRegistry.registerItem(uncutDiamond = new UncutDiamond("uncutDiamond"), "uncutDiamond");
		GameRegistry.registerItem(ironSlag = new IronSlag("ironSlag"), "ironSlag");
		GameRegistry.registerItem(hammer = new Hammer("hammer"), "hammer");
	}

}
