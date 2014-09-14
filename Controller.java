public class Controller{

	View view = new View();
	Plan plan = new Plan();
	String handler = "";

	public void start(){

		if (view.exsistingPlanOfStudy() == true) {
			
			plan.createPlan(plan.readFile(view.planOfStudy()));

		}else{

			plan.createPlan(plan.readFile(view.planOfStudyChoice()));

		}
		
		do{

			handler = plan.menuHandler(view.menu(plan.planArray));

		}while(handler != "exit");

	}

}