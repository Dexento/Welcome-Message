package me.Dexento.welcome;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		this.logger.info("[Welcome] by Dexento has been enabled!");
		PluginManager plm = this.getServer().getPluginManager();
		plm.registerEvents(new PlayerJoin(), this);
	}
	public void onDisable() {
		this.logger.info("[Welcome] by Dexento has been disabled!");
	}



}
