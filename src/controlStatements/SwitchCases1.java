package controlStatements;

public class SwitchCases1 {

	public static void main(String[] args) {
		// engg student
		//1.>>>first year
		//2.>>>second year
		//2.>>>third year
		//4.>>>second year
	    //invalid year	
		
	  int year=2;
	 
			  
	 switch (year) {
	 case 1: System.out.println("first year");
	 break;
	 case 2: System.out.println("second year");
	 break;
	 case 3: System.out.println("third year");
	 break;
	 case 4: System.out.println("fourth year");
	 break;
	 default: System.out.println("invalid year");
	 break;
	}
		
	}

}
