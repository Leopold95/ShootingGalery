package me.leopold95.shootingallery.core.engine;

import me.leopold95.shootingallery.ShootingGallery;
import me.leopold95.shootingallery.core.Globals;
import me.leopold95.shootingallery.core.engine.tiers.TierPosition;
import me.leopold95.shootingallery.core.engine.tiers.Tiers;
import me.leopold95.shootingallery.core.engine.tiers.TiersLocationManager;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShootingGame {
	private static boolean isActive;
	private static BukkitRunnable thread = new ShootingGameThread();
	private static Map<Tiers, ArmorStand> aliveTargets = new ConcurrentHashMap<>();

	public static Map<Tiers, ArmorStand> getAliveTargets(){
		return new HashMap<>(aliveTargets);
	}


	public static void start(){
		if(thread == null){
			thread = new ShootingGameThread();
		}

		try {
			thread.runTaskTimer(ShootingGallery.getPlugin(), 0, Globals.GameThreadUpdateDelay);
			System.out.println("Тир запущен!");
		}
		catch (IllegalStateException exp){
			System.out.println("Тир уже запущен! " + exp.getMessage());
		}
	}

	public static void stop(){
		if(thread == null){
			System.out.println("Тир уже был остановлен! Или не был запущен.");
			return;
		}

		try {
			thread.cancel();
			System.out.println("Тир остановлен!");
			thread = null;
		}catch (IllegalStateException exp){
			System.out.println("Тир уже был остановлен! " + exp.getMessage());
		}

		//rome all alive targets
		for (Tiers tier : aliveTargets.keySet()) {
			ArmorStand target = aliveTargets.get(tier);
			target.remove();
			aliveTargets.remove(tier, target);
		}
	}


	public static void updateGame(){
		//удалить сбитые мешени из списка живыъ мешеней
		for (Tiers tier : aliveTargets.keySet()) {
			ArmorStand target = aliveTargets.get(tier);

			if (target.isDead())
				aliveTargets.remove(tier, target);
		}
	}

	private void tryActivateTargetsOneByOne(){

	}

	public static void trySpawnTarget(Tiers tierToSpawn){
		Location loc = TiersLocationManager.getSpawnLocation(tierToSpawn, TierPosition.FROM);

		if(!aliveTargets.containsKey(tierToSpawn))
			aliveTargets.put(tierToSpawn, Target.spawn(loc, tierToSpawn));
	}
}
