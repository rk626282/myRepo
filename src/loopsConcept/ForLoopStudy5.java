package loopsConcept;


/// NESTED FOR LOOP CONCEPT FOR PYARAMID OUTPUT 
/// IN THIS ROWS AND COLOUMS ARE IMPORTANT 
/// COLOUMS ARE DEPEND ON ROWS

public class ForLoopStudy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i = 1; i<=4; i++) 
        {
        
        for (int j=4; j>=i; j--) 
        {
		
        System.out.print("*");
		
        }
       
        System.out.println();
	}

}
}