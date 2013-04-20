package com.me.mygdxgame.planets;

public class TileGenerator {

	TileType[][] gridMap;


	public TileType[][] gridMapGenerator(PLANET_SIZE size){
		gridMap = new TileType[size.getWidth()][size.getHeight()];
		iniMap(gridMap);
		return gridMap;
	}

	private void iniMap(TileType[][] localGrid) {
		for (int x = 0; x < localGrid.length; x++) {
			for (int y = 0; y < localGrid.length; y++) {
				localGrid[x][y] = TileType.createEmptyTile();
			}
		}
	}

}
