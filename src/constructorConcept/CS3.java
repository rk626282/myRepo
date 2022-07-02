package constructorConcept;

public class CS3 {
	int num1;
	int num2;
	int num3;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CS3 s1=new CS3();
		 s1.sum();
		 CS3 s2= new CS3(12);
		 s2.sum();
		 CS3 s3= new CS3(12, 10);
		 s3.sum();
		 CS3 s4 = new CS3(10, 12, 12);
		 s4.sum();
		 CS4 d1= new CS4();
		 d1.mul();
		 CS4 d2= new CS4(2, 3, 4);
		 d2.mul();





	}
	public CS3()
	{
		num1=10;
		num2=20;
		num3=30;
		
	}
	public CS3(int a) //single parameter constructor >user defined>with parameter
	{
		num1=a;
		
	}
	public CS3(int a, int b)
	{
		num1=a;
		num2=b;
	}
	public CS3(int a, int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	public void sum()
	{
		int sum=num1+num2+num3;
		System.out.println("addition is "+sum);
		
	}
	

}
