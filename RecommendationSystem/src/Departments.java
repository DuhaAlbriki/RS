class Departments {
	
	private String departmentName;
	private double industrySalary;
	private double requiredGPA;	
	private String programmingInterest;
	private String jobCategory;
	private double acceptableGPA;

	
	public Departments(String departmentName, double industrySalary, double requiredGPA, String programmingInterest,
			String jobCategory, double acceptableGPA) {
		
		this.departmentName = departmentName;
		this.industrySalary = industrySalary;
		this.requiredGPA = requiredGPA;
		this.programmingInterest = programmingInterest;
		this.jobCategory = jobCategory;
		this.acceptableGPA = acceptableGPA;
		
	}	 	
    
	public String getDepartmentName() {
        return departmentName;
    }

    public double getIndustrySalary() {
        return industrySalary;
    }

    public double getRequiredGPA() {
        return requiredGPA;
    }

    public String getProgrammingInterest() {
        return programmingInterest;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public double getAcceptableGPA() {
        return acceptableGPA;
    }



	@Override
	public String toString() {
		return 
				"\n\n- Department Name : " + departmentName + "\n"
				+ "	- Industry Salary : " + industrySalary + "\n"
				+ "	- Required GPA : " + requiredGPA + "\n"
				+ "	- Programming Interest : " + programmingInterest + "\n"
				+ "	- Job Category : " + jobCategory + "\n"
				+ "	- Acceptable GPA : " + acceptableGPA;
	}
	
	
	
}
