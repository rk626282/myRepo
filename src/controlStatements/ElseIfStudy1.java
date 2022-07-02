package controlStatements;

public class ElseIfStudy1 {
//	
//	ABOUT ELSE-IF STATEMENT 
//	SYNTAX:
//	    if(condition 1) {    
//		statement 1; //executes when condition 1 is true   
//		}  
//		else if(condition 2) {  
//		statement 2; //executes when condition 2 is true   
//		}  
//		else {  
//		statement 2; //executes when all the conditions are false   
//		}  
	
	
	
	
	

	public static void main(String[] args) {

     //elseif control statement is used for multiple conditions
	 //if mark is greter than or equal to 75 then you get dist.
	 //if mark is greter than or equal to 66 then you get 1st class
     //if mark is greter than or equal to 40 then you are pass
     //if mark is less than 40 then you are fail
		
		int mark=39;
		if (mark>=75) 
		{
			System.out.println("PASS WITH DIST");
		}
		else if (mark>=66) 
		{
			System.out.println("PASS WITH FIRST CLASS");
		}
		else if (mark>=40) 
		{
			System.out.println("PASS");	
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
