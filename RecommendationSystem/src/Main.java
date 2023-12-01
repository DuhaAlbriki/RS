//import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
//import java.util.Scanner;


public class Main {
	
	//public static final ArrayList<Departments> departments = new ArrayList<Departments>();
	//static List<String> departments = new ArrayList<>();
	//Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());

	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
		
		ArrayList<Departments> departments = new ArrayList<Departments>();

		Inputs inputs = new Inputs();
		Departments SE = new Departments("SE", 5000, 3.0, "Low", "Software Engineer", 3.5);
		Departments CY = new Departments("CY", 7000, 3.5, "Very High", "Cybersecurity Engineer", 4.0);
		Departments CSAI = new Departments("CSAI", 5000, 3.0, "High", "Software Developer", 3.5);
		Departments CNE = new Departments("CNE", 5000, 3.0, "High", "Network Engineer", 3.5);
		
		departments.add(SE);
		departments.add(CY);
		departments.add(CSAI);
		departments.add(CNE);

		do {
			System.out.println("Welcome To Our Recommendation System! :) ");
			System.out.println("(1)login \n(2)Exit");
			String scan = inputs.enterance();
			
			switch(scan) {
			
			case "1":
				//هنا تخلينا نفرق بين اليوزر والادمن
				String username = inputs.getName();
				
				if (username.equals("$admin$")) {
					Admin admin = new Admin();
					while(true) {
						String input = inputs.choice();
	        			if (input.equals("1")) {        
	        				admin.viewDepart(departments);
	        			}
	        			else if (input.equals("2")) {
	        				admin.addDepart(departments);
	        			}
	        			else {
	        				break ;
	        			} 
					}
				}

		
				if(!username.equals("$admin$"))
				{
					User user = new User();
					user.userInterface(departments);
				}
				break;
			
			case "2":
				System.out.println("Thank you for using our System, See you Soon :) .");
				System.exit(0);
			}
			} while(true);

	
	}
	
}
