package accessModifiers2;

public class ProtectedUse {

	private int a=5;
	        int b=7;
   protected int c=8; 
   public    int d=9;
	
	
	public static void main(String[] args) {
		
     //we can call all members of class
		
		
	}
    public void display() {
    	System.out.println("its public method");
    }
    void display2() {
    	System.out.println("its default method");
    }
    private void display3() {
    	System.out.println("its private method");
    }
    protected void display4() {
    	System.out.println("its protected method");
    }
}
