/**
 * Craftable Horse Armor Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and his resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package com.sackcastellon.craftablehorsearmor.lib;

public class Reference
{
	public static final String ID = "SKC-CraftableHorseArmor";
	public static final String NAME = "Craftable Horse Armor";
	public static final String VERSION = "1.1.2.0";
	public static final String DEPENDENCIES = "required-after:SKC-Core@[1.1.2.0,)" + ";" + "required-after:Forge@[10.13.0.1180,)";
	
	public static final String URL = "http://www.minecraftforum.net/topic/1876523-";

	public static final String CLPROXY = "com.sackcastellon.craftablehorsearmor.proxy.ClientProxy";
	public static final String CMPROXY = "com.sackcastellon.craftablehorsearmor.proxy.CommonProxy";
	
	public static final String ConfigPath = "/SackCastellon/" + ID + ".cfg";

	public static String TexturePath = "craftablehorsearmor:";
	
	public static final String[] CheckParams = new String[] {ID, NAME, VERSION, URL};
}