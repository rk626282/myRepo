package regularMethod;

public class AnotherClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diffClass2();
		AnotherClass2 ob3= new AnotherClass2();
		ob3.diffClass3("null", "null", 1, 2);
		ob3.diffClass3("null1", "null2", 10, 20);

	}
   public static void diffClass2() //static method without parameter
   {
	   System.out.println("====================================");
   	String name= "ROSHAN";
   	String coursename="PROGRAMMING CLASSES";
   	int fee=42000;
       float courseduration=3.5f;
       System.out.println("STUDENT NAME IS "+name);
       System.out.println("COURSE NAME IS "+coursename);
       System.out.println("FEE IS IN Rs- "+fee);
       System.out.println("COURSE DURATION IS "+courseduration);
       System.out.println("====================================");
       System.out.println("====================================");
   	   
	   
	   
	   
	   
	   
   }
   public void diffClass3(String name,String coursename, int fee, float courseduration) //nonstatic method with parameter
   {
	    System.out.println("====================================");
	    System.out.println("STUDENT NAME    : "+name);	
	    System.out.println("COURSE NAME     :"+coursename);
	    System.out.println("COURSE FEE      : "+fee);
	    System.out.println("COURSE DURATION IN MONTH: "+courseduration);  
	   
	   
	   
	   
   }
}
