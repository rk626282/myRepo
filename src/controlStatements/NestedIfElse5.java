package controlStatements;

public class NestedIfElse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String country="INDIA";
		String state="MAHARASHTR";
		
		if (country=="INDIA") {
		System.out.println("WELCOME IN INDIA");
		if (state=="MAHARASHTRA") {
			System.out.println("YOU ARE IN MAHARASHTRA");
		} 
		else {
           System.out.println("INVALID STATE");
		}
	    } 
		else {
			 System.out.println("YOU ARE NOT IN INDIA");
		}
	}

}
