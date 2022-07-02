package accessModifiers1;

import accessModifiers2.ProtectedUse;

public class ProtectedTest extends ProtectedUse {

	public static void main(String[] args) {
		ProtectedUse m6 = new ProtectedUse();
		m6.display();
	   
	//	m6.display(); //can call only public method only

	//to make use of protected create object of subclass(ProtectedTest)
		
		ProtectedTest m7 =new ProtectedTest();
		m7.display();   //public method
		m7.display4();  //calling protected method with the help of inheritance 
		System.out.println(m7.c); //protected variable
		System.out.println(m7.d); //public variable
		
	}

}
