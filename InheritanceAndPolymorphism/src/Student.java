public class Student {
	public String firstName;
	public String lastName;
	public double GPA;
	
	//not overridden in CollegeStudent class
	public void displayIntroduction() {
		System.out.println("Hi, I'm a student!");
	}
	
	//overridden in CollegeStudent class
	public void displaySchool() {
		System.out.println("Heights High School!");
	}
}