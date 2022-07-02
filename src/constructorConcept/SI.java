package constructorConcept;

public class SI {
	String name;
	int rollno;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SI student1= new SI("RANJIT", 10);
	student1.studentinfo();
	SI student2= new SI("PRATIKSHA", 20);
	student2.studentinfo();
	SI student3 = new SI("KOMAL", 30);
	student3.studentinfo();
	SI student4 = new SI("VAIBHAV", 30);
	student4.studentinfo();
	SI student5 = new SI("SHUBHAM", 30);
	student5.studentinfo();
	
	
		
	}
	
	
	
	// Constructor use 
	
	 public SI (String name, int rollno) //with parameter
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	
	
	    
		

	public void studentinfo ()
	{
		System.out.println("student name is "+name);
		System.out.println("student rollno is "+rollno);
		
	}
	    
		
	
	
	

}
