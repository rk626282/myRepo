package a.PracticePrograms;

public class ReverseString {
 //BY USING CHAR ARRAY REV CHAR 
	public static void main(String[] args) {
		System.out.println("BY USING CHAR ARRAY REV CHAR");
		
		char rev[]=new char[6];
		rev[0]='R';
		rev[1]='A';
		rev[2]='N';
		rev[3]='J';
		rev[4]='I';
		rev[5]='T';
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]);
	 
		}
      //BY USING int ARRAY REV NO 
	    System.out.println();
		System.out.println("============================");
		System.out.println("BY USING INT ARRAY REV NO");
		int rev2[]=new int[5];
		rev2[0]=1;
		rev2[1]=2;
		rev2[2]=3;
		rev2[3]=4;
		rev2[4]=5;
		
		for(int i=rev2.length-1;i>=0;i--) {
			System.out.print(rev2[i]);
	}

}
}
