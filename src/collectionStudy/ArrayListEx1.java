package collectionStudy;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList a1 =new ArrayList(); //generic 
		
		a1.add("JAVA");
		a1.add('A');
		a1.add(12);
		a1.add(10.12);
		a1.add(null);
		a1.add("JAVA");
		a1.add(null);
		a1.remove(0);
		System.out.println(a1);
		System.out.println(a1.get(3));
		
		
//		for(int i=0;i<=a1.size()-1;i++) 
//		{
//			System.out.println(i);
//		}

}
}