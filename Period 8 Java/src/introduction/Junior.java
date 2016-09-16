package introduction;

public class Junior extends Student {
	
	private int age;

	public Junior(String name, int age) {
		super(name);
		this.age = age;
	}
	
	public void talk(){
		super.talk();
		System.out.println("...and I am a "+age+"-year-old junior.");
	}

}
