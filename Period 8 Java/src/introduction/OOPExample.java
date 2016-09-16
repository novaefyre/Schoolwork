package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student joseph = new Student("Joseph");
		Student jordan = new Student("Jordan");
		jillian.talk();
		joseph.talk();
		jordan.talk();
	}

}
/*	[Random thinking notes]
 *  Student[] students = {jillian, joseph,jordan};
 *
 * for(i=0; i<3; i++){
 * 	students[i].talk();
 *  }
 */