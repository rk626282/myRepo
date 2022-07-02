package accessModifiers1;

public class MyClass2 {

	public static void main(String[] args) {
		
  DefaultUse m2 =new DefaultUse();// created object of another class
		m2.test1(); //calling public method from another class
		m2.test2(); //calling default method from another class
	//	m2.test3(); //cant call private method in another class
	
		System.out.println(m2.a);//calling default variables from another class
		System.out.println(m2.b);//calling public variables from another class
	//	System.out.println(m2.c); //cannot call private variable from another class
         
	}

}
