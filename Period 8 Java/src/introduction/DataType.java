package introduction;

public class DataType {

	public static void main(String[] args) {
//Task	
		/*	System.out.println(5.0/2);
		//5.0 is a double, because all decimal (floating) point numbers are, so the answer becomes a double
		System.out.println((double)5/2);
		//(double) declares that 5 is a double
		System.out.println(5/2);
		//5 & 2 are integers, so the computer ignores all decimal points (2.5 becomes 2)
		System.out.println(3+5.0/2+5*2);
		System.out.println(3.0+5/2+5*2);
		//the computer uses PEMDAS, so the 5/2 is an integer
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));//(int) declares that the answer to (3.0+5) is an integer, and 8/12 is 0 (because 8 & 12 are integers)
		if(42 == 42.0) System.out.println("42 equals 42.0");//no idea how the computer knows
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;*/
//Test Precision
	/*	System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));*/
//String Exercises
	/*1	String s = 1;
		System.out.println(s);
		Does not compile: can't convert int to string like this.*/
	/*2	String s = (String)1;
		System.out.println(s);
		Does not compile: can't convert int to string like this.*/
	/*3	String s = "1";
		System.out.println(s);
		Prints 1. Anything with quotation marks around it is a string.*/
	/*4	String s = ""+1;
		System.out.println(s);
		Doesn't look like it should work, but does.*/
	/*5	String s = "Happy "+18+"th birthday!";
		System.out.println(s);
		Works perfectly. Any concatenation with strings will make the result a string.*/
	/*6	String s = "Happy 18th birthday!";
		System.out.println(s);*/
	/*7	String s = "Happy "+54/3+"th birthday!";
		System.out.println(s);
		Mathematical operations are done before concatenation, so this gives a valid result.*/
	/*8	String s = "Happy "+(54/3)+"th birthday!";
		System.out.println(s);
		Same as 7.*/
	/*9	int m = 22;
		int n = 7;
		System.out.println("m/n is "+(m/n));
		m and n are integers. The computer is ignoring any decimal values.*/
	/*10	int m = 22;
		int n = 7;
		System.out.println("m/n is "+((double)m/n));
		Declaring double before the operation causes the computer to treat the result as a floating point value.*/
	}

}
