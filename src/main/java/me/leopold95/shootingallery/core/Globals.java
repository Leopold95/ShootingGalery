package me.leopold95.shootingallery.core;

import me.leopold95.shootingallery.ShootingGallery;
import org.bukkit.NamespacedKey;

public class Globals {
	public static final double TargetMovementSpeed = 1.0;
	public static final int GameThreadUpdateDelay = 15; //ticks
	public static String OVERWORLD_NAME = "world";
	public static final NamespacedKey BOW_KEY = new NamespacedKey(ShootingGallery.getPlugin(), "shooting-bow");
	public static final NamespacedKey HITTED_TARGETS_AMOUNT = new NamespacedKey(ShootingGallery.getPlugin(), "targets-hitted-amount");
	public static final NamespacedKey HITTED_TARGETS_SCORE = new NamespacedKey(ShootingGallery.getPlugin(), "targets-hitted-score");
	public static final NamespacedKey TARGET_KEY = new NamespacedKey(ShootingGallery.getPlugin(), "shooting-target");

	public static final NamespacedKey TARGET_KEY_TIER = new NamespacedKey(ShootingGallery.getPlugin(), "shooting-target-tier");
}
