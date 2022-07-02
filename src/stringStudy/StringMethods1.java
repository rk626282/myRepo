package stringStudy;

public class StringMethods1 {

	public static void main(String[] args) {
		String name="Velocity"; // object create without using new keyword
		String s="Velocity";    // So it will be store in constant pool area
		
		String name1 = new String("Velocity12345");  //object create using new keyword
		String name2 = new String ("Velocity");      //so it will be store in non-constant pool area
		String name3 = new String ("Velocity");
		String name4 = new String ("softwaretesting");
		String name5 = new String("SOFTWARE");
		String name51 = new String("SOFTWARE");
        
		//use of length method 
		System.out.println("The lenghth of String Is "+name.length());
		
		int LengthOfString=name.length();  //length store in refrence variable for future use
		System.out.println("string length is "+LengthOfString);
		
		System.out.println("String length of name1 is "+name1.length());
		
		// use of toUpperCase Method
		System.out.println(" "+name.toUpperCase());
		String capitalValueOfS=s.toUpperCase();
		String uppercase = name4.toUpperCase();
		System.out.println(uppercase);
		
		//USE OF lower CASE
		System.out.println("lower case of string is "+name.toLowerCase());
		String lowercase = name5.toLowerCase();
		System.out.println("lower case value of name5 is "+lowercase);
		
		// use of equals method
		//== compare memory locations
		System.out.println(name==s); //both name & s is created without using new keyword
		System.out.println(name==name2); //name  having memory in constant pool area 
		                                //name 2 having memory in non-constant pool area
		                               // both locations are different
		  System.out.print(name2==name3); //both having memorylocation is different so false
		  System.out.print("5."+name5==name51);
		  System.out.println(name4.equals(name5));
		  
		  
		  boolean equals =name5.equals(name51);
		  System.out.println(equals);
		
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
