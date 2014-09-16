/**
 * Controller class manages Plan of Study 
 *
 * @author Derek Barrera
 * @version 1.0
 */

public class Controller{

	View view = new View();
	Plan plan = new Plan();

	/**
	 * Prompts the user for an exisiting plan of study,
	 * if there is no exsiting plan of study it will instead read
	 * a file from the user. Upon completion of finding a plan of study
	 * it will then pass a File object to the CreatePlan method within the 
	 * Plan class.
	 */
	public void start(){

		if(view.exsistingPlanOfStudy()) {
			
			plan.createPlan(plan.readFile(view.planOfStudy()));

		}else{

			plan.createPlan(plan.readFile(view.planOfStudyChoice()));

		}
		
		boolean bool = true;
		while(bool){


			bool = menuHandler(view.menu());

		}
					
	}

	/**
	 * Controls what methods and prompts should be 
	 * called from the menu system.
	 * 
	 * @param  string Menu item Sring
	 * @return booean Returns true unless menu option is quit        
	 */
	public boolean menuHandler(String string){

		boolean bool = true; 
		String  buffer = "";
		String choice = string.toLowerCase();
		view.print(buffer);
		
		switch (choice) {
            case "find":
                view.print(plan.find(view.findPrompt()));
                break;
            case "add":
                plan.add(view.addPrompt());
                break;
            case "remove":
                plan.remove(view.removePrompt());
                break;
            case "grade":
                plan.grade(view.gradePrompt());
                break;
            case "prints":
                view.print(plan.prints(view.printsPrompt()));
                break;
            case "printpos":
               	view.print(plan.toString());
                break;
            case "save":
            	String arg1 = plan.toString();
            	String arg2 = view.getFileName();
            	plan.save(arg1, arg2);
            	break;
            case "exit":
            	bool = false;
            	System.exit(0);
            	break;
            default:
                break;
        }

        return bool;

	}

}