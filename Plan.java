import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Plan{

	ArrayList<Course> planArray = new ArrayList<Course>();

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
					
		}catch(FileNotFoundException e){

			System.out.println("File no found");

		}

	}

	public String menuHandler(String string){

		String output = "";

		switch (string.toLowerCase()) {
            case "find":
                //plan.find();
                break;
            case "add":
                //plan.add();
                break;
            case "remove":
                //plan.remove();
                break;
            case "grade":
                //plan.grade();
                break;
            case "prints":
                //plan.prints();
                break;
            case "printpos":
                printPOS(planArray);
                break;
            case "save":
            	//plan.save();
            	break;
            case "exit":
            	output = "exit";
            	break;
            default: 
                //menu(arrayList);
                break;
        }

        return output;


	}

	/**
	 * Print the Plan of Study from an ArrayList that 
	 * holds objects of the Course class. Using a for loop
	 * to iterate through the array of objects and printing 
	 * them out while maintaining whilespace between semesters
	 * 
	 * @param plan ArayList of Course objects
	 */
	
	public void printPOS(ArrayList<Course> plan){

		int currentSemester = 0;

		for (int i = 0 ; i < plan.size(); i++) {

			Course course = plan.get(i);

			if(course.semester != currentSemester){

				System.out.print(course);

			}else{

				System.out.println("");
				System.out.print(course);
				currentSemester++;

			}
					
		}

	}

}