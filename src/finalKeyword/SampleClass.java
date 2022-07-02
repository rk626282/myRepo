package finalKeyword;

public class SampleClass extends FinalUse {

	public static void main(String[] args) {
		SampleClass sc1 =new SampleClass();
		FinalUse sc2 =new FinalUse();
		
		sc1.sample();
		
		sc2.sample();
		
		sc1.sample();
		
		sc2.sample();
		
		

	}
	public void sample() //overrided sample method 
	{
	System.out.println("its non-static method from finalUse/superclass class");
	}


}
