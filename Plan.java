import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plan{

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

			while(scan.hasNext()){

				int semester = scan.nextInt();
				int courseNumber = scan.nextInt();
				String department = scan.next();
				int credits = scan.nextInt();
				String courseDescription = scan.nextLine();

				System.out.println(semester + " " + courseNumber + " " + department + " " +  credits + " " + courseDescription);

			}

		}catch(FileNotFoundException e){

			e.printStackTrace();
		}

	}


	
}