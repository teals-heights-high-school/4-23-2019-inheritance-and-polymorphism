import java.util.ArrayList;

public class Run {
	public static void main(String[] args) {
		CollegeStudent scottie = new CollegeStudent();
		//inherited attributes
		scottie.firstName = "Scottie";
		scottie.lastName = "Enriquez";
		scottie.GPA = 4.0;
		//college student only attribute
		scottie.major = "Computer Science";
		
		//polymorphism
		//Mr. P is both a student and a college student
		Student mrP = new CollegeStudent();
		mrP.firstName = "Mike";
		mrP.lastName = "Partridge";
		mrP.GPA = 4.0;
		//syntax error below
		//mrP.major = "Biology";
		
		Student tom = new Student();
		tom.firstName = "Tom";
		tom.lastName = "Herman";
		tom.GPA = 4.0;
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(scottie);
		students.add(mrP);
		students.add(tom);
		for(Student student : students) {
			student.displayIntroduction();
			System.out.println(student.firstName);
			student.displaySchool();
			System.out.println();
			//syntax error
			//System.out.println(student.major);
		}
	}
}