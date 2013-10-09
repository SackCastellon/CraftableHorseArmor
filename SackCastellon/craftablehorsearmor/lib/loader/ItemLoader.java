/*
 * Craftable Horse Armor Mod Source Code
 * by SackCastellon is licensed under a
 * Creative Commons Attribution 3.0 Unported License.
 * 
 * A copy of the License is available at
 * http://creativecommons.org/licenses/by/3.0/
 */

package SackCastellon.craftablehorsearmor.lib.loader;

import cpw.mods.fml.common.registry.LanguageRegistry;
import SackCastellon.core.common.items.*;
import SackCastellon.craftablehorsearmor.common.CraftableHorseArmor;
import SackCastellon.craftablehorsearmor.lib.handler.ConfigHandler;
import SackCastellon.craftablehorsearmor.lib.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class ItemLoader {

	public static Item CHA_Item;
	
	
	public static void init() {
		
		CHA_Item = new SKCMetaItem(IDsLoader.Item_ID_actual, Reference.TexturePath, NameLoader.Names, null, null, "CHA").setUnlocalizedName("CHA").setCreativeTab(CreativeTabs.tabMisc);
	}

}
