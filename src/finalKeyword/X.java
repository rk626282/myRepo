package finalKeyword;

public class X extends FinalUse {

	public static void main(String[] args) {
	  X x1 = new X();
	  
	  x1.property1();
	  x1.property2();
	  
	

	}
  //we cannot change defination super class  method in sub class due to final keyword use in front of method	
	
//	final public void property2() {
//	System.out.println("dont change my defination");
//	}

}
