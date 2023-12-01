import java.util.ArrayList;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class Admin {
	
	Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
	
	public boolean adminAuthentication() {
		
		// Get the stored password hash from your storage
		String storedPasswordHash = getStoredPasswordHash(); 

        // Get the user's input password with three attempts
        int attempts = 3;
        boolean isAuthenticated = false;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("- Enter password: ");
            String userInputPassword = scanner.nextLine();

            // Generate the hash value for the user input password
            String userInputPasswordHash = generateHash(userInputPassword);

            // Compare the stored password hash with the user input password hash
            if (storedPasswordHash.equals(userInputPasswordHash)) {
                System.out.println("** User passed authentication. **");
                isAuthenticated = true;
                return isAuthenticated;

            } else {
                System.out.println("# User failed authentication."
                		+ " Attempts remaining: " + (attempts - i)+" #");
            }
        }

        if (!isAuthenticated) {
            System.out.println("!! Unauthorized access. You've been blocked,"
            		+ " Please contact the administrator. !!");
            
            throw new SecurityException("Authentication failed");
        }
        return isAuthenticated;
    }

	public static String generateHash(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = messageDigest.digest(password.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array to a hexadecimal representation
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = String.format("%02x", hashByte);
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static String getStoredPasswordHash() {
        // This method should retrieve the stored password hash from your storage
        return "c71c84d7ee2336c35f7d9acf65e98b08442f18a459ff9f4ce973fba92425f244";
    }

	
	public void addDepart (ArrayList<Departments> dep) {
		Inputs inputs = new Inputs();
	
		String departmentName = inputs.enterDepartmentName();
		double industrySalary = inputs.enterSalary();
		System.out.print("- Enter the required GPA : ");
		double requiredGPA = inputs.enterGPA();
		String ProgrammingInterestsLVL = inputs.enterProgrammingInterestLVL();
		String jobCategory = inputs.enterJobCategory();
		System.out.print("- Enter the acceptable GPA : ");
	    double acceptableGPA = 	inputs.enterGPA();
	    Departments newDep = new Departments(departmentName, industrySalary,
	    		requiredGPA, ProgrammingInterestsLVL, jobCategory, acceptableGPA);
	    dep.add(newDep);
		System.out.println("** Department added successfully **");

	}
	
	public void viewDepart (ArrayList<Departments> dep) {
		System.out.println(dep+"\n");
		System.out.println("** These are all debartments in the system **");

	}
	

}