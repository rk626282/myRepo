package interfaceStudy;

//multiple inheritance propblem is solve by using interface

public class InterfaceConcept1 implements Father,Mother {

	public static void main(String[] args) {
		
		InterfaceConcept1 ch1= new InterfaceConcept1();
		ch1.care();
		ch1.nature();
		ch1.property();
		ch1.decipline();
		ch1.innocent();

	}

	@Override
	public void care() {
		// TODO Auto-generated method stub
		System.out.println("mother care");
	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub
		System.out.println("mother nature");
	}

	@Override
	public void property() {
		// TODO Auto-generated method stub
		System.out.println("fathers property");
	}

	@Override
	public void decipline() {
		// TODO Auto-generated method stub
		System.out.println("fathers decipline");
	}
	public void innocent() {
		System.out.println("child is innocent");
	}

}
