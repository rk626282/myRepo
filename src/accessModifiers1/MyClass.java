package accessModifiers1;

public class MyClass {

	public static void main(String[] args) {
		PrivateUse p2=new PrivateUse(); //created object of another class
		p2.test(); //calling public method from another class
	//p2.tes1 private method is not call here because of private method so its scope is limited for that class only	
		System.out.println(p2.a); // calling public global variable
	// System.out.println(p2.b); cannot call here due to private global variable 
    
	}

}
