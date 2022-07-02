package globalAndLocalVariables;

public class BasicEx1 {
	
	int a=50; //non-static global variable 
	int b=60; //non-static global variable 
	
	static int c=70; //static global variables 
	static int d=80; //static global variables 
	
	public static void main(String[] args) {
		
		BasicEx1 ad =new BasicEx1(); //object created
		ad.addition();               //to call non-static method using object
		subtraction();               //to call static method using method name only
		
	}
   public void addition () //non-static method 
   {
	  //
	   
	  int sum1=a+b; // non-static local variables
	  int sum2=c+d; // static local variables
	  System.out.println("addition is "+sum1);
	  System.out.println("addition is "+sum2);
   }
   public static void subtraction() //static method
   {
	   // we can call only static varibles into static method
 
/// int sub1=a-b; its shows error so we cannot call non static variables into static method 
	 
	 int sub2=c-d; //static variables
	 System.out.println("subtraction is "+sub2);
	  
   }
}
