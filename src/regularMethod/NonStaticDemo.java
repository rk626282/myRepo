package regularMethod;

public class NonStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //to call non static method > we need object>>create object
	
	 //syntax > ClasName objectname= new ClassName();
		NonStaticDemo t=new NonStaticDemo();
		
	   
	
		
		

    //to call non static method using object>>
   //sytax>>objectName.methodName>> this is syntax for calling nonstatic method from same class
		
		t.method2();
		t.method2();
		t.method2();
		
		
		
		
	}
	
    public void method2() //nonstatic method
    {
    	int a=90;
    	int b=10;
    	int sub=a-b;
    	System.out.println("Subtaction is "+sub);
    }
 
    

	}
    		  

    
    	
         
    
    
    

