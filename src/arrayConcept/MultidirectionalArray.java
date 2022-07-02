package arrayConcept;

public class MultidirectionalArray {

	public static void main(String[] args) {
		
		int ar[][]= {{1,2},{3,4}};
//		System.out.print(ar[0][0]+" ");
//		System.out.print(ar[0][1]+" ");
//		System.out.println();
//		System.out.print(ar[1][0]+" ");
//		System.out.print(ar[1][1]+" ");
//		System.out.println();
//		System.out.println("===============");
//		for(int i=0;i<=ar.length-1;i++)//outer for loop--> for row
//		{ for(int j=0;j<=ar.length-1;j++)//inner for loop --> column
//		{
//		System.out.print(ar[i][j]+" ");
//		}
//		System.out.println();
//		}
//		System.out.println("==========================");
//		System.out.print(ar[0][0]+ " ");
//		System.out.print(ar[0][1]);
//		System.out.println();
//		System.out.print(ar[1][0]+" ");
//		System.out.print(ar[1][1]);
//		System.out.println();
//		System.out.println("==========================");
		
		
		//i=0 check condition 0<2 true then switch to inner loop
		//i=1 will updated value of i then check condition 1<2 true then switch to inner loop
		//i=2 will updated value of i then check condition 2<2 false then switch to terminate the statement.
		
		for (int i=0; i<=ar.length-1;i++)  //outer for loop>> for rows 
		{
		          
			
		
		//	j=0; check 0<=2 true then execute the printing statement
	   //	j=1; check 1<=2 true then execute the printing statement
       //   j=2; check 2<2 false then execute the prinln statement cursor will move next line
			
		//then process will repeate of j from starting
        //j=0; check 0<=2 true then execute the printing statement
		//j=1; check 1<=2 true then execute the printing statement	
		//j=2; check 2<=2 false then execute the println statement for next line 
			
		for(int j=0;j<=ar.length-1;j++)	{  //inner for loop>>for coloums
			
		System.out.print(ar[i][j]+" "); 
		               //i=0; ,j=0; then print no 1 for ar(0,0)position
		               //i=0;  j=1; the  print no 2 for ar(0,1)position
		
		               // for 2nd time process 
		              //  i=1; ,j=0; then print no 3 for ar(1,0)position
		              //  i=1; ,j=1; then print no 4 for ar(1,1)position
		
		} 
		System.out.println(); 
		}       
		               
		
		 
		
		
		
		
	}

}
