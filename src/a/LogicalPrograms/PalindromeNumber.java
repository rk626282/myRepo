package a.LogicalPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
	 int reminder;
	 int tempVariable;
	 int sum=0;
     
	 int number =122;
     
     tempVariable= number;
     while(number>0) {
    	 reminder=number%10;
    	 sum=(sum*10)+reminder;
    	 number=number/10;
    	 }
     if(tempVariable==sum) {
    	 System.out.println("palindrome number ");
     }
     else {
    	 System.out.println("its is not palindrome number"); 
     }
	}

}
