package accessModifiers1;

public class DefaultUse {

	        int a=10; //default global variable scope within a package
	public  int b=20; //public global variable scope within a project
	private int c=30; //private global variable scope within a class only
	public static void main(String[] args) 
	{
		DefaultUse m1=new DefaultUse();
		m1.test1();
		m1.test2();
		m1.test3();
		System.out.println(m1.a);
		System.out.println(m1.b);
		System.out.println(m1.c);

	}
	public void test1() //public method accessible within a java project
	{     
		System.out.println("this is public method");
	}
	void test2()   //default method accessible within a package
	{          
		System.out.println("this is default method");
	}
	private void test3() // private method accessible within a that class only 
	{
	System.out.println("this is a private method");
	}
	

}
