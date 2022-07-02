package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy {

	public static void main(String[] args) {
		LinkedHashSet lhs =new LinkedHashSet();
		lhs.add('R');
		lhs.add("PUNE");
		lhs.add(123);
		lhs.add("Mumbai");
		lhs.add(123);
		lhs.add(100.123);
		lhs.add("Mumbai");
		lhs.add(true);
		lhs.add(null);
		lhs.add(null);
		lhs.add('K');
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.contains("Mumbai"));
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.remove(null));
		
		System.out.println("========================================================");
		System.out.println("USING ITERATOR"); //1
		Iterator lhs1 = lhs.iterator();
		while(lhs1.hasNext()) {
			System.out.println(lhs1.next());
		}
		System.out.println("========================================================");
		System.out.println("USING FOR EACH LOOP"); //2
		for(Object lhs2:lhs) {
			System.out.println(lhs2);
		}
		
				

	}

}
