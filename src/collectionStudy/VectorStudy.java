package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v =new Vector<>();
	
		v.add(1);
		v.add("JAVA");
		v.add(100.123);
		v.add('K');
		v.add(10);
		v.add(null);
		v.add("JAVA");
		v.add(null);
		v.add(0);
		
    System.out.println(v);
    System.out.println(v.size());
    System.out.println(v.contains("JAVA"));
    System.out.println(v.contains(null));
	
   //ADD ELEMENT AT PARTICULAR INDEX
	v.add(0, 100);
	System.out.println(v);
	
	//REMOVE ELEMENT AT PARTICULAR INDEX
	v.remove(8);
	System.out.println(v);
	System.out.println("===============================");
	System.out.println("USING FOR LOOP"); //1
	for(int i=0;i<=v.size()-1;i++) 
	{
		System.out.println(v.get(i));
	}
	System.out.println("===============================");
	System.out.println("USING ITERATOR"); //2
	Iterator v1 = v.iterator();
	while(v1.hasNext()) {
		System.out.println(v1.next());
	}
	System.out.println("===============================");
	System.out.println("USING FOR EACH LOOP"); //3
	for (Object v2:v) {
		System.out.println(v2);
	}
	System.out.println("===============================");
	System.out.println("USING ENUMERATION");  //4  Enumeration cursor is only use for legacy class
	Enumeration enu = v.elements();
	while(enu.hasMoreElements()) {
		System.out.println(enu.nextElement());
	}
	System.out.println("===============================");
	System.out.println("LIST ITERATOR");  
	ListIterator v3 = v.listIterator(); //5
	while(v3.hasNext()) {
		System.out.println(v3.next());
	}
	}
   
     

	
	
}
