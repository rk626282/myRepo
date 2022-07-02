package accessModifiers2;

import accessModifiers1.DefaultUse;

public class Test {

	public static void main(String[] args) {
		
		DefaultUse m4 =new DefaultUse(); //creted object of another class
		m4.test1(); // call public method from another class
		//m4.test2() //cant call default method in another package
		System.out.println(m4.b);
		//System.out.println(m4.a);//not accessable due to default
		//System.out.println(m4.c); //not accessable due to private

	}

}
