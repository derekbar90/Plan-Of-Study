import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Plan{

	ArrayList<Course> planArray = new ArrayList<Course>();
	View view = new View();

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

	public void createPlan(File planFile){

		try {

			Scanner scan = new Scanner(planFile);
			int semester = 0;
			int currentSemester = 0;
			int courseOrder, courseNumber, credits;
			String department, courseName;
			
			semester = scan.nextInt();

			while(scan.hasNext()){

				if (currentSemester != semester) {
					
					semester++;

				}else{

						courseOrder = scan.nextInt();
						department = scan.next();
						courseNumber = scan.nextInt();
						credits = scan.nextInt();
						courseName = scan.nextLine();

						planArray.add(new Course(semester, courseOrder, department, courseNumber, credits, courseName));
												
						if(scan.hasNext()){
						
							currentSemester = scan.nextInt();
						
						}
					
				}

			}

			view.printPlan(planArray);
					
		}catch(FileNotFoundException e){

			e.printStackTrace();

		}

	}

}