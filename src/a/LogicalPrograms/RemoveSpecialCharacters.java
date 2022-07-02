package a.LogicalPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
//		String str ="%#@$acc##@@&enture";
//		String b=str.replaceAll("[#@$##@@&]", "");
//		System.out.println(b);
		
//System.out.println(str.replaceAll("#@$##@@&", ""));
		
		String str2 ="%@$R@A&&N#J!!I@@T_";
	 //   String c=str2.replaceAll("[^a-zA-Z0-9]", "");
	    String result = str2.replaceAll("[^a-zA-Z-0-9]", "");
		
		System.out.println(result);
		
	    
		
		
	}

}
