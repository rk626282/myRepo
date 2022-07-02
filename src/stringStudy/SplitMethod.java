package stringStudy;

public class SplitMethod {

	public static void main(String[] args) {
		String collegename = new String ("GOVT POLYTECHNIC WASHIM"); 
		String c =(" " );
		String[] output=collegename.split(c);
		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);
        System.out.println("===========================================");
		
        String collegename1 = new String ("GOVT_POLYTECHNIC_WASHIM"); 
		String d =("_" );
		String[] output1=collegename1.split(d);
		System.out.print(output[0]+" ");
		System.out.print(output[1]+" ");
		System.out.print(output[2]);
		System.out.println();
		System.out.println("===========================================");
		String country = new String ("I:LOVE:MY:INDIA");
		//String y =" ,";
		String [] output2 =country.split(":");
	    for (int i=0; i<=output2.length-1;i++) {
	    	System.out.println(output2[i]);
	    }
	

}
}