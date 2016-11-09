package caveExplorer;

public class Inventory {

	private boolean hasMap;
	private String map;
	
	public Inventory() {
		hasMap = false;
		updateMap();
	}
	
	public void setHasMap(boolean hasMap) {
		this.hasMap = hasMap;
	}

	public void updateMap() {
		CaveRoom[][] cave = CaveExplorer.caves;
		//create top of map
		map = " ";
		//Horizontal line across top
		//except last room.
		for(int i = 0; i < cave[0].length-1; i++){
			map += "____";
		}
		map += "___\n";
		//reach room
		for(CaveRoom[] row : cave){
			for(int textRow = 0; textRow < 3; textRow++){
				//Text for each room
				for(CaveRoom cr : row){
					String str = "|   ";
					String contents = cr.getContents();
					if(textRow == 1){
						if(cr.getDoor(CaveRoom.WEST) != null && cr.getDoor(CaveRoom.WEST).isOpen()){
							str = "  "+contents+" ";
						}else{
							str = "| "+contents+" ";
						}
					}else if(textRow == 2){
						if(cr.getDoor(CaveRoom.SOUTH) == null){
							str = "|___";
						}else{
							str = "|_ _";
						}
					}
					map += str;
				}
				//end of cave rooms
				map += "|\n";
			}
		}
	}

	public String getDescription(){
		if(hasMap){
			return map;
		}else{
			return "You have nothing in your inventory.";
		}
	}

}
