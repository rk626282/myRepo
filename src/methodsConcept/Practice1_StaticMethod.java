package methodsConcept;

public class Practice1_StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();//static method call from same class
		                    // static method call from anothe class
		                     // syntax is classname.methodname for static method only
		MethodsStudy1.sub(); // for static method call from another class just 
		                     //just syntax is classname.methodname
		
		
		Practice1_StaticMethod ob=new Practice1_StaticMethod(); //object create compulsary in nonstatic method calling
		ob.add1();
		ob.add1();
		ob.add1();
		MethodsStudy1 ob2= new MethodsStudy1(); // non static call from another class
		ob2.add();                             //syntax is that classname new object crete
		                                       //then objectname.classname
		
	}
	public static void addition() //static regular method
	{
		int a=5;
		int b=5;
		int add=a+b;
		System.out.println("addition is "+add);
		
	}
	public void add1() //nonstatic method
	{
		int a=6;
		int b=5;
		int add=a+b;
		System.out.println("addition is "+add);
		
	}
	

}

