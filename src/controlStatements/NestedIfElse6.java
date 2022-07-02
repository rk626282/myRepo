package controlStatements;

public class NestedIfElse6 {

	public static void main(String[] args) {
		String country="INDIA";
		String state="MAHARASHTRA";
		int stateno=1;
		
		
	
      if (country=="INDIA") {
    	  System.out.println("welcome in india");
	  if (state=="MAHARASHTRA") {
		  System.out.println("you are in maharashtra");
	  if (stateno==1) {
		  System.out.println("state no 1");
		
	} else {
   System.out.println("invalid state no");
	}	
	} else {
   System.out.println("invalid state");
	}
	} else {
   System.out.println("you are not in india");
	}
		
		
		
	}

}
