package globalAndLocalVariables;

public class Ex6 {
	
	int x=10;
	int y=15;
	static int z=20;

	public static void main(String[] args) {
		sample1();
		Ex6 gl =new Ex6();
		gl.sample2();
		

	}
      public static void sample1()
      {
    	  int sum=100+z;
    	  System.out.println("sum is "+sum);
      }
      public void sample2()
      {
    	 int mul=x*y;
    	 System.out.println("multiplication is "+mul);
    	 float div=y/z;
    	 System.out.println("div is "+div);
      }
}
