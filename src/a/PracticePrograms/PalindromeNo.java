package a.PracticePrograms;

public class PalindromeNo {

	//Palindrome no is if we reverse that no it will get same no example 121 >> 121 this is palindrome no.
	
	public static void main(String[] args) {
		int r;
		int sum=0;
		int temp;    
	    
		int n=121;//It is the number variable to be checked for palindrome  
			  
	    temp=n;    
	    while(n>0)
	    {    
		r=n%10;  //getting remainder  //1.>> r=1 <<2.>> r=2 <<3.>>r=1
		sum=(sum*10)+r;               //1.>>sum=1  sum=2  sum=1 = >> sum =121
		n=n/10;                       //1.>>n=12 n=1 n=0 (false)  .....it will continuously till getting sum = given no
			  }    
	   if(temp==sum)    
	   System.out.println("palindrome number ");    
	   else    
	   System.out.println("not palindrome number"); 
	   
			}  
			 

	

}
