package introduction;

public class RandomCard {
	static String[] cardNames = {"King","Queen","Jack","Ten","Nine","Eight","Seven","Six","Five","Four","Three","Two","Ace"};
	static String[] cardSuits = {"Hearts","Spades","Diamonds","Clubs"};
	static String[] usedCards = {};

	public static void main(String[] args) {
		boolean thisCardNotUsed = false;
		int i = 0;
		double rand;
		int nameIdx;
		double rand2;
		int suitIdx;
		String name;
		String suit;
		String cardUsed;
		while(!thisCardNotUsed){
			rand = Math.random();
			nameIdx = (int) (cardNames.length*rand);
			rand2 = Math.random();
			suitIdx = (int) (cardSuits.length*rand2);
			name = cardNames[nameIdx];
			suit = cardSuits[suitIdx];
			cardUsed = name+" of "+suit;
			if(usedCards.length == 0 || usedCards[i] != cardUsed){
				usedCards[i] = cardUsed;
				i++;
				thisCardNotUsed = true;
			}
		}
		if(i == 52){
			System.out.println("All cards used. Resetting.");
			i = 0;
			usedCards = null;
		}
		System.out.println(cardUsed);
	}

}
