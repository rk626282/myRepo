package a.PatternPrograms;

public class TriangleLeftAscending {

	public static void main(String[] args) {
		
		// *                // Count Number Of Rows=5;
		// * *             //  Count Number Of Coulmns=5;
		// * * *
		// * * * *
		// * * * * *
		
	   //Rows =5; Columns=5;                           //Step 1: Count No.Of Rows &  No.Of Columns 
	
        int Star =1;                                  //Step 2: Write No. Of Star In First Row 
		
        for(int i=1; i<=5; i++)         //Outer For loop for Rows  //Always Start from Rows
		{
        for(int j=1; j<=Star; j++)     //Inner For loop for Columns
        {
        System.out.print("* ");
        }
        System.out.println();      //For next Line
        Star++;                   // Increment in Star
	}
    
}
}
