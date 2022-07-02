package inheritanceConcept;

public class HierarchicalStudy {

	public static void main(String[] args) {
		
	Student1 s1=new Student1();
	s1.beststudent();
	s1.talentedteacher();
	
	Student2 s2=new Student2();
	s2.betterstudent();
	s2.talentedteacher();
	
	Teacher t1= new Teacher();
	t1.talentedteacher();
	
	
}
}