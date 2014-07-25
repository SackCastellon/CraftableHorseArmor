/**
 * Craftable Horse Armor Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and his resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package com.sackcastellon.craftablehorsearmor;

import java.io.File;

import com.sackcastellon.core.helper.LogHelper;
import com.sackcastellon.core.helper.VersionHelper;
import com.sackcastellon.craftablehorsearmor.handler.ConfigHandler;
import com.sackcastellon.craftablehorsearmor.lib.Reference;
import com.sackcastellon.craftablehorsearmor.loader.ItemLoader;
import com.sackcastellon.craftablehorsearmor.loader.RecipeLoader;
import com.sackcastellon.craftablehorsearmor.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.ID, name=Reference.NAME, version=Reference.VERSION, dependencies=Reference.DEPENDENCIES)
public class CraftableHorseArmor
{	
    @Instance(Reference.ID)
    public static CraftableHorseArmor instance;
    
    @SidedProxy(clientSide=Reference.CLPROXY, serverSide=Reference.CMPROXY)
    public static CommonProxy proxy;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigHandler.loadConfig(new File(event.getModConfigurationDirectory(), Reference.ConfigPath));
    	
		if (ConfigHandler.CheckVersion)
		{
			VersionHelper.check(Reference.CheckParams);
		}
		
	// Items
    	
		try
		{
			LogHelper.info(Reference.ID, "Loading items.");
			
	    	ItemLoader.load();
		}
		
		catch(Exception e)
		{
			LogHelper.error(Reference.ID, "Could not load items.");
		}
		
		finally
		{
			LogHelper.info(Reference.ID, "Items succesfully loaded.");
		}
    }
   
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	
	// Recpes
    	
		try
		{
			LogHelper.info(Reference.ID, "Loading recipes.");
			
			if (ConfigHandler.Hardcore) {
				RecipeLoader.hardcore();
			} else {
				RecipeLoader.normal();
			}
		}
		
		catch(Exception e)
		{
			LogHelper.error(Reference.ID, "Could not load recipes.");
		}
		
		finally
		{
			LogHelper.info(Reference.ID, "Recipes succesfully loaded.");
		}
    }
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}