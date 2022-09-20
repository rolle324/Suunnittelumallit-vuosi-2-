package composite;

public class Prosessori implements tietokone {
	String malli;
	double hinta;

	public Prosessori(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
