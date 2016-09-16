package introduction;

public class ProceduralExample {
  public static void main(String[] args){
	String[] names = {"Jillian","Joseph","Jordan"};
	String[] years = {"Freshman","Sophmore","Junior","Senior"};
	for(int i=0; i<3; i++){
		System.out.println("Hi, my name is "+names[i]+" and I am a "+years[i+1]+".");
	}
  }
}
