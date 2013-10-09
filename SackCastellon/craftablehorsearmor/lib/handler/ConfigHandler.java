/*
 * Craftable Horse Armor Mod Source Code
 * by SackCastellon is licensed under a
 * Creative Commons Attribution 3.0 Unported License.
 * 
 * A copy of the License is available at
 * http://creativecommons.org/licenses/by/3.0/
 */

package SackCastellon.craftablehorsearmor.lib.handler;

import java.io.File;
import java.util.logging.Level;

import SackCastellon.core.lib.config.Config;
import SackCastellon.craftablehorsearmor.common.CraftableHorseArmor;
import SackCastellon.craftablehorsearmor.lib.loader.IDsLoader;
import SackCastellon.craftablehorsearmor.lib.loader.ItemLoader;
import SackCastellon.craftablehorsearmor.lib.loader.NameLoader;
import SackCastellon.craftablehorsearmor.lib.reference.Reference;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class ConfigHandler {
	
	public static Configuration config;
	
	public static boolean Hardcore;
	public static boolean Saddle;
	public static boolean IronHorseArmor;
	public static boolean GoldHorseArmor;
	public static boolean DiamondHorseArmor;
	public static boolean NameTag;
	public static boolean Lead;
	
	public static void loadConfig(File par1) {
		
		config = new Configuration(par1);
		try {
			
			config.load();

			Hardcore = config.get(Config.DIFFICULTY, "Hardcore", false, "Is Hardcore Mode enabled?").getBoolean(false);
			
			Saddle = config.get(Config.RECIPES, "SaddleRecipe", true, "Enabled the crafting recipe of the Saddle.").getBoolean(true);
			
			IronHorseArmor = config.get(Config.RECIPES, "IronHorseArmorRecipe", true, "Enabled the crafting recipe of the IronHorseArmor.").getBoolean(true);
			
			GoldHorseArmor = config.get(Config.RECIPES, "GoldHorseArmorRecipe", true, "Enabled the crafting recipe of the GoldHorseArmor.").getBoolean(true);
			
			DiamondHorseArmor = config.get(Config.RECIPES, "DiamondHorseArmorRecipe", true, "Enabled the crafting recipe of the DiamondHorseArmor.").getBoolean(true);
			
			NameTag = config.get(Config.RECIPES, "NameTagRecipe", true, "Enabled the crafting recipe of the NameTag.").getBoolean(true);
			
			Lead = config.get(Config.RECIPES, "LeadRecipe", true, "Enabled the crafting recipe of the Lead.").getBoolean(true);
			
			IDsLoader.Item_ID_actual = config.get("Item ID", "Items ID", IDsLoader.Item_ID_default).getInt() - 256;
		}
		catch(Exception e) {
			
			FMLLog.log(Level.SEVERE, e, "[" + Reference.MOD_ID.substring(4).toLowerCase() + "] Could not load the Config!");
		}
		
		finally {
			
			config.save();
		}
		
	}

}
