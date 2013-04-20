package com.me.mygdxgame.planets;

public class TileType {

	private GROUND_TYPE groundType;
	private boolean isInteractive;
	

	public static TileType createEmptyTile(){
		TileType tileType = new TileType();
		tileType.setGroundType(GROUND_TYPE.LIQUID);
		tileType.setInteractive(false);
		return tileType;
	}
	
	
	
	
	public GROUND_TYPE getGroundType() {
		return groundType;
	}
	
	public void setGroundType(GROUND_TYPE groundType) {
		this.groundType = groundType;
	}
	
	public void setInteractive(boolean isInteractive) {
		this.isInteractive = isInteractive;
	}
	
	public boolean isInteractive() {
		return isInteractive;
	}
}
