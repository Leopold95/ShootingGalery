package me.leopold95.shootinggalery.listeners;

import me.leopold95.shootinggalery.core.Globals;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.persistence.PersistentDataType;

public class ArrowHit implements Listener {
	@EventHandler
	public void onArrowHitTarget(ProjectileHitEvent event){
		if(!(event.getEntity().getShooter() instanceof Player))
			return;

		if(!(event.getEntity() instanceof Arrow))
			return;

		if(event.getHitEntity() == null)
			return;

		if(!(event.getHitEntity() instanceof ArmorStand))
			return;

		if(!event.getHitEntity().getPersistentDataContainer().has(Globals.TARGET_KEY, PersistentDataType.BYTE))
			return;

		int targetTier = event.getHitEntity().getPersistentDataContainer().get(Globals.TARGET_KEY_TIER, PersistentDataType.INTEGER);

		//instatly romve hittet target
		event.getHitEntity().remove();
		//instatly remove arrow
		event.getEntity().remove();

		Player player = (Player) event.getEntity().getShooter();

		//get -> update -> save player scores
		int targetsAmount = player.getPersistentDataContainer().get(Globals.HITTED_TARGETS_AMOUNT, PersistentDataType.INTEGER);
		int targetsScore = player.getPersistentDataContainer().get(Globals.HITTED_TARGETS_SCORE, PersistentDataType.INTEGER);

		targetsAmount += 1;
		targetsScore += targetTier;

		player.getPersistentDataContainer().set(Globals.HITTED_TARGETS_AMOUNT, PersistentDataType.INTEGER, targetsAmount);
		player.getPersistentDataContainer().set(Globals.HITTED_TARGETS_SCORE, PersistentDataType.INTEGER, targetsScore);
	}
}
