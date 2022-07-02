package abstractClass;

// Created concrete class for completing incomplte method to complete method
public class Z extends X {

	public static void main(String[] args) {
		
     Z z1 = new Z();
     z1.accountinfo();
     z1.recharge();
     z1.moneytransfer();
	}
    public void accountinfo()  // own method of concrete class
    {
    	System.out.println("this is about account info ");
    }
	@Override
	public void moneytransfer() //method was incomplete in abstract class so completed in concrete class
	{
		System.out.println("this is moneytransfer platform");
		
	}
}
