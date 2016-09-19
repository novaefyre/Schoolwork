package introduction;

public class DataType {

	public static void main(String[] args) {
		System.out.println(5.0/2);
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
	}

}
