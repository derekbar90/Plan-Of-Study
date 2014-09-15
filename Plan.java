import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Plan{

	protected ArrayList<ArrayList<Course>> planArray = new ArrayList<ArrayList<Course>>();
	protected ArrayList<Course> courseArray;
	protected Course course;

	/**
	 * Reads a file location in the @param inputLocation and 
	 * creates a File object which is then avalible to be passed
	 * around.
	 * 
	 * @param  inputLocation String which contains a file location
	 * @return               File object of the given file location
	 */
	
	public File readFile(String inputLocation){

		File inputFile = new File(inputLocation);

		return inputFile;
	
	}

	/**
	 * Scans a given file and adds them to an ArrayList 
	 * while catching for any FileNotFoundException throws.
	 * Lastly, it promopts the user with a user to further 
	 * manage the plan now that it has been created.
	 * 
	 * @param planFile	.dat file which holds the current plan
	 */
	
	public void createPlan(File planFile){

		try {

			Scanner scan = new Scanner(planFile);
			int semester = 0;
			int currentSemester = 0;
			int courseOrder, courseNumber, credits;
			String department, courseName;
			semester = scan.nextInt();
			planArray.add(courseArray = new ArrayList<Course>());

			while(scan.hasNext()){

				if (currentSemester != semester) {
					
					semester++;
					planArray.add(courseArray = new ArrayList<Course>());

				}else{

						courseOrder = scan.nextInt();
						department = scan.next();
						courseNumber = scan.nextInt();
						credits = scan.nextInt();
						courseName = scan.nextLine();
						
						ArrayList<Course> courses = planArray.get(semester);
						courses.add(new Course(currentSemester, courseOrder, department, courseNumber, credits, courseName));
						
						if(scan.hasNext()){
						
							currentSemester = scan.nextInt();
						
						}	
					
				}

			}
					
		}catch(FileNotFoundException e){

			System.out.println("File no found");

		}

	}

	/**
	 * Print the Plan of Study from an ArrayList that 
	 * holds objects of the Course class. Using a for loop
	 * to iterate through the array of objects and printing 
	 * them out while maintaining whilespace between semesters
	 * 
	 * @param plan ArayList of Course objects
	 */

	public String toString(){

		String planString = "";

		for (int i = 0 ; i < planArray.size(); i++) {

			ArrayList semester = planArray.get(i);

			for (int j = 0; j < semester.size() ;j++) {

				course = (Course) semester.get(j);
				planString += course.toString();

			}

			planString += "\n";

		}

		return planString;

	}

}