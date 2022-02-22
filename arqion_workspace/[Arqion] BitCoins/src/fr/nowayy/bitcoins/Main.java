package fr.nowayy.bitcoins;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static final String PREFIX = "§c[§6BitCoins§c] ";
	public static final String DEBUGPREFIX = "[Bitcoins]";
	public static final String ItemMarkerBTC = "§b=§9-§b=§9-§b=§9-§b=§9-§6§l BitCoins §9-§b=§9-§b=§9-§b=§9-§b=";
	public static final String ItemMarkerOres = "§b=§9-§b=§9-§b=§9-§b=§9-§6§l Minerais §9-§b=§9-§b=§9-§b=§9-§b=";
	
	@Override
	public void onEnable() {
		
	}
	
	public void registerEvents() {
		getCommand("abitcoins").setExecutor(new CommandABitcoins());
		getCommand("bitcoins").setExecutor(new CommandBitcoins(this));
		
	}

}
