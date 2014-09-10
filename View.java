import java.util.Scanner;
import java.lang.String;
import java.io.File;

public class View{

	/**
	 * Creates Scanner object and scans for user input 
	 * using the next() method. 
	 * 
	 * @return users input
	 */
	
	public String getUserInput(){

		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		return input;

	}

	/**
	 * Determines if there is a currrent plan of study
	 * 
	 * @return A boolean state if the decision was yes or no 
	 */
	
	public boolean exsistingPlanOfStudy(){

		boolean exsistingPlanOfStudyAnswer = false;

		System.out.print("Is there an existing Program of Study (Y or N)? ");

		char decision = getUserInput().charAt(0);

		if (decision == 'Y' || decision == 'y') {

			exsistingPlanOfStudyAnswer = true;
			
			
		}else if(decision == 'N' || decision == 'n'){

			exsistingPlanOfStudyAnswer = false;

		}else{

			System.out.println("Please enter Y or N");
			exsistingPlanOfStudy();
		}

		return exsistingPlanOfStudyAnswer;

	}

	/**
	 * Grabs input from the user, and returns the contents
	 * 
	 * @return The exsisting filename that the user would like to use
	 */
	
	public String planOfStudy(){

		System.out.print("Enter the filename for the existing file: ");

		String filename = getUserInput();

		return filename;

	}

	public String planOfStudyChoice(){

		System.out.println("Enter your concentration:");
		System.out.println("Information Systems (IS)");
		System.out.println("Web Development (WD)");
		System.out.println("Computer Science (CS)");
		System.out.println("Database (DB)");
		System.out.println("Networks (NW)");
		System.out.println("Software Engineering (SE) ");
		String posTemplate = getUserInput();

		switch (posTemplate.toLowerCase()) {
            case "is":
                posTemplate = "TestCases/InformationSystems.dat";
                break;
            case "wd":
                posTemplate = "TestCases/InformationSystems.dat";;
                break;
            case "cs":
                posTemplate = "TestCases/InformationSystems.dat";;
                break;
            case "db":
                posTemplate = "TestCases/InformationSystems.dat";;
                break;
            case "nw":
                posTemplate = "TestCases/InformationSystems.dat";;
                break;
            case "se":
                posTemplate = "TestCases/InformationSystems.dat";;
                break;
            default: 
                System.out.println("Default");
                break;
        }

		return posTemplate;
	}

}