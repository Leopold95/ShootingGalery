package me.leopold95.shootingallery.commands.handlers;

import me.leopold95.shootingallery.commands.constants.Commands;
import me.leopold95.shootingallery.core.Target;
import me.leopold95.shootingallery.core.TiersLocationManager;
import me.leopold95.shootingallery.core.Tiers;
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
				t.spawn(new Location(player.getWorld(), coords.getX() + 0.5, coords.getY(), coords.getZ() + 0.5), tier);
				break;
		}
	}

	public void tierFirst(String command, Player player, Tiers tier){
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
				t.spawn(new Location(player.getWorld(), coords.getX() + 0.5, coords.getY(), coords.getZ() + 0.5), tier);
				break;
		}
	}
	//sg tiertwo ....
	public void tierSecond(String command, Player player, Tiers tier){
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
				t.spawn(new Location(player.getWorld(), coords.getX() + 0.5, coords.getY(), coords.getZ() + 0.5), tier);
				break;
		}
	}

	public void tierThird(String command, Player player, Tiers tier){
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
				t.spawn(new Location(player.getWorld(), coords.getX() + 0.5, coords.getY(), coords.getZ() + 0.5), tier);
				break;
		}
	}

	public void tierFourth(String command, Player player, Tiers tier){
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
				t.spawn(new Location(player.getWorld(), coords.getX() + 0.5, coords.getY(), coords.getZ() + 0.5), tier);
				break;
		}
	}

	public void tierFifth(String command, Player player, Tiers tier){
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
				t.spawn(new Location(player.getWorld(), coords.getX() + 0.5, coords.getY(), coords.getZ() + 0.5), tier);
				break;
		}
	}
}
