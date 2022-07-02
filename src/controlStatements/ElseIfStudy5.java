package controlStatements;

public class ElseIfStudy5 {

	public static void main(String[] args) {
		
		//bank atm option 
		//click 1. balance inquiry
		//click 2. amount withdrwl
		//click3. pin change
		//click 4. mobno update
		//click 5. banking services
		// click6. cancel
		
		
	    int option=6;
		
	    
	    if (option==1) {
		System.out.println("WELCOME TO ATM SERVICESS");
		System.out.println("BALANCE ENQUIRY");
			
		}
		
		else if (option==2) {
			System.out.println("AMOUNT WITHDRWAL");
		}
		else if (option==3) {
			System.out.println("PIN CHANGE");
		}
		else if (option==4) {
			System.out.println("NUMBER UPDATE");
		}
		else if (option==5) {
			System.out.println("BANKING SERVICESS");
		}
		else if (option==6) {
			System.out.println("THANK YOU");
		}
		else {
			System.out.println("OPTION INVALID");
		}
		
		
	
	}

}
