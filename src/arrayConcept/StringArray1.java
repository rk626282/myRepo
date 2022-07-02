package arrayConcept;

public class StringArray1 {

	public static void main(String[] args) {
		
		String name[]=new String[3];
		name[0]="RANJIT";
		name[1]="MANOHAR";
		name[2]="KAMBLE";
		
		for (int i=0; i<=name.length-1;i++) {
			System.out.println(name[i]);
		
			
		}
		System.out.println("============================");
//		System.out.println("============================");
//		for (int i=0; i<=1;i++) {
//			System.out.print(name[i]+" ");
//		
//		}
		
		for (int i=name.length-1;i>=0; i--) {
			System.out.println(name[i]+" ");
		}	
		System.out.println("============================");
		
	}

}
