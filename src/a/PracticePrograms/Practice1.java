package a.PracticePrograms;

public class Practice1 {
//why string objects are immutable in nature

	public static void main(String[] args) {
		  String name="ranjit";
		         name="kamble"; // in memory creates brand new object to store "kamble" and name variable  object point to that memory object
		                        // where "ranjit" memory location object remains as it is as java doesnt modify it as "kamble"
		                        // so name="ranjit" is immmutable
          String secondname="ranjit"; // for this java doesnt create new memory location for that
                                      // alraedy save name as"ranjit" its just point out that secondname object.
          String nthname ="ranjit";   // same for nthname its just point out to name and second name common memory location
                                      // store in string pool area
        
          String thirdname= new String("ranjit");
         
          System.out.println(name==nthname);
          System.out.println(nthname==secondname);
          System.out.println(name==thirdname);
          
          //mean code
         addMoneyToAcc(secondname, 500);
         
          
          
		

    
  
	}
	public static void addMoneyToAcc(String AccHolderName,int moneytoAdd) {
		//validations
		 System.out.println(AccHolderName+" "+ moneytoAdd);
	}

}
