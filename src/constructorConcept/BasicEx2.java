package constructorConcept;

public class BasicEx2 {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicEx2 cs1=new BasicEx2(); //creted object
		cs1.sum();                                   //to call non-static method
		
		
	

	}
	//ConstructorConcept () default constructor created by compiler>> after creating object
	//{
	//	
	//}
	
	BasicEx2() //user define constructor>>zero parameter or without parameter
	{
		a=10;
		b=12;
		
	System.out.println("welcome to the constructor");	
	
	}
	public void sum()
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
}
