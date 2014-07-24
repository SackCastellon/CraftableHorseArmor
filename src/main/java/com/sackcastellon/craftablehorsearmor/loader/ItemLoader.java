/**
 * Craftable Horse Armor Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and his resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.craftablehorsearmor.loader;

import com.sackcastellon.craftablehorsearmor.handler.ConfigHandler;
import com.sackcastellon.craftablehorsearmor.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLoader
{
	public static Item Stirrup;
	public static Item Tag;
	public static Item Knot;
	public static Item Rope;
	
	public static void load()
	{
		Knot = new Item().setUnlocalizedName("Knot").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Knot");
		
		GameRegistry.registerItem(Knot, "Knot");
		
		if (ConfigHandler.Hardcore)
		{
			hardcore();
		}
	}
	
	public static void hardcore()
	{
		Stirrup = new Item().setUnlocalizedName("Stirrup").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Stirrup");
		Tag = new Item().setUnlocalizedName("Tag").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Tag");
		Rope = new Item().setUnlocalizedName("Rope").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.TexturePath + "Rope");

		GameRegistry.registerItem(Stirrup, "Stirrup");
		GameRegistry.registerItem(Tag, "Tag");
		GameRegistry.registerItem(Rope, "Rope");
	}
}