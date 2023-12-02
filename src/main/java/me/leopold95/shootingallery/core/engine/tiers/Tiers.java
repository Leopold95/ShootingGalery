package me.leopold95.shootingallery.core.engine.tiers;

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

	/**
	 * Использовать осторожно. Может вызвать не правильные
	 * исчисления при ошибочных значениях входного параметра.
	 */
	public static Tiers getByNum(int num){
		switch (num){
			case 1: return FIRST;
			case 2: return SECOND;
			case 3: return THIRD;
			case 4: return FOURTH;
			case 5: return FIFTH;

			default: return FIRST;
		}
	}
}
