package me.leopold95.shootingallery.core.engine.tiers;

import me.leopold95.shootingallery.core.Config;
import me.leopold95.shootingallery.core.Globals;
import me.leopold95.shootingallery.core.engine.tiers.Tiers;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class TiersLocationManager {

	public void printLocation(Tiers tier, Player player){
		String ss1 = "Первая точка мишени тира: " + tier.getNum() + ". установлена в: "+
				Config.getInt(parsePathX(tier, 1)) + " " +
				Config.getInt(parsePathY(tier, 1)) + " " +
				Config.getInt(parsePathZ(tier, 1)) + ".";

		String ss2 = "Вторая точка мишени тира: " + tier.getNum() + ". установлена в: "+
				Config.getInt(parsePathX(tier, 2)) + " " +
				Config.getInt(parsePathY(tier, 2)) + " " +
				Config.getInt(parsePathZ(tier, 2)) + ".";


		player.sendMessage(ss1);
		player.sendMessage(ss2);
	}

	public void setLocation(Tiers tier, int poseNum, Location location){
		Config.setInt(parsePathX(tier, poseNum), location.getBlockX());
		Config.setInt(parsePathY(tier, poseNum), location.getBlockY());
		Config.setInt(parsePathZ(tier, poseNum), location.getBlockZ());
	}

	public Vector getCoords(Tiers tiers, int poseNum){
		return new Vector(
				Config.getInt(parsePathX(tiers, poseNum)),
				Config.getInt(parsePathY(tiers, poseNum)),
				Config.getInt(parsePathZ(tiers, poseNum))
		);
	}

	public static Location getSpawnLocation(Tiers tier, TierPosition pos){
		return new Location(
				Bukkit.getWorld(Globals.OVERWORLD_NAME),
				Config.getInt(parsePathX(tier, pos.getPos())),
				Config.getInt(parsePathY(tier, pos.getPos())),
				Config.getInt(parsePathZ(tier, pos.getPos()))
		);
	}


	private static String parsePathX(Tiers tier, int poseNum){
		return "tier-" + tier.getNum()+ ".pos"+ poseNum+".x";
	}
	private static String parsePathY(Tiers tier, int poseNum){
		return "tier-" + tier.getNum()+ ".pos"+ poseNum+".y";
	}
	private static String parsePathZ(Tiers tier, int poseNum){
		return "tier-" + tier.getNum()+ ".pos"+ poseNum+".z";
	}
}
