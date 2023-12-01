package me.leopold95.shootingallery.core;

public enum Tiers {
	FIRST(1),
	SECOND(2),
	THIRD(3),
	FOURTH(4),
	FIFTH(5);

	private int tier;

	Tiers(int tier){
		this.tier = tier;
	}

	public int getNum(){
		return tier;
	}
}
