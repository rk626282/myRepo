package constructorConcept;

public class CS4 {
	int a;
	int b;
	int c;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CS4 d1= new CS4();
		d1.mul();
		CS4 d2= new CS4(4);
		d2.mul();
		CS4 d3 = new CS4(5, 6);
		d3.mul();
		CS4 d4= new CS4(5, 6, 2);
		d4.mul();
		CS4 d5 = new CS4(3, 5, 3);
		d5.mul();
		CS4 d6= new CS4(5, 8, 1);
		d6.mul();

		
				

	}
	CS4()
	{
	 a=10;
	 b=20;
	 c=30;
	 
	}
   CS4(int x)
   {
	  a=x; 
   }
   CS4(int x, int y)
   {
	   a=x;
	   b=y;
   }
   CS4(int x, int y, int z)
   {
	 a=x;
	 b=y;
	 c=z;
	 
   }
   public void mul()
   {
	   int mul=a*b*c;
	   System.out.println("multiplication is" +mul);
   }
}
