package me.leopold95.shootingallery.core.engine;

import me.leopold95.shootingallery.ShootingGallery;
import me.leopold95.shootingallery.core.Globals;
import me.leopold95.shootingallery.core.Tiers;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;

public class ShootingGame {
	private static boolean isActive;
	private static BukkitRunnable thread = new ShootingGameThread();
	private static Map<Tiers, ArmorStand> aliveTargets = new HashMap<>();


	public static Map<Tiers, ArmorStand> getAliveTargets(){
		return new HashMap<>(aliveTargets);
	}

	public static void start(){
		thread.runTaskTimer(ShootingGallery.getPlugin(), 0, Globals.GameThreadUpdateDelay);
	}

	public static void stop(){
		thread.cancel();
	}

	public static void updateGame(){
	}

	private void tryActivateTargetsOneByOne(){

	}

	public static void makeTierOneMove(){
		Vector coords = new TiersLocationManager().getCoords(Tiers.FIRST, 1);
		Location spawnLoc = new Location(Bukkit.getWorld(Globals.OVERWORLD_NAME), coords.getX(), coords.getY(), coords.getZ())

		if(!aliveTargets.containsKey(Tiers.FIRST))
			aliveTargets.put(Tiers.FIRST, new Target().spawn(spawnLoc, Tiers.FIRST));
	}
}
