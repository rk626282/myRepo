package casting_study;

public class Upcasting {

	public static void main(String[] args) {
	
//	Son s = new Son();
//	s.bike();
//	s.degree();
//	s.car();
//	
//	
	//Father f = new Father();
//	f.car();
//	f.bike();

	// CREATING OBJECT OF SUBCLASS & GIVING REFERENCE OF SUPERCLASS 
	
	Father f1= new Son();
	//Son  c =new Father(); //compile time error for downcasting
	f1.bike();   // elgible for casting 
	f1.car();    // elgible for casting 
  //f1.degree();  // not elgible for casting beacuse its not common propery in between subclass and superclass
	
	//Son  c =new Father(); //compile time error for downcasting
	
	
	
	}

}
