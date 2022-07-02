package regularMethod;

public class StaticNonStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData();
		StaticNonStaticMethods sdata= new StaticNonStaticMethods();
		sdata.weatherinfo();
		airindia();
		
		
				
		
		

	}
   public static void StudentData() //static method without parameter
   {
	   String studentinfo;
	   studentinfo="STUDENT INFORMATION";
	   String studentname="Raj";
	   int rollno=15;
	   int age=18;
	   char grade='A';
	   float percentage=80.25f;
	   boolean result=true;
	   System.out.println(studentinfo);
	   System.out.println(studentname);
	   System.out.println(rollno);
	   System.out.println(age);
	   System.out.println(grade);
	   System.out.println(percentage);
	   System.out.println(result);
	   System.out.println("===============================================");
	   
			   
   }
   public void weatherinfo() // nonstatic method without parameter
   {
	   String todyastempat=" DISTRICT TEMPRATURE";
	   int tempwashim=38;
	   int tempshegaon=39;
	   float tempamravati=37.5f;
	   int pusad=32;
	   boolean hightemp=true;
	   boolean lowtemp=false;
	   System.out.println("FOLLOWING IS THE LIST OF "+todyastempat);
	   System.out.println("1" +tempwashim);
	   System.out.println("2" +tempshegaon);
	   System.out.println("3" +tempamravati);
	   System.out.println("4" +pusad);
	   System.out.println("TEMPERATURE COUNT HIGH "+hightemp);
	   System.out.println("TEMPERATURE COUNT LOW "+lowtemp);
	   System.out.println("===============================================");
	   
	   
   }
   public static void airindia () //static methood without parameter
   {
	   String pasangerdetail="Pessanger Details";
	   String name="Rihansha";
	   int age=21;
	   String mailid="ranjitk123@gmail.com";
	   String travelfrom="pune to mumbai";
	   boolean ticketconfirm=true;
	   char classs='A';
	   System.out.println(pasangerdetail);
	   System.out.println(name);
	   System.out.println(age);
	   System.out.println(mailid);
	   System.out.println(travelfrom);
	   System.out.println(ticketconfirm);
	   System.out.println(classs);
	   
			   
	  
   }
   
}
