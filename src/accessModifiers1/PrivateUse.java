package accessModifiers1;

public class PrivateUse {
	public  int a=10;   // non-static global variable >>public
	
	private int b=20; //  non-static global variable >>private
	
	
	
public static void main(String[] args) {
      PrivateUse p1=new PrivateUse();
      p1.test(); //calling public method in same class
      p1.test1();//calling private method in same class
      
      System.out.println(p1.a); //calling public global variable
      System.out.println(p1.b); //calling private global variable
      
	
	}
    public void test() {
	System.out.println("this is a public method");
	int sum=a+b;
	System.out.println(sum);

}
    private void test1() {
    System.out.println("this is private method");
    int mul=a*b;
    System.out.println(mul);
}
 
}
