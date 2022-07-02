package globalAndLocalVariables;

public class Ex4_sample {
	
	int m=120; //global variable non-static
	static int n=140; //global variable static
	

	
	public void display()
	{
		System.out.println("i am non static method(display) for sample class");
	}
	public static void display1()
	{
		System.out.println("i am static method(display1) for sample class");
	}

}
