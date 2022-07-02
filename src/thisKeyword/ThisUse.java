package thisKeyword;

public class ThisUse {

	int a=100;   //global variable
	int b=50;    //global variable
	public static void main(String[] args) 
	{
		ThisUse tu=new ThisUse();
		tu.sample();
        tu.sample1();
	}
    public void sample() 
    {
    	int a=200;   //local variable
    	int sum=a+100;
    	System.out.println("sum is "+sum);
    	int sum1=this.a+100; //using this keyword calling global variable
    	System.out.println("sum1 is "+sum1);
    	
    	
    }
    public void sample1() 
    {
    	int b=250;
    	int sum2=b+100;
    	System.out.println("sum2 is "+sum2);
    	int sum3=this.b+100;
    	System.out.println("sum3 is "+sum3);
    }
}
