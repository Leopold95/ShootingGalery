package me.leopold95.shootingallery.core.engine;

import me.leopold95.shootingallery.core.engine.tiers.Tiers;
import org.bukkit.scheduler.BukkitRunnable;

public class ShootingGameThread extends BukkitRunnable {
	@Override
	public void run() {
		ShootingGame.updateGame();

		ShootingGame.trySpawnTarget(Tiers.FIRST);
		ShootingGame.trySpawnTarget(Tiers.SECOND);
		ShootingGame.trySpawnTarget(Tiers.THIRD);
		ShootingGame.trySpawnTarget(Tiers.FOURTH);
		ShootingGame.trySpawnTarget(Tiers.FIFTH);
	}
}
