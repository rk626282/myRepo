package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) {
	   HashSet hs =new HashSet();
	   hs.add('R');
	   hs.add("PUNE");
	   hs.add(100);
	   hs.add("MUMBAI");
	   hs.add(123.100);
	   hs.add(true);
	   hs.add(null);
	   hs.add("PUNE");
	   hs.add(null);
	   hs.add(0);
	   hs.add('K');
	   
	   System.out.println(hs);
	   System.out.println(hs.size());
	   System.out.println(hs.remove(0));
	   System.out.println(hs);
	   System.out.println(hs.contains("PUNE")); //true
	   System.out.println(hs.isEmpty());        //false
	   
	   System.out.println("========================================================");
	   System.out.println("USING ITERATOR"); //1
	   Iterator i1 = hs.iterator();
       while(i1.hasNext()) {
    	   System.out.println(i1.next());
       }
       System.out.println("========================================================");
	   System.out.println("USING FOR EACH LOOP"); //2
       for (Object i2:hs) {
    	   System.out.println(i2);
       }
      System.out.println("========================================================");
	   
	}

}
