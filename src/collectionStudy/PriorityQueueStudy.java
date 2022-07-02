package collectionStudy;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueStudy {
//ascending order
	public static void main(String[] args) {
	PriorityQueue pq =new PriorityQueue<>();
	pq.add("GOVT.");
	pq.add("POLYTECHNIC");
	pq.add("COLLEGE");
	pq.add("WASHIM");
	pq.add("WASHIM");
	
//	pq.add(1);   // store only homogeneious data
//	pq.add('A'); // class cast exception
	
	System.out.println(pq);
    System.out.println(pq.size());
    System.out.println(pq.element());  // get first or retrieve element from list but not removed from list
    System.out.println(pq);
    System.out.println(pq.poll());     // remove first element from the list 
    System.out.println(pq);
  
   
    System.out.println("==========================================================");
	System.out.println("USING ITERATOR");
    Iterator pq1 = pq.iterator();
    while(pq1.hasNext()) {
    	System.out.println(pq1.next());
    }
    System.out.println("==========================================================");
   	System.out.println("USING FOR EACH LOOP");
   	for(Object pq2:pq) {
   		System.out.println(pq2);
   	}
	}

}
