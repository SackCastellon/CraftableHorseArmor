/*
 * Craftable Horse Armor Mod Source Code
 * by SackCastellon is licensed under a
 * Creative Commons Attribution 3.0 Unported License.
 * 
 * A copy of the License is available at
 * http://creativecommons.org/licenses/by/3.0/
 */

package SackCastellon.craftablehorsearmor.common;

import java.io.File;

import SackCastellon.craftablehorsearmor.common.core.CommonProxy;
import SackCastellon.craftablehorsearmor.lib.handler.ConfigHandler;
import SackCastellon.craftablehorsearmor.lib.loader.*;
import SackCastellon.craftablehorsearmor.lib.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, dependencies="required-after:" + Reference.MOD_REQUIRED_AFTER)
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class CraftableHorseArmor {	
	
    @Instance("CraftableHorseArmor")
    public static CraftableHorseArmor instance;

    @SidedProxy(clientSide="SackCastellon.craftablehorsearmor.client.core.ClientProxy", serverSide="SackCastellon.craftablehorsearmor.common.core.CommonProxy")
    public static CommonProxy proxy;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	ConfigHandler.loadConfig(new File(event.getModConfigurationDirectory(), "/SackCastellon Mod's/" + Reference.MOD_ID + ".cfg"));
    	

    }
   
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	proxy.registerRenderers();
    	
    	ItemLoader.init();
    	
    	RecipeLoader.init();
    }
   
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
