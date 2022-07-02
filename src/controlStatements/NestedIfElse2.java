package controlStatements;

public class NestedIfElse2 {

	public static void main(String[] args) {
		String username="ranjit";
		String password="rk@123";
		
		if (username=="ranjitk") 
		{
	   System.out.println("enter password");
		if (password=="rk@123")
		{
		System.out.println("login success");
		}
		else {
			System.out.println("wrong password");
		}
	   
	    }
		else {
			System.out.println("wrong user name");
		}

}
}
