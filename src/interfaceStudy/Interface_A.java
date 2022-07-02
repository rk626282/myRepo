package interfaceStudy;

// SUPER INERFACE 2

public interface Interface_A {

	
	void fruit();                    //1.property
	void apple();                    //2.property
	default void vegitables()              	//3.same name property
	{
	System.out.println("As Vegitables");	
	}
		
	
	
}
