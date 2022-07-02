package regularMethod;

public class AnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diffClass();
		AnotherClass ob1=new AnotherClass();
		ob1.diffClass1(21, 20);
		ob1.diffClass1(10, 20);
		ob1.diffClass1(20, 30);
		

	}
	public static void diffClass () //static method without parameter
	{
		System.out.println("===========================");
		int a=10;
		int b=12;
		int sum=a+b;
		System.out.println("addition is "+sum);
		System.out.println("===========================");
		
		int a1=12;
		int b1=6;
		int sub=a1-b1;
		System.out.println("subtraction is "+sub);
		
		System.out.println("===========================");
		int a2=2;
		int b2=4;
		int mul=a2*b2;
		System.out.println("multiplication is "+mul);
		
		System.out.println("===========================");
		int a3=8;
		int b3=4;
		int div=a3/b3;
		System.out.println("division is "+div);
		System.out.println("===========================");
		System.out.println("===========================");	
		
		
		
	}
   public void diffClass1(int a, int b)
   {
	   System.out.println("===========================");
		int addition=a+b;
		int subtraction=a-b;
		int multiplication=a*b;
		float division=a/b;
		System.out.println("ADDITION IS = "+addition);
		System.out.println("SUBTRACTION IS ="+subtraction);
		System.out.println("MULTIPLICATION IS ="+multiplication);
		System.out.println("DIVISION IS = "+division);
		System.out.println("===========================");   
	   
	   
	   
	   
	   
   }
}
