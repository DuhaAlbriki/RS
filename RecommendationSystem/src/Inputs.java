import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Inputs {
	
	Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
	
	private Admin admin  = new Admin();
	private double minSalary;
	private double GPA;
	private String programmingInterestLVL;
	
	public String getName() {
		
		System.out.print("- Enter your first name : "); 
	    String name = scanner.nextLine();
	    
		while (!(name.length() >= 3 && name.length() <= 8
			&& name.matches("[a-zA-Z]+"))|| name.equals("./admin"))
		{
			if(name.equals("./admin")) {
	    		//go to administration
				if(admin.adminAuthentication()) {
					return "$admin$";
				}
		    	
	    	} else {
			System.out.println("\n!! Please enter correct value !!\n** Name should"
					+ " be only between 3 to 8 letters, avoid numbers or sympols.**");
			System.out.print("- Enter your name : ");
			name = scanner.nextLine();
	    	}
		}
	    return name;
	}
	
	public double enterSalary()
	{
        while (true) {
        	
            System.out.print("- Enter your Minimum acceptable industry salary : ");
            String input = scanner.nextLine();

            try {
            	minSalary = Double.parseDouble(input);
                if (minSalary >= 1 && minSalary <= 99999) {
                    break;
                } else {
                    System.out.println("!! Invalid input !! \n** Please "
                    		+ "enter a numeric value between 1 and 99999 **");
                }
            } catch (NumberFormatException e) {
                System.out.println("!! Invalid input !!\n** Please enter a numeric value **");
            }
        }

        return minSalary;
	}

	public double enterGPA()
	{
		while (true) {
            
            String input = scanner.nextLine();

            try {
            	GPA = Double.parseDouble(input);
               
                 if (GPA >=1.00 && GPA <= 5.00 && input.matches("\\d+(\\.\\d{1,2})?")) {
                   	 break;
                } else {
                    System.out.println("!! Invalid input !!\n** Please enter a numeric value"
                    		+ " between 1.00 and 5.00 with a maximum of two decimal places **");
                }
            } catch (NumberFormatException e) {
                System.out.println("!! Invalid input !!\n** Please enter a numeric value **");
            }
        }

        // At this point, you can use the validated GPA value
        return GPA;
    }

	public String enterProgrammingInterestLVL()
	{
		while (true) {
			
            System.out.print("- Enter your programming interest level "
            		+ "(Low, Medium, High, Very High): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("low") || input.equalsIgnoreCase("medium") ||
                input.equalsIgnoreCase("high") || input.equalsIgnoreCase("very high")) {
            	programmingInterestLVL = input.toUpperCase();
                break;
            } else {
                System.out.println("!! Invalid input !!\n** Please enter one of the "
                		+ "following: Low, Medium, High, or Very High **");
            }
        }

        // At this point, you can use the validated interest level
        return programmingInterestLVL;
	}
	
	public String choice(){
    	String input;
        while (true) {
        	System.out.println("----------------------------------------");
			System.out.println("\tAministration ");
			System.out.println("----------------------------------------");
        	System.out.println("\n(1)View Departments\n(2)Add New Departments\n(3)Log Out\n");
        	input = scanner.nextLine();

            if (input.equals("1") || input.equals("2") || input.equals("3")) {
                break;
            } else {
                System.out.println("!! Invalid input !!\n** Please enter one of the following: 1 OR 2 OR 3 **");
            }
        }
        return input;
    }
	
	public String enterance(){
    	String input;
        while (true) {
        	input = scanner.nextLine();

            if (input.equals("1") || input.equals("2")) {
                break;
            } else {
                System.out.println("!! Invalid input !!\n** Please enter one of the following: 1 OR 2 **");
            }
        }
        return input;
    }
     
    public String enterDepartmentName() {
    	System.out.print("- Enter Department Name : "); 
	    String input = scanner.nextLine();
	    
		while (!(input.length() >= 2 && input.length() <= 6 && input.matches("[a-zA-Z]+")))
		{
			System.out.println("!! Invalid input !!\n** Department Name should be only between 2 to 6 letters, avoid numbers or sympols **");
			System.out.print("- Enter Department Name : ");
			input = scanner.nextLine();
		}
		input = input.toUpperCase(Locale.US);
	    return input;
    }
    
    public String enterJobCategory() {
    	System.out.print("- Enter Job Category : "); 
	    String input = scanner.nextLine();
	    
		while (!(input.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")))
		{
			System.out.println("!! Invalid input !!\n** Department Name should be letters only, avoid numbers or sympols **");
			System.out.print("- Enter Job Category : ");
			input = scanner.nextLine();
		}
	    return input;
    	
    }
   
}