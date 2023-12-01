package me.leopold95.shootingallery.core.engine;

import me.leopold95.shootingallery.ShootingGallery;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class ShootingGame {
	private static boolean isActive;
	private static BukkitRunnable thread = new RandomTiersMovementTask();

	//T - tier
	private static boolean isTargetTOneAlve;
	private static boolean isTargetTTwoAlve;
	private static boolean isTargetTThreeAlve;
	private static boolean isTargetTFourAlve;
	private static boolean isTargetTFiveAlve;


	public static void start(){
		thread.runTaskTimer(ShootingGallery.getPlugin(), 0, 20);
	}

	public static void stop(){
		thread.cancel();
	}

	private void tryActivateTargetsOneByOne(){

	}
}
