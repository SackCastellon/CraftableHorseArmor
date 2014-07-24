/**
 * Craftable Horse Armor Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and his resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.craftablehorsearmor.lib;

public class Reference
{
	public static final String ID = "SKC-CraftableHorseArmor";
	public static final String NAME = "Craftable Horse Armor";
	public static final String VERSION = "1.1.1.10";
	public static final String DEPENDENCIES = "required-after:SKC-Core@[1.1.0.5,)" + ";" + "required-after:Forge@[10.12.1.1060,)";
	
	public static final String URL = "http://www.minecraftforum.net/topic/1876523-";

	public static final String CLPROXY = "com.sackcastellon.craftablehorsearmor.proxy.ClientProxy";
	public static final String CMPROXY = "com.sackcastellon.craftablehorsearmor.proxy.CommonProxy";
	
	public static final String ConfigPath = "/SackCastellon/" + ID + ".cfg";

	public static String TexturePath = "craftablehorsearmor:";
}