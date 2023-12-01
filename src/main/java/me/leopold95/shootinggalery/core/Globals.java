package me.leopold95.shootinggalery.core;

import me.leopold95.shootinggalery.ShootingGalery;
import org.bukkit.NamespacedKey;

public class Globals {
	public static final NamespacedKey BOW_KEY = new NamespacedKey(ShootingGalery.getPlugin(), "shooting-bow");
	public static final NamespacedKey HITTED_TARGETS_AMOUNT = new NamespacedKey(ShootingGalery.getPlugin(), "targets-hitted-amount");
	public static final NamespacedKey HITTED_TARGETS_SCORE = new NamespacedKey(ShootingGalery.getPlugin(), "targets-hitted-score");
	public static final NamespacedKey TARGET_KEY = new NamespacedKey(ShootingGalery.getPlugin(), "shooting-target");

	public static final NamespacedKey TARGET_KEY_TIER = new NamespacedKey(ShootingGalery.getPlugin(), "shooting-target-tier");
}
