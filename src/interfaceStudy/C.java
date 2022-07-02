package interfaceStudy;

// CLASS C IS IMPLENTATION CLASS FOR INTERFACE B WHICH HAVE EXTENDS PROPERTY OF INTERFACE A
// ALSO CLASS C IS SUB CLASS FOR SUPER INTERFACE B

public class C implements Interface_B{

	public static void main(String[] args) {
		
	C c1 =new C();
	c1.fruit();
	c1.apple();
	c1.flower();
	c1.lotus();
	c1.own();
	
		
		
	}

	@Override
	public void fruit() {
		// TODO Auto-generated method stub
		System.out.println("interface A property");
	}

	@Override
	public void apple() {
		// TODO Auto-generated method stub
		System.out.println("interface A property");
	}

	@Override
	public void flower() {
		// TODO Auto-generated method stub
		System.out.println("interface B property");
	}

	@Override
	public void lotus() {
		// TODO Auto-generated method stub
		System.out.println("interface B property");
	}

    public void own () {
    	System.out.println("this is my own class property");
    }

	
  
	
		
	

}
