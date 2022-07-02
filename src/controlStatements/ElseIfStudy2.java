package controlStatements;

public class ElseIfStudy2 {

	public static void main(String[] args) {

      //if 75-90 you will get grade A
	  //if 66-75marks you will get grade B
	 // IF 40-66 MARKS YOU WILL GET GRADE C
	 // IF LESS THAN 40 YOU WILL GET GRADE D
	char grade='D';

	
	if (grade=='A') 
	{
		System.out.println("MARK RANGE IS 75-90");	
	}		
	else if (grade=='B') 
	{
	 System.out.println("MARK RANGE IS 66-75");
	}
	else if (grade=='C') 
	{
	System.out.println("MARK RANGE IS 40-75");
	}
	else if (grade=='D') 
	{
    System.out.println("MARK RANGE IS LESS THAN 40");
	}
	
	}

}
