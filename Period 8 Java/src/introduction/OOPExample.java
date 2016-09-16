package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Student("Jillian");
		Student joseph = new Student("Joseph");
		Student jordan = new Student("Jordan");
		jillian.talk();
		joseph.talk();
		jordan.talk();
	}

}
/* Student[] students = {jillian, joseph,jordan};
 * for(i=0; i<3; i++){
 * 	students[i].talk();
 *  }
 */