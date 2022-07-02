package a.PracticePrograms;

public class ReverseString1 {
   //REV STRING BY USING FOR LOOP , WHILE LOOP , DO WHILE LOOP
	
	public static void main(String[] args) {
		System.out.println("REV STRING BY USING FOR LOOP");
		String revname="RANJIT";
		for(int i=revname.length()-1;i>=0;i--) 
		{
		System.out.print(revname.charAt(i));  //by using string charAt() method 
		}
		
		System.out.println();
		System.out.println("==================================");
		System.out.println("REV STRING BY USING WHILE LOOP");
		String name="RAJU";
		int i=3;  //iniitialization
		while(i>=0) 
		{
		System.out.print(name.charAt(i));
		i--;
	    }
		System.out.println();
		System.out.println("==================================");
		System.out.println("REV STRING BY USING DO WHILE LOOP");
		
		String name2="RAHUL";
		int j=4; //initialization
		do {
			System.out.print(name2.charAt(j));
			j--;
		} while(j>=0);
		
}
}
