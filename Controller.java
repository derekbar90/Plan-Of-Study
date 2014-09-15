public class Controller{

	View view = new View();
	Plan plan = new Plan();

	public void start(){

		if (view.exsistingPlanOfStudy() == true) {
			
			plan.createPlan(plan.readFile(view.planOfStudy()));

		}else{

			plan.createPlan(plan.readFile(view.planOfStudyChoice()));

		}
		
		boolean bool = true;
		while(bool){


			bool = menuHandler(view.menu());

		}
					
	}

	public boolean menuHandler(String string){

		boolean bool = true; 
		String  buffer = "";

		view.print(buffer);
		
		switch (string.toLowerCase()) {
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