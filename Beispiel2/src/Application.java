
public class Application {

	public static void main(String[] args) {
		StudentIn pauli = new StudentIn();
		pauli.mtrklnr = 468145;
		pauli.alter = 26;
		pauli.name = "Pauli";
		pauli.weiblich = true;
		
		pauli.ichBin();
		pauli.alter();
		pauli.mtrklnr();
		pauli.geschlecht();

	}

}
