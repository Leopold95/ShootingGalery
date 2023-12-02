package me.leopold95.shootingallery.commands;


import me.leopold95.shootingallery.core.engine.ShootingGame;
import me.leopold95.shootingallery.commands.constants.Commands;
import me.leopold95.shootingallery.commands.handlers.TiersHandler;
import me.leopold95.shootingallery.core.engine.tiers.Tiers;
import me.leopold95.shootingallery.core.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BaseCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

		if(!(commandSender instanceof org.bukkit.entity.Player))
			return true;

		Player plyer = (Player) commandSender;
		TiersHandler hand = new TiersHandler();

		switch (strings[0]){
			case Commands.TIERS_FIRST:
				hand.parse(strings[1], plyer, Tiers.FIRST);
				break;

			case Commands.TIERS_SECOND:
				hand.parse(strings[1], plyer, Tiers.SECOND);
				break;

			case Commands.TIERS_THIRD:
				hand.parse(strings[1], plyer, Tiers.THIRD);
				break;

			case Commands.TIERS_FOURTH:
				hand.parse(strings[1], plyer, Tiers.FOURTH);
				break;

			case Commands.TIERS_FIFTH:
				hand.parse(strings[1], plyer, Tiers.FIFTH);
				break;

			case Commands.MY_SCORE:
				Utils.printShootingGalleryInfo(plyer);
				break;

			case Commands.START_GAME:
				ShootingGame.start();
				break;

			case Commands.STOP_GAME:
				ShootingGame.stop();
				break;
		}


		//commandSender.sendMessage(.toString());

		return true;
	}
}
