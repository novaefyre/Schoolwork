package caveExplorer;

public class InventoryNockles {

	private boolean hasMap;
	private String map;
	
	public InventoryNockles() {
		hasMap = true;
		updateMap();
	}
	
	private void updateMap() {
		CaveRoom[][] cave = CaveExplorer.caves;
		
	}

	public String getDescription(){
		if(hasMap){
			return map;
		}else{
			return "You have no inventory.";
		}
	}

}
