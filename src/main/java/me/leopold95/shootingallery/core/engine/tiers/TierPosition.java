package me.leopold95.shootingallery.core.engine.tiers;

public enum TierPosition {
	FROM(1),
	TO(2);

	TierPosition(int pos){
		this.pos = pos;
	}

	private int pos;

	public int getPos(){
		return pos;
	}
}
