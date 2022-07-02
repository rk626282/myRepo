package a.PatternPrograms;

public class StarBox {

	public static void main(String[] args) {
		
		 //   * * * * *      // 3 rows
		//    * * * * *      // 5 columns
		//    * * * * *      // Always start with Rows (Outer loop)
	
	 
		for(int i=1; i<=3;i++)                    //Outer for loop for Rows (Count Rows) here rows=3
	    {
	    for(int j=1; j<=5; j++)                   //Inner for loop for Columns (Count Columns) here columns=5
	    {                    
		System.out.print("* ");	                  // use only print
		}
	    System.out.println();                    //Print statement for moves cursor next line               
	}
		
	}

}
