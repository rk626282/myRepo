package a.PracticePrograms;

public class ReverseNo {

	public static void main(String[] args) {
		int n=521;
		int s=0;
		int t;
		while(n>0)
		{
			//condition 1: n=521>0 (true)
			//then t=521 % 10 >>1 so t=1
			
			//n%10 >> means modulus of 10 
			//This is used to get last digit or least significant digit from given no
			t=n%10;       //  1
			s=s*10+t;    //   s=1
			n=n/10;      // 521/10 =52 so n=52;
			
			 //Again iterate the loop;
			//condition 2: n=52>0 (true);
			//then t= 52%10 >>2 so t=2;
			//s=1*10+2=12 so s=12
			//n=52/10=5 so n=5;
			
			 //Again iterate the loop;
			//condition 3: n=5>0 (true);
			//then t= 5%10 >>5 so t=5;
			//s=12*10+5=25; s=125
			//n=5/10= so n=0; so condition will false
		}
       System.out.println(s);
	}

}
