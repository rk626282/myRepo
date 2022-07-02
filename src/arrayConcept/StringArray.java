package arrayConcept;

import java.util.Iterator;

public class StringArray {
 //STRING ARRAY MEANS WE REQUIRE ALL DATA TYPE IN STRING
	
	
	public static void main(String[] args) {
		
		    // • Array is data structure used to store homogeneous collection of information.
			// • Array declaration need to be done with capacity
			// • Arrays are not growable in nature (fix size)
			// • Array is nothing but an object
			// • Inside array index will be present, array index starts form zero
		
		//I want store names of 5 cities
		
		String name[]= new String[5];
		name[0]="WASHIM";
		name[1]="PUNE";
		name[2]="MUMBAI";
		name[3]="NAGPUR";
		name[4]="DELHI";
		
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
//		System.out.println(name[3]);
//		System.out.println(name[4]);
	//	System.out.println(name[5]);  //ArrayIndexOutOfBoundsException Error
		
		for(int i=0; i<=4;i++) {
			System.out.println(name[i]);
		}
		
	}

}
