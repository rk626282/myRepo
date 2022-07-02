package constructorConcept;

public class BasicEx1 {
	//use of constructor for initializing data members
	
	String cityname="Pune"; //variable declration manually also initialize
	
	String name;  //  variable declration
	String name1; // variable declaration
	int rollno;   // variable declaration
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        BasicEx1 ex1= new BasicEx1(); //created object 
        ex1.display();                //to call non-static method
       
       
	}
	  BasicEx1() //constructor declaration 
	 {
	name="velocity";  // variable/data members initilize in constructor
	name1="software testing";
	 }
	 
	 public void display () //nonstatic method
	 {
		
		 System.out.println(name);
		 System.out.println(cityname);
		 System.out.println(name1);
	 }
	


	
}

	 
   
