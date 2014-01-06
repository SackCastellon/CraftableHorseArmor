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

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import SackCastellon.craftablehorsearmor.handler.ConfigHandler;

public class RecipeLoader {

	public static void hardcore() {
		
		if(ConfigHandler.Saddle) {
			
            GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[] {"LLL", "LIL", "S S", 'L', Items.leather, 'I', Items.iron_ingot, 'S', ItemLoader.Stirrup});
            GameRegistry.addRecipe(new ItemStack(ItemLoader.Stirrup, 2), new Object[] {" I ", "I I", "III", 'I', Items.iron_ingot});
			
		}
		
		if(ConfigHandler.NameTag) {
			
            GameRegistry.addRecipe(new ItemStack(Items.name_tag, 1), new Object[] {"TK", 'K', new ItemStack(ItemLoader.Knot, 1), 'T', new ItemStack(ItemLoader.Tag, 1)});
            GameRegistry.addRecipe(new ItemStack(ItemLoader.Tag, 1), new Object[] {"PPP", "PPP", 'P', Items.paper});
            GameRegistry.addRecipe(new ItemStack(ItemLoader.Knot, 1), new Object[] {"SSS", "S S", "SSS", 'S', Items.string});
			
		}
		
		if(ConfigHandler.Lead) {

			@SuppressWarnings("unchecked")
			List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
			
			Iterator<IRecipe> Leash = recipes.iterator();
		          
				while (Leash.hasNext()) {
					ItemStack is = Leash.next().getRecipeOutput();
					if (is != null && is.getItem() == Items.lead)
						Leash.remove();
				};
	
			GameRegistry.addRecipe(new ItemStack(Items.lead, 1), new Object[] {"K  ", " S ", "  R", 'K', new ItemStack(ItemLoader.Knot, 1), 'S', Items.slime_ball, 'R', new ItemStack(ItemLoader.Rope, 1)});
			GameRegistry.addRecipe(new ItemStack(ItemLoader.Knot, 1), new Object[] {"SSS", "S S", "SSS", 'S', Items.string});
			GameRegistry.addRecipe(new ItemStack(ItemLoader.Rope, 1), new Object[] {"S  ", " S ", "  S", 'S', Items.string});
			
		}
		
		if(ConfigHandler.IronHorseArmor) {
		    
            GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1), new Object[] {"  H", "ICI", "LIL", 'I', Items.iron_ingot, 'C', Blocks.wool, 'H', Items.iron_helmet, 'L', Items.iron_leggings});
            
		}
	
		if(ConfigHandler.GoldHorseArmor) {
        
            GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1), new Object[] {"  H", "GCG", "LGL", 'G', Items.gold_ingot, 'C', Blocks.wool, 'H', Items.golden_helmet, 'L', Items.golden_leggings});
            
		}
	
		if(ConfigHandler.DiamondHorseArmor) {
        
            GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1), new Object[] {"  H", "DCD", "LDL", 'D', Items.diamond, 'C', Blocks.wool, 'H', Items.diamond_helmet, 'L', Items.diamond_leggings});
            
		}

	}
	
	public static void normal() {
		
		if(ConfigHandler.Saddle) {
			
			GameRegistry.addRecipe(new ItemStack(Items.saddle, 1), new Object[] {"LLL", "LIL", "I I", 'L', Items.leather, 'I', Items.iron_ingot});
			
		}
		
		if(ConfigHandler.NameTag) {
			
			GameRegistry.addRecipe(new ItemStack(Items.name_tag, 2), new Object[] {"SPP", "S  ", 'S', Items.string, 'P', Items.paper});
			
		}
		
		if(ConfigHandler.Lead) {

			@SuppressWarnings("unchecked")
			List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
			
			Iterator<IRecipe> Leash = recipes.iterator();
		          
				while (Leash.hasNext()) {
					ItemStack is = Leash.next().getRecipeOutput();
					if (is != null && is.getItem() == Items.lead)
						Leash.remove();
				};
	
			GameRegistry.addRecipe(new ItemStack(Items.lead, 2), new Object[] {"K  ", " S ", "  S", 'K', new ItemStack(ItemLoader.Knot, 1), 'S', Items.string});
			GameRegistry.addRecipe(new ItemStack(ItemLoader.Knot, 1), new Object[] {" S ", "S S", " S ", 'S', Items.string});
			
		}
		
		if(ConfigHandler.IronHorseArmor) {
		    
			GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor, 1), new Object[] {"  I", "ICI", "III", 'I', Items.iron_ingot, 'C', Blocks.wool});
			
		}
	
		if(ConfigHandler.GoldHorseArmor) {
        
			GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor, 1), new Object[] {"  G", "GCG", "GGG", 'G', Items.gold_ingot, 'C', Blocks.wool});
			
		}
	
		if(ConfigHandler.DiamondHorseArmor) {
        
			GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor, 1), new Object[] {"  D", "DCD", "DDD", 'D', Items.diamond, 'C', Blocks.wool});
			
		}
	}
}