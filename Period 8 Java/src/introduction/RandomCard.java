package introduction;

public class RandomCard {
	static String[] cardNames = {"King","Queen","Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two","Ace"};
	static String[] cardSuits = {"Hearts","Spades","Diamonds","Clubs"};

	public static void main(String[] args) {
		double rand = Math.random();
		int nameIdx = (int) (13*rand);
		double rand2 = Math.random();
		int suitIdx = (int) (4*rand2);
		String name = cardNames[nameIdx];
		String suit = cardSuits[suitIdx];
		System.out.println(name+" of "+suit);
	}

}
