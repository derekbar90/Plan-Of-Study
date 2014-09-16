/**
 * Course class to create and display course objects
 *
 * @author Derek Barrera
 * @version 1.0
 */

public class Course{

	
	protected int semester, courseOrder, courseNumber, credits;
	protected char grade;
	protected String department, courseName;

	/**
	 * Creates a course object
	 * 
	 * @param  semester     Given semester
	 * @param  courseOrder  Given Course Index
	 * @param  department   Given department
	 * @param  courseNumber Given course number
	 * @param  credits      Given credit number
	 * @param  courseName   Given course name
	 */
	public Course(int semester, int courseOrder, String department, int courseNumber, int credits, String courseName){

		this.semester = semester;
		this.courseOrder = courseOrder;
		this.department = department;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.courseName = courseName;
		grade = '\u0000';

	}

	/**
	 * Prints the course object 
	 * @return String containing the correct output for a course object
	 */
	public String toString(){

		String gradeOutput = "";
		
		if(grade != '\u0000'){

			gradeOutput = " " + grade; 

		}

		String courseOutput = semester + " " + courseOrder + " " + department + " " + courseNumber + " " + credits + gradeOutput + " " + courseName + "\n";

		return courseOutput;

	}

}