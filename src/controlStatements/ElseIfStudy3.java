package controlStatements;

public class ElseIfStudy3 {

	public static void main(String[] args) {
		
		String season="MANSOON";
		
	if (season=="SUMMER") 
	{
		 System.out.println("TEMP RANGE IS 25-50");	
	}
	else if (season=="WINTER") 
	{
		System.out.println("TEMP RANGE IS 1-10");	
	}
	else if (season=="MANSOON")
	{
		System.out.println("TEMP RANGE IS 11-10");
	}
	else
	{
		System.out.println("TEMP RANGE IS 0");	
	}
	}

}
