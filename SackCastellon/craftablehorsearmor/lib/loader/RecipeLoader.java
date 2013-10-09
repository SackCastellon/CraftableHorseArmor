/*
 * Craftable Horse Armor Mod Source Code
 * by SackCastellon is licensed under a
 * Creative Commons Attribution 3.0 Unported License.
 * 
 * A copy of the License is available at
 * http://creativecommons.org/licenses/by/3.0/
 */

package SackCastellon.craftablehorsearmor.lib.loader;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import SackCastellon.craftablehorsearmor.common.CraftableHorseArmor;
import SackCastellon.craftablehorsearmor.lib.handler.ConfigHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeLoader {
	
	public static void init() {
		
		if(ConfigHandler.Hardcore) {
			
			if(ConfigHandler.Saddle) {
				
	            GameRegistry.addRecipe(new ItemStack(Item.saddle, 1), new Object[] {"LLL", "LIL", "S S", 'L', Item.leather, 'I', Item.ingotIron, 'S', new ItemStack(ItemLoader.CHA_Item, 1, 0)});
	            GameRegistry.addRecipe(new ItemStack(ItemLoader.CHA_Item, 2, 0), new Object[] {" I ", "I I", "III", 'I', Item.ingotIron});
				
			}
			
			if(ConfigHandler.NameTag) {
				
	            GameRegistry.addRecipe(new ItemStack(Item.nameTag, 1), new Object[] {"TK", 'K', new ItemStack(ItemLoader.CHA_Item, 1, 2), 'T', new ItemStack(ItemLoader.CHA_Item, 1, 1)});
	            GameRegistry.addRecipe(new ItemStack(ItemLoader.CHA_Item, 1, 1), new Object[] {"PPP", "PPP", 'P', Item.paper});
	            GameRegistry.addRecipe(new ItemStack(ItemLoader.CHA_Item, 1, 2), new Object[] {"SSS", "S S", "SSS", 'S', Item.silk});
				
			}
			
			if(ConfigHandler.Lead) {
				
				List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
				
				Iterator<IRecipe> Leash = recipes.iterator();
			          
					while (Leash.hasNext()) {
						ItemStack is = Leash.next().getRecipeOutput();
						if (is != null && is.itemID == Item.leash.itemID)
							Leash.remove();
					};
					
				GameRegistry.addRecipe(new ItemStack(Item.leash, 1), new Object[] {"K  ", " S ", "  R", 'K', new ItemStack(ItemLoader.CHA_Item, 1, 2), 'S', Item.slimeBall, 'R', new ItemStack(ItemLoader.CHA_Item, 1, 3)});
				GameRegistry.addRecipe(new ItemStack(ItemLoader.CHA_Item, 1, 2), new Object[] {"SSS", "S S", "SSS", 'S', Item.silk});
				GameRegistry.addRecipe(new ItemStack(ItemLoader.CHA_Item, 1, 3), new Object[] {"S  ", " S ", "  S", 'S', Item.silk});
				
			}
			
			if(ConfigHandler.IronHorseArmor) {
			    
	            GameRegistry.addRecipe(new ItemStack(Item.horseArmorIron, 1), new Object[] {"  H", "ICI", "LIL", 'I', Item.ingotIron, 'C', Block.cloth, 'H', Item.helmetIron, 'L', Item.legsIron});
	            
			}
		
			if(ConfigHandler.GoldHorseArmor) {
	        
	            GameRegistry.addRecipe(new ItemStack(Item.horseArmorGold, 1), new Object[] {"  H", "GCG", "LGL", 'G', Item.ingotGold, 'C', Block.cloth, 'H', Item.helmetGold, 'L', Item.legsGold});
	            
			}
		
			if(ConfigHandler.DiamondHorseArmor) {
	        
	            GameRegistry.addRecipe(new ItemStack(Item.horseArmorDiamond, 1), new Object[] {"  H", "DCD", "LDL", 'D', Item.diamond, 'C', Block.cloth, 'H', Item.helmetDiamond, 'L', Item.legsDiamond});
	            
			}
			
		}
		
		else {
			
			if(ConfigHandler.Saddle) {
				
				GameRegistry.addRecipe(new ItemStack(Item.saddle, 1), new Object[] {"LLL", "LIL", "I I", 'L', Item.leather, 'I', Item.ingotIron});
				
			}
			
			if(ConfigHandler.NameTag) {
				
				GameRegistry.addRecipe(new ItemStack(Item.nameTag, 2), new Object[] {"SPP", "S  ", 'S', Item.silk, 'P', Item.paper});
				
			}
			
			if(ConfigHandler.Lead) {
				
				List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
				
				Iterator<IRecipe> Leash = recipes.iterator();
			          
					while (Leash.hasNext()) {
						ItemStack is = Leash.next().getRecipeOutput();
						if (is != null && is.itemID == Item.leash.itemID)
							Leash.remove();
					};
					
				GameRegistry.addRecipe(new ItemStack(Item.leash, 2), new Object[] {"K  ", " S ", "  S", 'K', new ItemStack(ItemLoader.CHA_Item, 1, 2), 'S', Item.silk});
				GameRegistry.addRecipe(new ItemStack(ItemLoader.CHA_Item, 1, 2), new Object[] {" S ", "S S", " S ", 'S', Item.silk});
				
			}
			
			if(ConfigHandler.IronHorseArmor) {
			    
				GameRegistry.addRecipe(new ItemStack(Item.horseArmorIron, 1), new Object[] {"  I", "ICI", "III", 'I', Item.ingotIron, 'C', Block.cloth});
				
			}
		
			if(ConfigHandler.GoldHorseArmor) {
	        
				GameRegistry.addRecipe(new ItemStack(Item.horseArmorGold, 1), new Object[] {"  G", "GCG", "GGG", 'G', Item.ingotGold, 'C', Block.cloth});
				
			}
		
			if(ConfigHandler.DiamondHorseArmor) {
	        
				GameRegistry.addRecipe(new ItemStack(Item.horseArmorDiamond, 1), new Object[] {"  D", "DCD", "DDD", 'D', Item.diamond, 'C', Block.cloth});
				
			}
			
		}
         
	}

}
