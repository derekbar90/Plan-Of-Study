import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;

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

	public String find(String string){

		int courseSemester = 0;

		Scanner scan = new Scanner(string);

		String departments = scan.next();
		int courseNumbers = scan.nextInt();

		for (int i = 0 ; i < planArray.size(); i++) {

			ArrayList<Course> semester = planArray.get(i);

			for (int j = 0; j < semester.size() ;j++) {

				course = semester.get(j);
				
				if (course.department.equals(departments) && course.courseNumber == courseNumbers){

					courseSemester = course.semester;
					
				}

			}

		}

		return prints(courseSemester);
	}

	public String prints(int semester){

		String semesterString = "";

		ArrayList<Course> semesters = planArray.get(semester);

			for (int j = 0; j < semesters.size() ;j++) {

				course = semesters.get(j);

				semesterString += course.toString();

			}

		return semesterString;

	}

	public void add(String string){

			Scanner scan = new Scanner(string);
			int semester = 0;
			int courseOrder, courseNumber, credits;
			String department, courseName;
			
			semester = scan.nextInt();
			
			courseOrder = scan.nextInt();
			
			department = scan.next();
			
			courseNumber = scan.nextInt();
			
			credits = scan.nextInt();
			
			courseName = scan.nextLine();
			
			scan.close();

			ArrayList<Course> semesters = planArray.get(semester);
			
			semesters.add(new Course(semester, courseOrder, department, courseNumber, credits, courseName));

	}

	public void remove(String string){

		Scanner scan = new Scanner(string);
		
		int semester = scan.nextInt();
		
		int courseIndex = scan.nextInt();
		
		scan.close();

		ArrayList<Course> semesters = planArray.get(semester);

		semesters.remove(courseIndex);


	}

	public void grade(String string){

		Scanner scan = new Scanner(string);

		int semester = scan.nextInt();

		int courseIndex = scan.nextInt();

		String gradeString = scan.next();

		char grade = gradeString.charAt(0); 

		scan.close();

		//protected ArrayList<ArrayList<Course>> planArray = new ArrayList<ArrayList<Course>>();
		//protected ArrayList<Course> courseArray;
		//protected Course course;

		ArrayList<Course> semesters = planArray.get(semester);

		course = semesters.get(courseIndex);
		course.grade = grade;

	}

	public void save(String plan, String filename){

	try{
		

		String fullFilename = filename + ".dat";
		String formattedPlan = plan.trim();

		// Create a file - this will overwrite an existing file 
		FileWriter outstream  = new FileWriter(fullFilename);

		// Create a BufferedWriter pointing to the file
		BufferedWriter out = new BufferedWriter(outstream);

		// Write to the file
		out.write(formattedPlan);

		// Close the output stream/file - if you do not do this
		// your file will appear to be empty
		out.close();
     
     }
     
     catch (Exception e){//Catch exception if any
	
		System.err.println("Error: " + e.getMessage());
    
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

			planString += "\n";

			ArrayList<Course> semester = planArray.get(i);

			for (int j = 0; j < semester.size() ;j++) {

				course = semester.get(j);
				course.courseOrder = j;
				planString += course.toString();

			}			

		}

		String formattedPlan = planString.trim();

		return formattedPlan;

	}

}