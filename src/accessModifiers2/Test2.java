package accessModifiers2;

public class Test2 {

	public static void main(String[] args) 
	{
		ProtectedUse p1 =new ProtectedUse(); //object creted of another class
		p1.display();  // call public method in another class
		p1.display2(); // call default method in another class
		p1.display4(); //call protected method in another class
		
		
	//	System.out.println(p1.a); //cant call due to private variable
		System.out.println(p1.b); //call default varaible
		System.out.println(p1.c); //call protected variable another class and scope is within package 
		                          //we can call it with the help of inheritance
		System.out.println(p1.d); //call public variable with another class
        
	}

}
