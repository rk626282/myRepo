package polymorphismConcept;

// METHOD OVERLOADING : DECLARING MULTIPLE METHODS WITH SAME METHOD NAME BUT WITH DIFFERENT 
//                      ARGUMENTS IN A SAME CLASS IS CALLED AS METHOD OVERLOADING.

public class ClassR {
     public static void main(String[] args) {
		ClassR r =new ClassR();
		r.mul();
		r.mul(4, 6);
		r.mul(5.6f, 6.5f);
		
	}
	
	public void mul() //ZERO PARAMETER/ZERO ARGUMENTS
	{
		int a=5; int b=6;
		int mul=a*b;
		System.out.println("MULTIPLICATION IS "+mul);
	}
	public void mul (int c,int d) // WIH ARGUMENTS 
	{
     int mul=c*d;
	System.out.println("multiplication is "+mul);	
	}
	public void mul(float e, float f) // WIH ARGUMENTS
	{
		double mul=e*f;
		System.out.println("mul of float value is "+mul);
	}
}
