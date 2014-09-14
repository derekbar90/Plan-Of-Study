import java.lang.Integer;

public class Course{

	
	protected int semester, courseOrder, courseNumber, credits;
	protected char grade;
	protected String department, courseName;

	public Course(int semester, int courseOrder, String department, int courseNumber, int credits, String courseName){

		this.semester = semester;
		this.courseOrder = courseOrder;
		this.department = department;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.courseName = courseName;
		grade = '\u0000';

	}

	public String toString(){

		String courseOutput = courseOrder + " " + department + " " + courseNumber + " " + credits + " " + courseName + "\n";

		return courseOutput;

	}

}