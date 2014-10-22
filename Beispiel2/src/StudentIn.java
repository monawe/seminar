
public class StudentIn {
	
	Integer mtrklnr;
	Integer alter;
	String name;
	Boolean weiblich;
	
	void ichBin(){
		System.out.println("Ich bin " + name + ".");
	}
	
	void alter(){
		System.out.println("Ich bin " + alter + " Jahre alt."); // + als Verknüpfung
	}
	
	void mtrklnr(){
		System.out.println("Meine Matrikelnummer lautet: " + mtrklnr + ".");
	}
	
	boolean geschlecht(){
		return weiblich;


	}

}
