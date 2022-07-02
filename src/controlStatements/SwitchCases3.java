package controlStatements;

public class SwitchCases3 {

	public static void main(String[] args) {

    String Day= "WEDNESDAY";
    switch (Day) {
	case "MONDAY" :System.out.println("FIRST DAY OF WEEK");
		 break;
	case "TUESDAY" :System.out.println("SECOND DAY OF WEEK");
	break;
	case "WEDNESDAY" :System.out.println("THIRD DAY OF WEEK");
	break;
	case "THURSDAY" :System.out.println("FOURTH DAY OF WEEK");
	break;
	case "FRIDAY" :System.out.println("FIFTH DAY OF WEEK");
	break;
	case "SATURDAY" :System.out.println("SIXTH DAY OF WEEK");
	break;
	case "SUNDAY" :System.out.println("LAST DAY OF WEEK");
	break;
	default:System.out.println("DATA NOT FOUND ERROR");
		break;
	}
	}

}
