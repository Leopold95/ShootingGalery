package me.leopold95.shootingallery.commands;


import me.leopold95.shootingallery.commands.constants.Commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BaseTabCompliter implements TabCompleter {
	@Nullable
	@Override
	public List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

		//tier selection
		if(strings.length == 1){
			ArrayList<String> tiers = new ArrayList<>();

			tiers.add(Commands.TIERS_FIRST);
			tiers.add(Commands.TIERS_SECOND);
			tiers.add(Commands.TIERS_THIRD);
			tiers.add(Commands.TIERS_FOURTH);
			tiers.add(Commands.TIERS_FIFTH);
			tiers.add(Commands.MY_SCORE);
			tiers.add(Commands.START_GAME);
			tiers.add(Commands.STOP_GAME);

			return tiers;
		}

		//pos type selection
		if(strings.length == 2){
			ArrayList<String> tiers = new ArrayList<>();

			tiers.add(Commands.TIER_SETFROM);
			tiers.add(Commands.TIER_SETTO);
			tiers.add(Commands.TIER_PRINT);
			tiers.add(Commands.TIER_SPAWN);

			return tiers;
		}




		return null;
	}
}
