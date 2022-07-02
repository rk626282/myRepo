package a.PracticePrograms;

public class FibonacciSeries {
     //0 1 2 3 4 5 6 7 8 9 10
	
	//0  1 1     2 3 5 8 13 21........is known as fibonacci series
	//a  b c=a+b 
	
	    public static void main(String[] args) {
		System.out.println("================================================");
		int a=0;         //first value of b will swap into a
		int b=1;        // after addiction value of c will swap into b
	   //System.out.println(a+" "+b);
		System.out.println("================================================");
		int c;
		for(int i=1;i<=10;i++) 
		{
		c=a+b;
		System.out.println(" "+c);
		a=b;
		b=c;
		}
		

	}

}
