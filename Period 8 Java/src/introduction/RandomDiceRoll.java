package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int[6];
		//declare variable logic test, increment
		for(int index = 0; index<10000; index++){
			int result = rollUnfairDie(2);
			System.out.println("Roll #"+(index+1)+": "+result);
			results[result-1]++;
		}
		//print the results
		for(int i = 0; i<6; i++)
			System.out.println((1+i)+" appeared "+results[i]+" times.");
	}
	//return a number 1-6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random();//returns a double (0,1)
		int roll = (int) (6*rand);//[0,5]
		roll++;//[1,6]
		return roll;
	}
	
	public static int rollUnfairDie(int num){
		double rand = Math.random();
		int roll = (int) (6*rand);
		roll++;
		double unfairChanceRand = Math.random();
		int unfairChance = (int) (2*unfairChanceRand);
		if(unfairChance == 0)
			roll = num;
		return roll;
	}

}
