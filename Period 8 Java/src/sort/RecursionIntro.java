package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		//hanoiSolution(8,"A", "B", "C");
		//System.out.println(factorialRecursion(10));
		//factorial(10);
		//helloWorld();
	}
	
	@SuppressWarnings("unused")
	private static int count = 1;
	
	public static void print(String s){
		System.out.println(s);
		count++;
	}

	@SuppressWarnings("unused")
	private static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg) {
		if(numberOfDiscs <= 1){
			print("Move " + startPeg + " to " + endPeg);
		}
		else{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}

	@SuppressWarnings("unused")
	private static int factorialRecursion(int n) {
		/**int fact = n;
		if(n == 1)
		{
			fact = fact * n;
			return fact;
		}
		else
		{
			fact = fact * factorialRecursion(n-1);
			return fact;
		}**/
		if(n>1)
		{
			return n* factorialRecursion(n-1);
		}
		return 1;
	}
	
	@SuppressWarnings("unused")
	private static int fibonacci(int n){
		if(n<=1){
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	@SuppressWarnings("unused")
	private static int factorial(int n) {
		int fact = n;
		for(int i = n-1; i>0; i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		return fact;
	}
	
	@SuppressWarnings("unused")
	private static void helloWorld() {
		System.out.println("Using a for loop");
		for(int i = 0; i<5; i++)
		{
			System.out.println("Hello World x" + i);
		}
		System.out.println("Without using a forloop");
		forLoop(5, new Action(){
			private int value = 0;
			public void act() {
				System.out.println("Hello World x" + value);
				value++;
			}
		});
	}
	
	private static void forLoop(int i, Action action) {
		if(i<=0)//base case
		{
			return;
		}
		else
		{
			action.act();//standard action
			forLoop(i-1,action);//recursive call
		}
	}
}


