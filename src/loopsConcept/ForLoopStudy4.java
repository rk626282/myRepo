package loopsConcept;

public class ForLoopStudy4 {

	/// NESTED FOR LOOP CONCEPT FOR PYARAMID OUTPUT 
	/// IN THIS ROWS AND COLOUMS ARE IMPORTANT 
	/// COLOUMS ARE DEPEND ON ROWS
	
	public static void main(String[] args) {
		for (int i=1; i<=4; i++) {
		for (int j=4; j>=i; j--) {
		
		 System.out.print("*");
		}
		System.out.println();
	}
}
}
