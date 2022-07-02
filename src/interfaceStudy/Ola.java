package interfaceStudy;

//hierachical inheritance takes place here one super class gives there properties to multiple sub class
public class Ola implements Transport {
 public static void main(String[] args) {
	
	 Ola o1 =new Ola();
	 o1.safety();
	 o1.ticketbooking();
	 o1.acesstime();
}
	@Override
	public void safety() {
		// TODO Auto-generated method stub
	 System.out.println("safety level is average");
	}

	@Override
	public void ticketbooking() {
		System.out.println("app is avaliable for online booking");
		
	}
   public void acesstime() {
	   System.out.println("24hrs access avaliable");
   }
	

}
