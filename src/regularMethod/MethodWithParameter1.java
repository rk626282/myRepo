package regularMethod;

public class MethodWithParameter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MethodWithParameter1 davg=new MethodWithParameter1(); //object created
//		davg.result();
//		studentinfo();
//		
//		davg.addition1(4, 5);
//		davg.addition1(20, 40);
//		davg.addition1(50, 50);
//	    davg.classinfo("rushi", 15, "123456789", 23.6f, 8, 'M');
//	    davg.classinfo("raj", 15, "66454545", 25.23f, 9, 'M');
//	    
//		
		MethodWithParameter1 ob1= new MethodWithParameter1();
		ob1.result();
		studentinfo();
		MethodWithParameter1 ob2= new MethodWithParameter1();
		ob2.additon();
		MethodWithParameter1 ob3= new MethodWithParameter1();
		ob3.addition1(2, 3);
		MethodWithParameter1 ob4= new MethodWithParameter1();
		ob4.classinfo("raj", 10, "901168", 10, 12, 'M');
		clasinfo("rk", 10, "956464", 22, 10, 'm');
		
		
		
		
		
		
		
	}
	public void result() //nonstatic without parameter
	{
		System.out.println("===============================================");
		int sub1=50;
		int sub2=60;
		int sub3=85;
		int total=sub1+sub2+sub3;
		int avg=total/3;
		System.out.println("My Result Is "+avg);
		System.out.println("===============================================");
		System.out.println("===============================================");
	}
    public static void studentinfo() //static without parameter
    
    {
    //name rollno mob age batch gender
    	System.out.println("===============================================");
    	String name="Rajesh";
    	int rollno=15;
    	String mobno="9015134625";
    	int batch=9;
    	char gender='M';
    	System.out.println("my name is "+name);
    	System.out.println("my rollno is "+rollno);
    	System.out.println("my mobno is "+mobno);
    	System.out.println("my batch is "+batch);
    	System.out.println("my gender is "+gender);
    	System.out.println("===============================================");
    	System.out.println("===============================================");
     }   
    
    public void additon()
    {
    	System.out.println("===============================================");
    	int a=25;
        int b=75;
        int sum=a+b;
        System.out.println("addition is "+sum);
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
    public void addition1(int c,int d)//method with parameter
    {
    	System.out.println("===============================================");
    	int sum1=c+d;
    	 System.out.println("addition1 is "+sum1);
    	 System.out.println("===============================================");
    	 System.out.println("===============================================");
    }
    public void classinfo(String name, int rollno,String mob, float age, int batch,char gender )
    {
    	System.out.println("===============================================");
    	System.out.println("my name is "+name);
    	System.out.println("my rollno is "+rollno);
    	System.out.println("my mobno is "+mob);
    	System.out.println("my age is "+age);
    	System.out.println("my batch is "+batch);
    	System.out.println("my gender is "+gender);
    	System.out.println("===============================================");
    	System.out.println("===============================================");
    	System.out.println("===============================================");
    }
    public static void clasinfo(String nam, int roll,String mobi, float ag, int batc,char gende )
    {
    	System.out.println("===============================================");
    	System.out.println("my name is "+nam);
    	System.out.println("my rollno is "+roll);
    	System.out.println("my mobno is "+mobi);
    	System.out.println("my age is "+ag);
    	System.out.println("my batch is "+batc);
    	System.out.println("my gender is "+gende);
    	System.out.println("===============================================");
    	System.out.println("===============================================");
    	System.out.println("===============================================");	
    }
    
    
    
    
    
}
