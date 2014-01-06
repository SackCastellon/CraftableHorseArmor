/*
 * Craftable Horse Armor Mod created by SackCastellon is licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 * 
 * The source code of Craftable Horse Armor Mod created by SackCastellon is
 * licensed under a Creative Commons Attribution 3.0 Unported License,
 * 
 * 		http://creativecommons.org/licenses/by/3.0/
 * 
 * The source code of Craftable Horse Armor Mod created by SackCastellon can be found at:
 * 
 * 		https://github.com/SackCastellon/CraftableHorseArmor
 */

package SackCastellon.craftablehorsearmor.loader;

import cpw.mods.fml.common.registry.GameRegistry;
import SackCastellon.craftablehorsearmor.handler.ConfigHandler;
import SackCastellon.craftablehorsearmor.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLoader {

	public static Item Stirrup;
	public static Item Tag;
	public static Item Knot;
	public static Item Rope;
	
	public static void load() {
		
		Knot = new Item().setUnlocalizedName("Knot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Knot");
		
		GameRegistry.registerItem(Knot, "Knot");
		
		if (ConfigHandler.Hardcore) {
			hardcore();
		}
	}
	
	public static void hardcore() {
		
		Stirrup = new Item().setUnlocalizedName("Stirrup").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Stirrup");
		Tag = new Item().setUnlocalizedName("Tag").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Tag");
		Rope = new Item().setUnlocalizedName("Rope").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Rope");

		GameRegistry.registerItem(Stirrup, "Stirrup");
		GameRegistry.registerItem(Tag, "Tag");
		GameRegistry.registerItem(Rope, "Rope");
		
	}
}