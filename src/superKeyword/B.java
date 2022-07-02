package superKeyword;

// CLASS B IS SUB CLASS

public class B extends A{
	
	int a=800;
	

	public static void main(String[] args) 
	{
	B b=new B();
	b.simple();
		
		
	}
    public void simple()
    {
    	int a=10;
    	int sum1=a+20;        //local variable from same class
    	int sum2=this.a+30;  //global variable from same class
    	int sum3=super.a+30; //access global variable from super class
    	System.out.println("sum1 is "+sum1);
    	System.out.println("sum2 is "+sum2);
    	System.out.println("sum3 is "+sum3);
    }
    
}
