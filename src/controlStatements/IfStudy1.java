package controlStatements;

public class IfStudy1 {

	public static void main(String[] args) {
	
	//if statment only for one condition true or false single condition	
    //if your  marks are more than or equal to 75 then you are in dist
	
//	 About if statement :
//	 Syntax:
//	 if (condition1) {
//	 statement1. //executes when condition 1 is true
//	 }
		
		
		
	int marks;
	marks=78;
	
	
	
	if (marks>=75) 
	{	
	System.out.println("PASS WITH DISTINCTION");
		
	}
	
	//if marks equal to 75 then also print dist. true condition
	
	int marks1=75;
	
	if (marks1>=75)
	{	
		System.out.println("PASS WITH DISTINCTION");
			
		}
	
	//if marks below 75 false condition it will not execute
  
	
	int marks2=60;
	
	if (marks2>=75)
	{	
		System.out.println("PASS WITH DISTINCTION");
			
		}
	
	}
    
    
}
