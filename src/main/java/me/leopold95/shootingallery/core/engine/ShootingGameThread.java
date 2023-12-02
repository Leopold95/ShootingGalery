package me.leopold95.shootingallery.core.engine;

import me.leopold95.shootingallery.core.engine.tiers.Tiers;
import org.bukkit.scheduler.BukkitRunnable;

public class ShootingGameThread extends BukkitRunnable {
	@Override
	public void run() {
		ShootingGame.updateGame();

		ShootingGame.makeTierOneMove(Tiers.FIRST);
		ShootingGame.makeTierOneMove(Tiers.SECOND);
		ShootingGame.makeTierOneMove(Tiers.THIRD);
		ShootingGame.makeTierOneMove(Tiers.FOURTH);
		ShootingGame.makeTierOneMove(Tiers.FIFTH);
	}
}
