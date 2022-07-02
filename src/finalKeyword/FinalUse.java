package finalKeyword;

public class FinalUse {

	public static void main(String[] args) {
		
       int a=90;
       System.out.println("value of a is "+a);
       a=a+10;   // adding +10 in a
       System.out.println("value of a is "+a);
       final int b=30;
       System.out.println("value of b is "+b);
       // b=20+b;   //if we use final keyword then we cannot modified that value again
	}
	public void sample() {
		System.out.println("its non-static method");
	}
	
	public void property1() {
		System.out.println("dont change my property in sub class");
	}
	final public void property2() {
		System.out.println("just non static methdod ");
	}

}
