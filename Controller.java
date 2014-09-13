public class Controller{

	View view = new View();
	Plan plan = new Plan();

	public void start(){

		if (view.exsistingPlanOfStudy() == true) {
			
			plan.createPlan(plan.readFile(view.planOfStudy()));

		}else{

			plan.createPlan(plan.readFile(view.planOfStudyChoice()));

		}

	}

}