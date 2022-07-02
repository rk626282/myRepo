package a.PatternPrograms;

public class TriangleLeftDescending {

	public static void main(String[] args) {
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
      
		//Step 1:  No.Of Rows=5, No.Of Columns=5;
		 
		int star =5;  //No.Of Rows in first Line
		
		for(int i=1; i<=5; i++) 
		{
			for(int j=1; j<=star; j++)
			{
			System.out.print("* ");	
			}
			System.out.println();
			star--;
		}
    		  
	}

}
