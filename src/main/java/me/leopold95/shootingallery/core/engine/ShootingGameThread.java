package me.leopold95.shootingallery.core.engine;

import org.bukkit.scheduler.BukkitRunnable;

public class ShootingGameThread extends BukkitRunnable {
	@Override
	public void run() {
		ShootingGame.updateGame();
		ShootingGame.makeTierOneMove();
	}
}
