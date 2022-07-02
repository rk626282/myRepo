package controlStatements;


// ABOUT NESTED IF ELSE STATEMENT
//if(condition 1) {    
//statement 1; //executes when condition 1 is true   
//if(condition 2) {  
//statement 2; //executes when condition 2 is true   
//}  
//else{  
//statement 2; //executes when condition 2 is false   
//}  
//}  





public class NestedIfElse1 {

	public static void main(String[] args) {
		String UN="Velocity";
		String PWD="Velocity@20";
		
				
		if("Velocity"==UN)
		{
		System.out.println("Username is correct, Please Enter password");
		if("Velocity@202"==PWD)
		{
		System.out.println("Login success");
		}
		else
		{
		System.out.println("Invalid password");
		}
		}
		else
		{
		System.out.println("Please enter correct username");
		}
		
	}
		
		
	}
	
	
	

