package stringStudy;

public class StringMethods2 {

	public static void main(String[] args) {
		String name="PUNE"; // object create without using new keyword
		String s="pune";    // So it will be store in constant pool area
		String t="";
		String u=" ";
		String r="MUMBAI PUNE MUMBAI";
	//	String p= null;
		
		String name1 = new String("Pune");  //object create using new keyword
		String name2 = new String ("Pune"); //so it will be store in non-constant pool area
		String name3 = new String ("MUMBAI");
		String name4 = new String ("Mumbai");
	
		//USE OF equal METHOD 
		System.out.println(name.equals(s));
		boolean result =name.equals(s); //case sensitive
		System.out.println("result of name & is "+result);
		boolean result0 = name1.equals(name2);
		System.out.println("resulto is "+result0);
		
		System.out.println(name3.equalsIgnoreCase(name4)); //equal ignore case method is not case sesitive
		boolean result1 =name3.equalsIgnoreCase(name4);    // just compare contents case sesitive is not matter
		System.out.println("Equal Ignorance case Result is "+result1);
		
	    // USE OF contains() method
		System.out.println(s.contains("ne")); //chcek contains is presesnt or not but in sequence wise
		System.out.println(name4.contains("mai"));  //randomly characters not taken
		System.out.println(name3.contains("bai")); //this method is case sensitive and take sequence wise character
		System.out.println(name3.contains("MUM"));
		boolean result2 = name1.contains("une");
		System.out.println("result 2 is "+result2);
		
		// USE OF isEpmty METHOD
		System.out.println(s.isEmpty());
		System.out.println(t.isEmpty()); //if and if only length is 0
		System.out.println(u.isEmpty()); //if length is 0 and white space is there its shows its not empty
		System.out.println(u.isBlank()); // use isBlank method if we have to chcek contains empty with accuracy
		                                 // suppose length is 0 And white space is there so its not shows empty by using isEpmty method
		                                // so use that time isBlank method 
		//null exception 
	//	String n=null;
	//	System.out.println(n.isEmpty()); //nullpoint exception error
		String l=" ";
		System.out.println(l.isEmpty());
		boolean stringl=l.isEmpty();
		System.out.println("string l result is "+stringl);
		System.out.println(l.isBlank());
		boolean stringl2=l.isBlank();
		System.out.println("string l2 result is "+stringl2);
		System.out.println(l.length());
		int stringl3=l.length();
		System.out.println("string l3 result is "+stringl3);
		
		//USE OF charAt() METHOD
		System.out.println(name.charAt(0));
		System.out.println(name3.charAt(4));
		char result3 =name4.charAt(0);
		System.out.println("result 3 is "+result3);
		//System.out.println(name4.charAt(8)); //exeception error there is no char at index 8
		                                     //String Index Out Of Bounds Exception error
		
		//Study of endsWith() method
		System.out.println(name.endsWith("NE"));
		System.out.println(name.endsWith("PU"));
		System.out.println(name.endsWith("UN"));
		System.out.println(name3.endsWith("MUMBAI"));
		boolean result4 = name4.endsWith("bai");
		System.out.println("result 4 "+result4);
		
		//Study of startsWith() method
		System.out.println(name.startsWith("PU"));
		System.out.println(name4.startsWith("Mumbai"));
		boolean result5 = name4.startsWith("Mum");
		System.out.println("result 5 is "+result5);
		
		//Study of substring() method
		System.out.println(r.substring(0));
		System.out.println(r.substring(6));
		System.out.println(r.substring(0, 18));
		
		
		
		
		
		
		
          
	}

}
