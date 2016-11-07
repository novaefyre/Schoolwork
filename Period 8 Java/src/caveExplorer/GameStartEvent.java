package caveExplorer;

public class GameStartEvent implements Playable {
	
	private static final String[] SEQUENCE_1 = {"<A small gray mouse runs up to you","H0i. I can see you're not from around here.","Do you like puzzles?"};
	private static final String[] SEQUENCE_2 = {"You're going to have so much fun with my games.","Take this map."};

	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		readSequence(SEQUENCE_1);
		while(CaveExplorer.in.nextLine().toLowerCase().indexOf("yes") < 0){
			CaveExplorer.print("C'mon. You know you like puzzles. Say yes.");
		}
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);
	}
	
	public static void readSequence(String[] seq){
		for(String s : seq){
			CaveExplorer.print(s);
			CaveExplorer.print("- - - press enter - - -");
			CaveExplorer.in.nextLine();
		}
	}

}
