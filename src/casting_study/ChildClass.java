package casting_study;

public class ChildClass extends ParentClass{

	
public static void main(String[] args) {
	ParentClass ps = new ChildClass(); //upcasting
	//ChildClass cs =  (ChildClass)ps;  //downcasting
	//cs.wow();
	//cs.show();
	
	//ps.show(); 
	
  ps.bike();
  ps.show();
  
	
	
}
	
	 public void wow() {
	 System.out.println("wow");
}
}