package a.PracticePrograms;

public class SampleClass {

	public static void main(String[] args) {
		//int no =10;
		System.out.println(123/10); //int value not get accurate vale
		System.out.println((float)123/10);
		System.out.println(123%10); //not divisbile no by 10
		
		//even no
		System.out.println(8%2);
		System.out.println(24%2);
		
		//odd no
		System.out.println(7%2);
		System.out.println(9%2);
		
		if(8%2==0) {
			System.out.println("even no");
		}
		if(21%7==0) {
			System.out.println("21 is divisible by 7");
		}
		if(7%2!=0) {
			System.out.println("odd no");
		}
		System.out.println(521/10);
		System.out.println((float)521/10);
		System.out.println(521%10);
	}

}
