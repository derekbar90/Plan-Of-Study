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

		String gradeOutput = "";
		
		if(grade != '\u0000'){

			gradeOutput = " " + grade; 

		}

		String courseOutput = semester + " " + courseOrder + " " + department + " " + courseNumber + " " + credits + gradeOutput + " " + courseName + "\n";

		return courseOutput;

	}

}