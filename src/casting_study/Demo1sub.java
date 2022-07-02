package casting_study;

public class Demo1sub extends Demo2parent{

	public static void main(String[] args) {
		Demo2parent p1 =new Demo1sub(); //upcasting
		p1.marriage();
		p1.property();
		
	// Demo1sub c1 = (Demo1sub) new Demo2parent (); //down casting compile time error not show but at the time of execution exception comes.
	                                               // i.e. java.lang.ClassCastException: 
	 
	 Demo1sub c1= (Demo1sub)p1;               //it will work to perform downcasting
	 c1.bike();                               //we can access all the methods and varibles of both classes
	 c1.marriage();
	 c1.property();
       
	}
	public void marriage() {                       //overiding method in sub class
		System.out.println("R");
	}
	public void property() {
		System.out.println("PARENT BLESSINGS");   //overiding method in sub class
	}
	public void bike() {                          //sub class own method
		System.out.println("bike");              
	}

}


