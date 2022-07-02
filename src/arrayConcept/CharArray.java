package arrayConcept;

public class CharArray {

	public static void main(String[] args) {
//STORE VALUE OF GRADE OF THE 4 STUDENT
		char grade[]=new char[4];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		
//		System.out.println(grade[0]);
//		System.out.println(grade[1]);
//		System.out.println(grade[2]);
//		System.out.println(grade[3]);
		
		//for(int i=0; i<=3;i--) {        //printing sequentially from A to D
		//System.out.println(grade[i]);   // This is static coding when fix value and operation perform for that fix value only 
		
		for(int i=3; i>=0;i--) {          //printing reverse sequentially from D to A
	    System.out.println(grade[i]);     // This is static coding when fix value and operation perform for that fix value only 
		}
	
	for(int i=grade.length-1; i>=0;i--) { // // This is dynamic coding when update value automically depending on sitution
	    System.out.println(grade[i]);
		
 
		
		}
	 System.out.println("==========================================");
	 for(int i=0; i<=grade.length-1;i++) {    // This is dynamic coding when update value automically depending on sitution
		 System.out.println(grade[i]);
	 }
		
		

}
}