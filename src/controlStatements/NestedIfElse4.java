package controlStatements;

public class NestedIfElse4 {

public static void main(String[] args) {
	
	// swipe card>> welcome to sbi atm //else card is not accepted
	// enter pin > login sucess       //else pin is incorrect
	
 String ATM="SWIPE YOUR CARD";
 int pin=1234;
	
if (ATM=="SWIPE YOUR CARD") 
	
    { 
	System.out.println("WELCOME TO SBI ATM");
	System.out.println("ENTER YOUR PIN");
	if (pin==1234) 
	{
	System.out.println("LOGIN SUCCESS");
    } 
	else {
   System.out.println("INVALID PIN");
	}
    }
   else 
   {
	 System.out.println("CARD IS NOT SWIPE");  
   }


}






}
		 
		 
		 
		 
 
    
	
		 
	

