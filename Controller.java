public class Controller{

	View view = new View();
	Plan plan = new Plan();

	public void start(){

		if (view.exsistingPlanOfStudy() == true) {
			
			plan.createPlan(plan.readFile(view.planOfStudy()));

		}else{

			plan.createPlan(plan.readFile(view.planOfStudyChoice()));

		}
		
		while(menuHandler(view.menu())){

			menuHandler(view.menu());

		}
					
	}

	public boolean menuHandler(String string){

		boolean bool = true; 
		
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
               	view.print(plan.toString());
                break;
            case "save":
            	//plan.save();
            	break;
            case "exit":
            	bool = false;
            	break;
            default: 
                //menu(arrayList);
                break;
        }

        return bool;

	}

}