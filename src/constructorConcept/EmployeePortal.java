package constructorConcept;

public class EmployeePortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HrPortal SachinT = new HrPortal ();
		SachinT.EmpName= "SACHIN";
		SachinT.EmpId= 12345;
		SachinT.EmpSalary= 1250.25f;
		SachinT.EmpPosition="TESTER";
		SachinT.Gender='M';
		SachinT.empinfo();
		
		HrPortal ViratK = new HrPortal();
		ViratK.EmpName= "VIRAT";
		ViratK.EmpId= 43215;
		ViratK.EmpSalary=12345.25F;
		ViratK.EmpPosition="DEVELOPER";
		ViratK.Gender='M';
		ViratK.empinfo();

	}

}
