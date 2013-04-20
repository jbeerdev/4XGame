package com.me.mygdxgame.planets;

public class GridMap {
	private TileType[][] gridMap;
	private int width;
	private int height;
	
	public GridMap(int width, int height){
		gridMap = new TileType[width][height];
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setTileInPosition(TileType tile, int x, int y) {
		this.gridMap[x][y] = tile;
	}
	
	
	
}
