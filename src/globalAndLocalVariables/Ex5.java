package globalAndLocalVariables;


//Global variable:the variable which is declared outside method/block/constructor
//              is called global variable
//              the scope of global variable remains throught the class.
//	            global variable is also called permanent variable
//
//
//Local Variable: the variable which is declared inside the method/block/constructor
//                is called local variable 
//                scope of local variable remains only within the method/block/constructor
//                local variable is also called temporary variable

public class Ex5 {
	
	String Name;  // this is global variable
	int rollno;   // also call permanent variables
	
	static String Name1; // this is static global variable 
	static int rollno1;  // this is static global variable
	                     // static variable also called as class variable
	
	

	public static void main(String[] args) {
	
	 Ex5 g1 = new Ex5();
	 g1.Name= "ranjit";
	 g1.rollno=15;
	 System.out.println("name is "+g1.Name);
	 System.out.println("rollno is "+g1.rollno);
	 Name1="rk";
	 rollno1=16;
	 System.out.println("name1 is "+Name1);
	 System.out.println("rollno1 is "+rollno1);	
	 Ex5_practice a1 =new Ex5_practice();
	 a1.another1();
	 Ex5_practice.another();
	 Ex5_practice.rollno3=12;
	 a1.name3="raj";
	 
	}
	public static void sample() // static method
	{
		
	}
	
	public void sample1()       //non static method 
	{
	
	
	}

}
					