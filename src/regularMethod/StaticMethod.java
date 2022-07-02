package regularMethod;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		addition();
		subtraction();
		subtraction();
		multiplication();
		multiplication();
		division();
		division();
		SimpleProgram.addt();
		SimpleProgram.addt();
		SimpleProgram.addt();

	}
	public static void addition() //static regular method>>method defination>>complete method
	
	{
		int i=4;
		int j=2;
		int addition=i+j;
		System.out.println("addition is "+addition);
		
	}
	public static void subtraction()
	{
	int k=8;
	int l=6;
	int subtraction=k+l;
	System.out.println("subtraction is "+subtraction);
			
		
	}
	public static void multiplication()
	{
	int m=6;
	int n=8;
	int multiplication=m*n;
	System.out.println("multiplication is "+multiplication);
	}
	public static void division()
	{
		float o=6f;
		float p=12f;
		float division=o/p;
		System.out.println("division is "+division);
	}
}
