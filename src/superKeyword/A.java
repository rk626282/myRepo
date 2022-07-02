package superKeyword;

// CLASS A IS SUPER CLASS

public class A {

	int a=50;   //global value of a
	
	public static void main(String[] args) {
		
	}
   public void test()
   {
	   int a=60;
	   int add1=a+70;
	   int add2=this.a+70;
	   System.out.println("add1 is "+add1);
	   System.out.println("add2 is "+add2);
   }
}
