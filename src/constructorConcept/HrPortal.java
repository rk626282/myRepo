package constructorConcept;

public class HrPortal {
	
    //emp name emp id emp salary emp position emp emp geneder
	
	String EmpName;
	int EmpId;
	float EmpSalary;
	String EmpPosition;
	char Gender;
	
	public void empinfo()
	{
		System.out.println("==================================================");
		
		System.out.println("Employee Name Is "+EmpName);
		System.out.println("Employee ID Is "+EmpId);
		System.out.println("Employee Salary Is "+EmpSalary);
		System.out.println("Employee Position Is "+EmpPosition);
	    System.out.println("Employee Gender Is "+Gender);
	    
		System.out.println("==================================================");
	}

}
