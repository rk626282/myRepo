package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {
	//duplicates are not allowed
	//insertion type ascending order.
	public static void main(String[] args) {
		TreeSet t1 =new TreeSet<>();
		t1.add(1);
		t1.add(20); 
		t1.add(20);
		t1.add(25);
		t1.add(1);
		t1.add(16);
		t1.add(12);
		t1.add(14);
		//t1.add('A');  
		// note: it can store only homogeneous data
		        //ClassCastException
		System.out.println(t1);
		System.out.println(t1.size());
		System.out.println(t1.pollFirst()); //remove first element from the list 
		System.out.println(t1);
		System.out.println(t1.pollLast());  //remove last element from the list
		System.out.println(t1);
		System.out.println(t1.contains(20));
		System.out.println(t1.isEmpty());
		System.out.println(t1.remove(14));
		System.out.println(t1);
		
		System.out.println("==========================================================");
		System.out.println("USING ITERATOR");
		Iterator t2 = t1.iterator();
		while(t2.hasNext()) {
		System.out.println(t2.next());
		
	 
		}
		System.out.println("==========================================================");
		System.out.println("USING FOR EACH LOOP");
        for(Object t3:t1) {
        	System.out.println(t3);
        }
        
        
	}

}
