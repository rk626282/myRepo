package inheritanceConcept;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Mother m=new Mother(); // creating object of mother class
		m.money();
		m.home();
		
		Son s= new Son(); //creating object of child class 
		s.laptop();   //using own property
		s.mobile();
		
		s.home();    //using superclass property 
		s.money();   
		
		

	}

}
