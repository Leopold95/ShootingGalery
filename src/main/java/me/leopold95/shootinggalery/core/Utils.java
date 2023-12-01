package me.leopold95.shootinggalery.core;


import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataType;

public class Utils {

	public static void printShootingGalleryInfo(Player player){
		player.sendMessage("Мишеней сбито: " + getTargetsAmount(player));
		player.sendMessage("Счет тира: " + getTargetsScore(player));
	}
	public static int getTargetsAmount(Player player){
		return player.getPersistentDataContainer().get(Globals.HITTED_TARGETS_AMOUNT, PersistentDataType.INTEGER);
	}

	public static int getTargetsScore(Player player){
		return player.getPersistentDataContainer().get(Globals.HITTED_TARGETS_SCORE, PersistentDataType.INTEGER);
	}
}
