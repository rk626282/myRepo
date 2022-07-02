package globalAndLocalVariables;

public class Ex3 {
	int p=20; //global variable nonstatic
	int q=30; //global variable nonstatic
	static int r=40; //global variable static
	static int s=40; //global variable static

	public static void main(String[] args) {
		
		Ex3 obj1= new Ex3();
		obj1.test(); //calling nonstatic method using object
		test1();     // calling static method same class
	    Ex4_sample.display1(); //calling static method from diff class
	    Ex4_sample obj2= new Ex4_sample();
	    obj2.display(); //call nonstatic method using object of diff class
	    
	    System.out.println(r); //calling static global variable
	    int sum1=(s+r);
		System.out.println(sum1);
		
		//calling not static global variable from same class
		System.out.println("the vale of p is"+obj1.p);
		
		// calling non static variable from same class
		System.out.println(obj1.q);
		
		//calling static global variable from same class
		System.out.println("value of r is "+r);
		
		//using nonstatic global variable from same class
		int addition=100+obj1.p;
		System.out.println("add is "+addition);
		
		//using static global variable from same class
		int subtraction =100-s;
		System.out.println("sub is "+subtraction);
		
		//calling nonstatic variable from diff class
		System.out.println("value of m is "+obj2.m);
		
		//calling static variable from diff class
		System.out.println("value of n is "+Ex4_sample.n);
		 
	}	 
		
		
	
   public void test() //nonstatic method
   {
	//in not static method me can call both static and nonstatic variable
	   
	 int mul=p*q; //mul is local variable
	 int add=r+s; //add is local variable
	 System.out.println("mul is "+mul);
	 System.out.println("add is "+add);
   }
   public static void test1() //static method
   { 
   //in static method we can call only static global variable 
	
	int mul2=r*s;   
	int sum=10+r; //sum is local variable
	System.out.println("mul is "+mul2);
	System.out.println("sum is "+sum);
	
   }
}
