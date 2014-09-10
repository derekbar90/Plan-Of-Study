import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller{

	public void start(){

		View view = new View();

		if (view.exsistingPlanOfStudy() == true) {
			
			String filename = view.planOfStudy();

		}else{



		}

	}

}