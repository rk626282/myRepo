package constructorConcept;

public class SI2 {
	String name;
	int rollno;

	public static void main(String[] args) {
	
		SI2 student =new SI2();
		student.studentinfo1();
		
	}
	
//DEFAULT CONSTRUCTOR
//	SI2()
//	{
//		name=name;
//		rollno=rollno;
//	}
	
		
    public void studentinfo1()
   	{
   	System.out.println("student name is "+name);
   	System.out.println("student rollno is "+rollno);
   		
   	}
}




