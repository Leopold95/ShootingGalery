package me.leopold95.shootingallery.core;

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


	private String parsePathX(Tiers tier, int poseNum){
		return "tier-" + tier.getNum()+ ".pos"+ poseNum+".x";
	}
	private String parsePathY(Tiers tier, int poseNum){
		return "tier-" + tier.getNum()+ ".pos"+ poseNum+".y";
	}
	private String parsePathZ(Tiers tier, int poseNum){
		return "tier-" + tier.getNum()+ ".pos"+ poseNum+".z";
	}
}
