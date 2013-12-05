package me.Dexento.welcome;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

	public Main plugin;
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if(player.hasPlayedBefore()){
			Bukkit.broadcastMessage(ChatColor.YELLOW + "[MovementMC]" + ChatColor.GREEN + " Welcome back to the MovementMC network, " + ChatColor.GRAY + player.getName());
		}else{
			Bukkit.broadcastMessage(ChatColor.YELLOW + "[MovementMC]" + ChatColor.GREEN + " Welcome to the MovementMC network, " + ChatColor.GRAY + player.getName());
		}
	}
}
