package a.PracticePrograms;

public class RemoveSpeChar {

	public static void main(String[] args) {
	       
		String str ="#@$acc##@@&enture";
		//System.out.println(str.replaceAll("#@$##@@&", ""));
		String b=str.replaceAll("[#@$##@@&]", "");
		System.out.println("THE NEW STRING IS "+b);
		
		
	}

}
