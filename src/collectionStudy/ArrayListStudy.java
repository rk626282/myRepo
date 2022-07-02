package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList ar =new ArrayList();
		
		ar.add("BasicJava");
		ar.add(12);
		ar.add(12.5);
		ar.add(null);
		ar.add("BasicJava");
		ar.add(null);
		ar.add(0);
		ar.add('R');
		
		System.out.println(ar.size());
		
		System.out.println(ar);
		System.out.println("================================================================================");
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(7));
		System.out.println(ar.get(3));
		
		//ADD ELEMENT AT PARTICULAR INDEX >> RIGHT SHIFTING TAKES PLACE
		
		ar.add(1, "RK");
		ar.add(3, 100);
		ar.add(0, "ADVANCE JAVA");
		ar.add(5, 'S');
		System.out.println(ar);
		
		//REMOVE ELEMENT AT PARTICULAR INDEX >> LEFT SHIFTING TAKES PLACE
		System.out.println("================================================================================");
		ar.remove(0);
		System.out.println(ar);
		
		System.out.println("================================================================================");
		System.out.println(ar.contains("basicJava"));
		System.out.println(ar.contains(null));
		System.out.println(ar.contains('K'));
		
		System.out.println("================================================================================");
		System.out.println("USING FOR LOOP");
		//MOVING THROUGH LIST USING FOR LOOP  //1
		for(int i=0;i<=ar.size()-1;i++) 
		{
			System.out.println(ar.get(i));
		}
		System.out.println("================================================================================");
		System.out.println("USING ITERATOR");
		//MOVING THROUGH LIST USING CURSOR >> iterator //2
		   Iterator itr = ar.iterator();
		   
		   while(itr.hasNext()) 
		   {
			   System.out.println(itr.next());
		   }
		
		System.out.println("================================================================================");
		System.out.println("USING FOR EACH LOOP"); //3
		// USING FOR EACH LOOP
		for(Object o:ar) 
		{
			System.out.println(o);
		}
		
		System.out.println("================================================================================");
		System.out.println("USING LIST ITERATOR"); //4
		ListIterator ar4 = ar.listIterator();
		while(ar4.hasNext()) {
		System.out.println(ar4.next());
		}
		
	}

}
