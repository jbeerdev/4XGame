package com.me.mygdxgame.planets;

public enum PLANET_SIZE{

	HUGE(128,64),
	SMALL(24,12), 
	TINY(12,6);

	int width, height;

	private PLANET_SIZE(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

}
