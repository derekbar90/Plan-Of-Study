import java.util.*;

public class View{

	public boolean exsistingPlanOfStudy(){

		boolean exsistingPlanOfStudyAnswer = false;

		System.out.print("Is there an existing Program of Study (Y or N)? ");

		Scanner scan = new Scanner(System.in);

		char decision = scan.next().charAt(0);

		if (decision == 'Y' || decision == 'y') {

			exsistingPlanOfStudyAnswer = true;
			scan.close();
			
		}else if(decision == 'N' || decision == 'n'){

			exsistingPlanOfStudyAnswer = false;
			scan.close();

		}else{

			System.out.println("Please enter Y or N");
			exsistingPlanOfStudy();
		}

		return exsistingPlanOfStudyAnswer;

	}	

}