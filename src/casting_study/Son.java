package casting_study;
//method overriding is imp here
public class Son extends Father{

	
	 public void car() {             //overriding 
		 System.out.println("honda civic");
	 }
	 public void bike() {            //overriding 
		 System.out.println("java");
	 }
	 public void degree() {          //sub class own method        
		 System.out.println("BE");
	 }
}
