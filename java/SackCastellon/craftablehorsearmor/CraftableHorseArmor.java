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

package SackCastellon.craftablehorsearmor;

import java.io.File;

import SackCastellon.core.helper.LogHelper;
import SackCastellon.core.helper.Version;

import SackCastellon.craftablehorsearmor.handler.ConfigHandler;
import SackCastellon.craftablehorsearmor.loader.ItemLoader;
import SackCastellon.craftablehorsearmor.loader.RecipeLoader;
import SackCastellon.craftablehorsearmor.proxy.CommonProxy;
import SackCastellon.craftablehorsearmor.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.ID, name=Reference.NAME, version=Reference.VERSION, dependencies=Reference.DEPENDENCIES)
public class CraftableHorseArmor {	
	
    @Instance(Reference.ID)
    public static CraftableHorseArmor instance;
    
    @SidedProxy(clientSide=Reference.CLPROXY, serverSide=Reference.CMPROXY)
    public static CommonProxy proxy;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    	ConfigHandler.loadConfig(new File(event.getModConfigurationDirectory(), Reference.ConfigPath));
    	
		if (ConfigHandler.CheckVersion) {
			Version.check(Reference.ID, Reference.VERSION, Reference.URL);
		}
		
	// Items
    	
    	LogHelper.info(Reference.ID, "Loading items.");
    	
		try {

	    	ItemLoader.load();
	    	
			LogHelper.info(Reference.ID, "Items succesfully loaded.");
			
		} catch(Exception e) {
			
			LogHelper.severe(Reference.ID, "Could not load items.");
		} 
    }
   
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	
	// Recpes
    	
    	LogHelper.info(Reference.ID, "Loading recipes.");
    	
		try {
			
			if (ConfigHandler.Hardcore) {
				RecipeLoader.hardcore();
			} else {
				RecipeLoader.normal();
			}
			
			LogHelper.info(Reference.ID, "Recipes succesfully loaded.");
			
		} catch(Exception e) {
			
			LogHelper.severe(Reference.ID, "Could not load recipes.");
		} 
    }
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}

}