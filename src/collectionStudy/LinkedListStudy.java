package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add('R');
		ll.add(100);
		ll.add("PUNE");
		ll.add(null);
		ll.add(100.25);
		ll.add(null);
		ll.add("PUNE");
		ll.add(0);
		ll.add('K');
		
		System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.contains("PUNE"));
        System.out.println("ELEMENT AT INDEX 4 IS "+ll.get(4));
        
        ll.add(8, "MUMBAI");
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println("GET FIRST METHOD: "+ll.getFirst());
        System.out.println("GET LAST METHOD: "+ll.getLast());
        
        ll.remove(8);
        System.out.println(ll);
        
        System.out.println("===============================");
        System.out.println("USING FOR LOOP"); //1
        for(int i=0;i<=ll.size()-1;i++) {
        	System.out.println(ll.get(i));
        	}
        System.out.println("===============================");
        System.out.println("USING FOR EACH LOOP"); //2
        for(Object l2:ll) {
        	System.out.println(l2);
        }
        System.out.println("===============================");
        System.out.println("USING ITERATOR"); //3
       Iterator l3 = ll.iterator();
       while(l3.hasNext()) {
    	   System.out.println(l3.next());
       }
       System.out.println("===============================");
       System.out.println("USING LIST ITERATOR"); //4
       ListIterator l4 = ll.listIterator();
       while(l4.hasNext()) {
    	 System.out.println(l4.next());  
       }
        
        
        
	}

}
