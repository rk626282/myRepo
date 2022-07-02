package abstractClass;

//CAN WE OVERLOAD JAVA MAIN METHOD ?

//ANSWER : YES by method overloading we can have any number of main method in a class.
//         but JVM calls main method which receive string array as arguments only.

public class MainMethodOverload {
	public static void main(String[] args) 
	{
		System.out.println("orignal method");
	}
  
	public static void main(int a) 
	{
		System.out.println("a");
	}
	public static void main(char r) 
	{
		System.out.println("b");
	}
	public static void main(float b) 
	{
		System.out.println("c");
	}
	
	
}