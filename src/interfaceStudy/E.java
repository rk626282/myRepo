package interfaceStudy;

// CLASS 'E' IS SUB CLASS FOR : SUPER INTERFACE 'A' & SUPER INTERFACE 'D'

public class E implements Interface_A,Interface_D{

	public static void main(String[] args) {
		
     E e1 =new E();
     e1.organic();
     e1.nonorganic();
     e1.fruit();
     e1.apple();
     e1.vegitables();
     
		
		
	}

	@Override
	public void organic() {
		// TODO Auto-generated method stub
		System.out.println("D organic");
	}

	@Override
	public void nonorganic() {
		// TODO Auto-generated method stub
		System.out.println("D non-rganic");
	}

	@Override
	public void fruit() {
		// TODO Auto-generated method stub
		System.out.println("A fruits");
	}

	@Override
	public void apple() {
		// TODO Auto-generated method stub
		System.out.println("A apples");
	}

	@Override
	public void vegitables() {
		// TODO Auto-generated method stub
		Interface_A.super.vegitables();
		Interface_D.super.vegitables();
	}
	
	

}
