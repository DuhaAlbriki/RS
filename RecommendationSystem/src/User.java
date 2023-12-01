import java.util.ArrayList;

public class User {

	public void userInterface(ArrayList<Departments> dep) {
		
		Inputs inputs = new Inputs();
		
		double minimumSalary = inputs.enterSalary();
		System.out.print("- Enter your GPA : ");
		double StudentGPA = inputs.enterGPA();
		String ProgrammingInterestsLVL = inputs.enterProgrammingInterestLVL();

		
			for(int i = 0 ; i < dep.size() ; i++ ) {
				Departments loopDep = dep.get(i);
				if(minimumSalary<=loopDep.getIndustrySalary() || StudentGPA >= loopDep.getRequiredGPA()|| ProgrammingInterestsLVL.equalsIgnoreCase(loopDep.getProgrammingInterest()) ) {
					System.out.println(dep.get(i));
					System.out.println("\t **you need to study " + StudentGPA + " hours\n");
				}
				
			}
		
	}

}
