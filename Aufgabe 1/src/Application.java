
public class Application {

	public static void main(String[] args) {
		Fehler f = new Fehler(); //Objekt der Klasse "Fehler" erzeugt
		Hund bello = new Hund(); //Objekt der Klasse "Hund" erzeugt
		f.variable1 = 10;  //Punkt-Operator, um auf Methode in Klasse "Fehler" zuzugreifen
		f.variable2 = 10;
		f.variable3 = true;
		f.name = "Paul";
		f.methode1();
		f.methode2();
		f.methode3();
		bello.belle();  //Punkt-Operator, um auf Methode in Klasse "Hund" zuzugreifen
		System.out.println("Alle Fehler sind verschwunden!");
	}

}
