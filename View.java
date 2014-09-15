import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.util.ArrayList;

public class View{

	/**
	 * Creates Scanner object and scans for user input 
	 * using the next() method. 
	 * 
	 * @return users input
	 */
	
	public String getUserInput(){

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

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

	/**
	 * Provides user with a list of preexsisting plans of study and sets a string
	 * to the given file location. 
	 *
	 * @return String of exsisting plan of study file location
	 */
	
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
                posTemplate = "TestCases/WebDevelopment.dat";
                break;
            case "cs":
                posTemplate = "TestCases/ComputerScience.dat";
                break;
            case "db":
                posTemplate = "TestCases/Database.dat";
                break;
            case "nw":
                posTemplate = "TestCases/Networks.dat";
                break;
            case "se":
                posTemplate = "TestCases/SoftwareEngineering.dat";
                break;
            default: 
                planOfStudyChoice();
                break;
        }

		return posTemplate;
	}

	public String menu(){

			System.out.println("");
			System.out.println("");
			System.out.println("Please make a selection from the followings");
			System.out.println("Find a course in the Program of Study (find)");
            System.out.println("Add a course to the Program of Study (add)");
            System.out.println("Remove a course from the Program of Study (remove)");
            System.out.println("Add a grade for a course in the Program of Study (grade)");
            System.out.println("Output the courses in a particular semester (prints)");
            System.out.println("Output the entire Program of Study (printPOS)");
            System.out.println("Save the Program of Study to a file (save)");
            System.out.println("Exit the system (exit)");
            String menuSelection = getUserInput();

            return menuSelection;
	}

	public String findPrompt(){

		String answer;
		System.out.println("Please enter a department and course number. Example: ITEC 100");

		answer = getUserInput();

		return answer;
	}

	public String addPrompt(){

		System.out.println("Please enter a new course in the following format: \"1 2 ITEC 320 3  Procedural Analysis and Design\"");

		return getUserInput();

	}

	public String removePrompt(){

		System.out.print("Please enter the semester of the course you would like to remove: ");
		String answer = getUserInput();

		System.out.print("Please enter the index of the course you would like to remove: ");
		String answer2 = getUserInput();
		
		String courseDelete = answer + " " + answer2;

		return courseDelete;
	}

	public String gradePrompt(){

		System.out.print("Please enter the semester of the course you would like to add a grade to: ");
		String answer = getUserInput();

		System.out.print("Please enter the index of the course you would like to add a grade to: ");
		String answer2 = getUserInput();

		System.out.print("Please enter the grade: ");
		String grade = getUserInput();
		
		String courseDelete = answer + " " + answer2 + " " + grade;

		return courseDelete;
	}

	public int printsPrompt(){

		System.out.print("Please enter the semester you would like to view: ");
		String string = getUserInput();

		int semester = Integer.parseInt(string);

		return semester;

	}

	public void print(String string){

		System.out.print(string);

	}

}