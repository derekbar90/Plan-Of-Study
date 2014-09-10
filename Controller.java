import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller{

	public void start(){

		//Create a File object

		File fileinput;
		

		System.out.print("Is there an existing Program of Study (Y or N)? ");

		//Receive input from user
		Scanner scan = new Scanner(System.in);
		
		//Store the input from the user into a char variable
		char exisiting = scan.next().charAt(0);


		while(exisiting != 'N' && exisiting != 'n' && exisiting != 'Y' && exisiting != 'y'){


				System.out.println("Please enter Y or N");
				System.out.print("Is there an existing Program of Study (Y or N)? ");
				exisiting = scan.next().charAt(0);

		}

		if (exisiting == 'Y' || exisiting != 'y') {
		
				

		}else if(exisiting == 'N' || exisiting != 'n'){

			System.out.println("Enter your concentration:");
			System.out.println("Information Systems (IS)");
			System.out.println("Web Development (WD)");
			System.out.println("Computer Science (CS)");
			System.out.println("Database (DB)");
			System.out.println("Networks (NW)");
			System.out.println("Software Engineering (SE)");
			String pos = scan.nextLine();

			switch (pos) {
	            case "IS":  fileinput = "TestCases/InformationSystems.dat";
	                     break;
	            case "WD":  fileinput = "TestCases/WebDevelopment.dat";
	                     break;
	            case "CS":  fileinput = "TestCases/ComputerScience.dat";
	                     break;
	            case "DB":  fileinput = "TestCases/Database.dat";
	                     break;
	            case "NW":  fileinput = "TestCases/Networks.dat";
	                     break;
	            case "SE":  fileinput = "TestCases/SoftwareEngineering.dat";
	                     break;
	            default: fileinput = "Invalid selection";
	                     break;
	        }

		}

		System.out.println("Enter the filename for the existing file: ");
	
	}

}