package interfaceStudy;

public class Sbi implements InterfaceConcept {

	public static void main(String[] args) {
		Sbi sb1 =new Sbi();
		sb1.accountservice();
		sb1.moneytransfer();
		sb1.customerservice();
		System.out.println(a); // calling static variable from super class 

	}

	@Override
	public void accountservice() {
	System.out.println("account service is active");
		
	}

	@Override
	public void moneytransfer() {
	System.out.println("money transfer service is active");
		
	}
	void customerservice () {
		System.out.println("customer service is active");
	}

}
