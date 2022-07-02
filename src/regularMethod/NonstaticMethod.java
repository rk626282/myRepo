package regularMethod;

public class NonstaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonstaticMethod price=new NonstaticMethod();
		price.bikeprice();//call non static method for same class
		Demo3 multiply=new Demo3();//created new object 
		                           //for that we taken that class name
		                           //which we want to call and new object created
		multiply.multiplication();//call non static method for diff class
		multiply.multiplication();
		multiply.multiplication();
		
		

	}
	public void bikeprice() //non static method
	{
		int bike1price;
		int bike2price;
		bike1price=50000;
		bike2price=25000;
		int priceofbothbike;
		priceofbothbike=bike1price+bike2price;
		System.out.println("Total price of bike is "+priceofbothbike);
		
				
	}
	
	

}
