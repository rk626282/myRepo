package methodsConcept;

public class MethodsStudy1 {
	
	public static void main(String[] args) 
	{
		sub(); //calling satic method from same class>>call using method name only
		
		
		Methods2.mul(); // calling static method from another class>>syntax is>ClassName.methodName
		Methods3.div();//calling static method from another class>>syntax is>ClassName.methodName
		}
	
//	public void addition ();//incomplte method>.>method doesnt have body
//	public void add ()//complete method >> method with defination
//	{
//	bddhfxhf
//}
	public  void add()//non static regular method
	{
	

	    int r;  //variable declration
		int s;  //variable declration
		
		r=5;//variable initialization
		s=4;//variable initialization
		
	    int sum;
	    sum=r+s;
	    System.out.println("total sum is "+sum);
	}
	
	    public static void sub() //static regular method
	    {
	    	int t;
	    	int u;
	    	t=12;
	    	u=10;
	    	int sub;
	    	sub=t-u;
	    	System.out.println("sum is "+sub);
	    	
	    }
			
	}

	
	
	
	
	
	   