package controlStatements;

public class ElseIfStudy4 {

	public static void main(String[] args) {

     // else if concept 
     // condition: traffic signal
  
		String TraficSignal="NO SIGNAL";
		
		if(TraficSignal=="RED")
		{
		System.out.println("STOP");	
		}
		else if (TraficSignal=="YELLOW") {
			
			System.out.println("WAIT FOR A FEW SECOND");
		}
		else if (TraficSignal=="GREEN")
		{
			System.out.println("GO SAFE");
		}
		else {
			System.out.println("TRAFIC IS JAM");
		}
	}

}
  