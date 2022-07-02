package constructorConcept;

public class SI3 {
	
	String name1;
	int rollno1;


	public static void main(String[] args) {
		
		SI3 student =new SI3();
		student.studentinfo1();
		
	}
	//USER DEFINED CONSTRUCTOR WITH ZERO PARAMETER
	SI3()
	{
		name1="RAJ";
		rollno1=23;
	}
	
	 public void studentinfo1()
	   	{
	   	System.out.println("student name is "+name1);
	   	System.out.println("student rollno is "+rollno1);
	   	}

}
