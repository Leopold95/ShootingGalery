package me.leopold95.shootingallery.listeners;

import me.leopold95.shootingallery.core.Globals;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataType;

public class Player implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		if(!event.getPlayer().getPersistentDataContainer().has(Globals.HITTED_TARGETS_AMOUNT, PersistentDataType.INTEGER))
			event.getPlayer().getPersistentDataContainer().set(Globals.HITTED_TARGETS_AMOUNT, PersistentDataType.INTEGER, 0);

		if(!event.getPlayer().getPersistentDataContainer().has(Globals.HITTED_TARGETS_SCORE, PersistentDataType.INTEGER))
			event.getPlayer().getPersistentDataContainer().set(Globals.HITTED_TARGETS_SCORE, PersistentDataType.INTEGER, 0);
	}
}
