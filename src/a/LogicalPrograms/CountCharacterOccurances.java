package a.LogicalPrograms;

public class CountCharacterOccurances {

	public static void main(String[] args) {
		String s="java programming java oops";
	    
		int totalCount= s.length(); //total length 5
		
		int totalCount_AfterRemove = s.replace("a", "").length();
		
		int count = totalCount-totalCount_AfterRemove;
		
		System.out.println(count);
        
	}

}
