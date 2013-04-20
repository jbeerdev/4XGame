package com.me.mygdxgame.planets;

public class GridGenerator {

	public static GridMap gridMapGenerator(PLANET_SIZE size){
		GridMap gridMap = new GridMap(size.getWidth(),size.getHeight());
		iniMap(gridMap);
		return gridMap;
	}

	private static void iniMap(GridMap localGrid) {
		for (int x = 0; x < localGrid.getWidth(); x++) {
			for (int y = 0; y < localGrid.getHeight(); y++) {
				localGrid.setTileInPosition(TileType.createEmptyTile(),x,y);
			}
		}
	}

}
