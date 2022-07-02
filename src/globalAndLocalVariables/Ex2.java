package globalAndLocalVariables;

public class Ex2 {
	
	//static global variable 
	static float a=10.30f;  
	static float b=20.20f;
	
	//non-static global variable
	float  c=12f;
	float  d=15f;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		Ex2 m2=new Ex2();
		m2.method2();

	}
	public static void method1 () //static method
	{
	//in static method we can call only static variables 
	// we cannot call non static members in static variables	
    
	float multiplication=a*b;
	System.out.println("multiplication is "+multiplication);
		
		
	}
	
   public void method2()     //non static method
   {
	//in notstatic method we can call not static global varible
	//but also we can call static global variable also  
	   
	 float div=c/d;
	 float divsion=a/b;
	 System.out.println("division is "+div);
	 System.out.println("division is "+divsion);
	   
   }
}
