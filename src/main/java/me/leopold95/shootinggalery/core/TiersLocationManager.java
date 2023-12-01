package me.leopold95.shootinggalery.core;

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


//		StringBuilder sb1 = new StringBuilder();
//
//		sb1.append("Tier 1 From: ");
//		sb1.append(Config.getInt("tier-one.pos1.x"));
//		sb1.append(" ");
//		sb1.append(Config.getInt("tier-one.pos1.y"));
//		sb1.append(" ");
//		sb1.append(Config.getInt("tier-one.pos1.z"));
//		sb1.append(" ");
//
//		StringBuilder sb2 = new StringBuilder();
//		sb2.append("Tier 1 To: ");
//		sb2.append(Config.getInt("tier-one.pos2.x"));
//		sb2.append(" ");
//		sb2.append(Config.getInt("tier-one.pos2.y"));
//		sb2.append(" ");
//		sb2.append(Config.getInt("tier-one.pos2.z"));
//		sb2.append(" ");


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


	@Deprecated
	public void printTierOne(Player player){
		StringBuilder sb1 = new StringBuilder();

		sb1.append("Tier 1 From: ");
		sb1.append(Config.getInt("tier-one.pos1.x"));
		sb1.append(" ");
		sb1.append(Config.getInt("tier-one.pos1.y"));
		sb1.append(" ");
		sb1.append(Config.getInt("tier-one.pos1.z"));
		sb1.append(" ");

		StringBuilder sb2 = new StringBuilder();
		sb2.append("Tier 1 To: ");
		sb2.append(Config.getInt("tier-one.pos2.x"));
		sb2.append(" ");
		sb2.append(Config.getInt("tier-one.pos2.y"));
		sb2.append(" ");
		sb2.append(Config.getInt("tier-one.pos2.z"));
		sb2.append(" ");


		player.sendMessage(sb1.toString());
		player.sendMessage(sb2.toString());
	}

	@Deprecated
	public void printTierTwo(Player player){
		StringBuilder sb1 = new StringBuilder();

		sb1.append("Tier 2 From: ");
		sb1.append(Config.getInt("tier-two.pos1.x"));
		sb1.append(" ");
		sb1.append(Config.getInt("tier-two.pos1.y"));
		sb1.append(" ");
		sb1.append(Config.getInt("tier-two.pos1.z"));
		sb1.append(" ");

		StringBuilder sb2 = new StringBuilder();
		sb2.append("Tier 2 To: ");
		sb2.append(Config.getInt("tier-two.pos2.x"));
		sb2.append(" ");
		sb2.append(Config.getInt("tier-two.pos2.y"));
		sb2.append(" ");
		sb2.append(Config.getInt("tier-two.pos2.z"));
		sb2.append(" ");


		player.sendMessage(sb1.toString());
		player.sendMessage(sb2.toString());
	}

	@Deprecated
	public Vector getTierOnePosOne(){
		return new Vector(
				Config.getInt("tier-one.pos1.x"),
				Config.getInt("tier-one.pos1.y"),
				Config.getInt("tier-one.pos1.z")
		);
	}

	@Deprecated
	public Vector getTierOnePosTwo(){
		return new Vector(
				Config.getInt("tier-one.pos2.x"),
				Config.getInt("tier-one.pos2.y"),
				Config.getInt("tier-one.pos2.z")
		);
	}

	@Deprecated
	public Vector getTierTwoPosOne(){
		return new Vector(
				Config.getInt("tier-two.pos1.x"),
				Config.getInt("tier-two.pos1.y"),
				Config.getInt("tier-two.pos1.z")
		);
	}

	@Deprecated
	public Vector getTierTwoPosTwo(){
		return new Vector(
				Config.getInt("tier-two.pos2.x"),
				Config.getInt("tier-two.pos2.y"),
				Config.getInt("tier-two.pos2.z")
		);
	}


	@Deprecated
	public void setTierOnePosOne(Location location) {
		Config.setInt("tier-one.pos1.x", location.getBlockX());
		Config.setInt("tier-one.pos1.y", location.getBlockY());
		Config.setInt("tier-one.pos1.z", location.getBlockZ());
	}

	@Deprecated
	public void setTierOnePosTwo(Location location) {
		Config.setInt("tier-one.pos2.x", location.getBlockX());
		Config.setInt("tier-one.pos2.y", location.getBlockY());
		Config.setInt("tier-one.pos2.z", location.getBlockZ());
	}



	@Deprecated
	public void setTierTwoPosOne(Location location) {
		Config.setInt("tier-two.pos1.x", location.getBlockX());
		Config.setInt("tier-two.pos1.y", location.getBlockY());
		Config.setInt("tier-two.pos1.z", location.getBlockZ());
	}

	@Deprecated
	public void setTierTwoPosTwo(Location location) {
		Config.setInt("tier-two.pos2.x", location.getBlockX());
		Config.setInt("tier-two.pos2.y", location.getBlockY());
		Config.setInt("tier-two.pos2.z", location.getBlockZ());
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
