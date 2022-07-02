package interfaceStudy;

public class CityBus implements Transport{

	public static void main(String[] args) {
		CityBus c1= new CityBus();
		c1.safety();
		c1.ticketbooking();
		c1.acesstime();

	}

	@Override
	public void safety() {
		// TODO Auto-generated method stub
		System.out.println("safety level is best");
	}

	@Override
	public void ticketbooking() {
		// TODO Auto-generated method stub
	 System.out.println("offline booking is avaliable");
	}
	  public void acesstime() {
		   System.out.println("limited time access avaliable");
	   }
}
