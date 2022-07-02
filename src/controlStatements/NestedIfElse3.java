package controlStatements;

public class NestedIfElse3 {
	

	public static void main(String[] args) {
	String UI="RK";
	int    PASS=123;
	
	if (UI=="RK") {
	System.out.println("ENTER PASSWORD");
	if (PASS==123) {
	System.out.println("SUCESSFULL LOGIN");
		
	} 
	else {
		System.out.println("LOGIN ERROR");
	}
		
	} 
	else {
		System.out.println("USERNAME ERROR");
	}
	
	
}

}
