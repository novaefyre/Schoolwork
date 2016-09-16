package introduction;

public class Senior extends Student {

	public Senior(String name) {
		super(name);//constructs a student first
	}
	
	public void talk(){
		System.out.println("I am a senior.");
	}

}
