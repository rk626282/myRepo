package regularMethod;

public class WithParameter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  batchinfo1();
	  WithParameter2 m=new WithParameter2();
	  m.batchinfo("SHRIDHAR", "ANGULAR JS", 42000, 3.5f);
	  m.batchinfo("KUNAL", "CLOUD COMPUTING", 35000, 03);
	  m.batchinfo("SUDHIR", "DATA SCIENCE", 25000, 04);
	  AnotherClass2.diffClass2();
	  AnotherClass2 se=new AnotherClass2();
	  se.diffClass3("TUSHAR", "C-LANGUAGE", 10000, 2);
	  se.diffClass3("ROHIT", "C++ LANGUAGE", 15000, 3);
	  
			  
	  
		

	}
	  //static method
	 //method with parameter
	//studentname coursename fee courseduration
    public void batchinfo(String name,String coursename, int fee, float courseduration)
   
    {
   
    System.out.println("====================================");
    System.out.println("STUDENT NAME    : "+name);	
    System.out.println("COURSE NAME     :"+coursename);
    System.out.println("COURSE FEE      : "+fee);
    System.out.println("COURSE DURATION IN MONTH: "+courseduration);
    
    }
    
    //method without parameter
    //studentname coursename fee corseduration
    public static void batchinfo1() //static method 
    {
    	System.out.println("====================================");
    	String name= "RAHUL";
    	String coursename="SOFTWARE TESTING";
    	int fee=42000;
        float courseduration=3.5f;
        System.out.println("STUDENT NAME IS "+name);
        System.out.println("COURSE NAME IS "+coursename);
        System.out.println("FEE IS IN Rs- "+fee);
        System.out.println("COURSE DURATION IS "+courseduration);
        System.out.println("====================================");
        System.out.println("====================================");
    	
    }
}
