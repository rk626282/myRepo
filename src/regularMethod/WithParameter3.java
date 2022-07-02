package regularMethod;

public class WithParameter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arithmaticOperation();
		WithParameter3 ar=new WithParameter3();
		ar.arithmaticOperation(12, 14);
		ar.arithmaticOperation(4, 5);
		ar.arithmaticOperation(8, 9);
		ar.arithmaticOperation(6, 7);
		AnotherClass.diffClass();//static method call from diff class
		AnotherClass diff=new AnotherClass();//non static call from diff class object
		diff.diffClass1(1, 1);//call non static method from diff class
		diff.diffClass1(2, 2);
		diff.diffClass1(3, 3);
		diff.diffClass1(4, 4);
		
		
		
		
		
	}
	//Arithmatic Operation :

	public static void arithmaticOperation () //static method without parameter
	{
		System.out.println("===========================");
		int a=25;
		int b=24;
		int sum=a+b;
		System.out.println("addition is "+sum);
		System.out.println("===========================");
		System.out.println("===========================");
		int a1=24;
		int b1=24;
		int sub=a1-b1;
		System.out.println("subtraction is "+sub);
		System.out.println("===========================");
		System.out.println("===========================");
		int a2=25;
		int b2=24;
		int mul=a2*b2;
		System.out.println("multiplication is "+mul);
		System.out.println("===========================");
		System.out.println("===========================");
		int a3=25;
		int b3=24;
		int div=a3/b3;
		System.out.println("division is "+div);
		System.out.println("===========================");
		
	}
	public void arithmaticOperation(int a, int b) // non static method with parameter
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
