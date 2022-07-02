package a.LogicalPrograms;

public class ReverseStringUsingStringMethod {

	public static void main(String[] args) {
		System.out.println("REV STRING BY USING FOR LOOP");
		String str="RANJIT";
		
		for(int i=str.length()-1;i>=0;i--) 
		{
		char rev=(str.charAt(i));
		System.out.print(rev);
		}
		
	}

}
