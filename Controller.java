public class Controller{

	public void start(){

		View view = new View();

		if (view.exsistingPlanOfStudy() == true) {
			
			String planOfStudy = view.planOfStudy();

		}else{

			Plan plan = new Plan();

			plan.createPlan(plan.readFile(view.planOfStudyChoice()));

		}

	}

}