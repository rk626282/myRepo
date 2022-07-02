package stringStudy;

public class StringMethods3 {

	public static void main(String[] args) {
	String str = "Velocity Corporate Training Centre Pune";
		
	
	// use of substring method
	System.out.println(str.substring(0));
	System.out.println(str.substring(9));
	System.out.println(str.substring(9, 18));
	
	// use of concat method 
	String a="Velocity ";
	String b="Pune ";
	
	System.out.println(a.concat(b));
	System.out.println(b.concat(a));
	String result1 =a.concat(b);
	System.out.println("result 1 is "+result1);
	System.out.println(a.concat("Mumbai"));
	String result2 =a.concat("Nagpur");
	System.out.println("result 2 is "+result2);
	
	//USE OF indexOf METHOD		
	String c="Velocityee"	;
	System.out.println(c.indexOf('e')); //first occurance index no of e will display
    System.out.println(c.lastIndexOf('e')); //last occurance index no of e will display
    System.out.println(c.indexOf('e', 5)); // show index no of e after reference i so i>index no is 5.
                                           // so it will show index value which is declareafter i.
                                           // before reference i declare e will not consider
    //USE OF replace METHOD
    String state ="Maharashtra";
    System.out.println(state.replace('a', 'n'));  //replace old char to new char 
    System.out.println(state.replace("ra", "rk")); //char seq. replaced
    
    //USE OF split METHOD 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
