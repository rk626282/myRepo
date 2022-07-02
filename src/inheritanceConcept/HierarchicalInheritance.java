package inheritanceConcept;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 ch1= new Child1();
		ch1.laptop1();
		Child1.mobile1();
		ch1.decipline();
		Father.property();
		
		Child2 ch2= new Child2();
		ch2.laptop2();
		Child2.mobile2();
		ch2.decipline();
		Father.property();
		
		Father f1 = new Father();
		f1.decipline();
		Father.property();
		
		
		

	}

}
