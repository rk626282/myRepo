package abstractClass;

public class CC extends Test{

	
		
   public static void main(String[] args)
	{
	CC c= new CC();// created object of concrete class c.test();//
	c.test1();
	c.test();
	}
	@Override public void test()
	{
	System.out.println("Test method of Abstract class complted in concrete class");
	}
			
		
	

}
