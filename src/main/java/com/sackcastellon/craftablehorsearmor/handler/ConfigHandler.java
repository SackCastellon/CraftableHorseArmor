/**
 * Craftable Horse Armor Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and his resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.craftablehorsearmor.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.sackcastellon.core.helper.LogHelper;
import com.sackcastellon.core.lib.Config;
import com.sackcastellon.craftablehorsearmor.lib.Reference;

public class ConfigHandler
{
	public static Configuration config;
	
	public static boolean Hardcore;
	public static boolean Saddle;
	public static boolean IronHorseArmor;
	public static boolean GoldHorseArmor;
	public static boolean DiamondHorseArmor;
	public static boolean NameTag;
	public static boolean Lead;

	public static boolean CheckVersion;
	
	public static void loadConfig(File par1)
	{
		config = new Configuration(par1);
		
		try
		{
			LogHelper.info(Reference.ID, "Loading config file.");
			
			config.load();
			
			CheckVersion = config.get(Config.GENERAL, "CheckVersion", true, "Will check the mod's version and will notity you if there are a new version of the mod.").getBoolean(true);
			
			Hardcore = config.get(Config.DIFFICULTY, "Hardcore", false, "Is Hardcore Mode enabled?").getBoolean(false);
			
			Saddle = config.get(Config.RECIPES, "SaddleRecipe", true, "Enabled the crafting recipe of the Saddle.").getBoolean(true);
			
			IronHorseArmor = config.get(Config.RECIPES, "IronHorseArmorRecipe", true, "Enabled the crafting recipe of the IronHorseArmor.").getBoolean(true);
			
			GoldHorseArmor = config.get(Config.RECIPES, "GoldHorseArmorRecipe", true, "Enabled the crafting recipe of the GoldHorseArmor.").getBoolean(true);
			
			DiamondHorseArmor = config.get(Config.RECIPES, "DiamondHorseArmorRecipe", true, "Enabled the crafting recipe of the DiamondHorseArmor.").getBoolean(true);
			
			NameTag = config.get(Config.RECIPES, "NameTagRecipe", true, "Enabled the crafting recipe of the NameTag.").getBoolean(true);
			
			Lead = config.get(Config.RECIPES, "LeadRecipe", true, "Enabled the crafting recipe of the Lead.").getBoolean(true);	
		}
		
		catch (Exception e)
		{
			LogHelper.info(Reference.ID, "Could not load the config file.");
		}
		
		finally
		{
			if (config.hasChanged())
			{
				config.save();
			}
			
			LogHelper.info(Reference.ID, "Config file succesfully loaded.");
		}
	}
}