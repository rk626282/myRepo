package inheritanceConcept;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GrandMother gm=new GrandMother();
        gm.stories();
        gm.reciepee();
        
        Mother1 m1= new Mother1();
        m1.sweetness();
        m1.kindness();
        m1.stories();
        m1.reciepee();
        
        Son1 s1 = new Son1();
        s1.respectful();
        s1.silent();
        
        s1.kindness();
        s1.sweetness();
        
        s1.reciepee();
        s1.stories();
		
		
	}

}
