package me.leopold95.shootingallery.commands.handlers;

import me.leopold95.shootingallery.commands.constants.Commands;
import me.leopold95.shootingallery.core.engine.Target;
import me.leopold95.shootingallery.core.engine.tiers.TiersLocationManager;
import me.leopold95.shootingallery.core.engine.tiers.Tiers;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class TiersHandler {
	//sg tierone ....
	public void parse(String command, Player player, Tiers tier){
		TiersLocationManager tpm = new TiersLocationManager();

		switch (command) {
			case Commands.TIER_SETFROM:
				tpm.setLocation(tier, 1, player.getLocation());
				player.sendMessage("pos 1 from setted");
				break;

			case Commands.TIER_SETTO:
				tpm.setLocation(tier, 2, player.getLocation());
				player.sendMessage("pos 2 to setted");
				break;

			case Commands.TIER_PRINT:
				tpm.printLocation(tier, player);
				break;

			case Commands.TIER_SPAWN:
				Target t = new Target();
				Vector coords = tpm.getCoords(tier, 1);
				t.spawn(new Location(player.getWorld(), coords.getX(), coords.getY(), coords.getZ()), tier);
				break;
		}
	}
}
