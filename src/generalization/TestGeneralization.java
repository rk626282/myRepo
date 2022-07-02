package generalization; 
//GENERALIZATION IS THE PROCESS OF EXTRACTING SHARED CHARACTERSTICS FROM TWO OR MORE CLASSES (SUBCLASSES)
//AND COMBINING THEM INTO A GENERALIZED SUPER CLASS (i.e. SUPER INTERFACE).
//GENERALIZTION FILE CAN BE NORMAL JAVA CLASS OR ABSTRACT CLASS OR INTERFACE. BUT ONLY INTERFACE IS RECOMMENDED.

public class TestGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass1 j1= new SubClass1();
		j1.call();
		j1.msg();
		j1.data();
		j1.ownmethodJIO();
		
		System.out.println("=========================");
		System.out.println("=========================");
		
		SubClass2 a1 = new SubClass2 ();
		a1.call();
		a1.msg();
		a1.data();
		a1.ownmethodAirtel();
		
		System.out.println("=========================");
		System.out.println("=========================");
		
		SubClass3 vi1= new SubClass3();
		vi1.call();
		vi1.msg();
		vi1.data();
		vi1.ownmethodVI();
		
		System.out.println("=========================");
	}

}
