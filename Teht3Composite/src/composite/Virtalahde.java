package composite;

public class Virtalahde implements tietokone {
	String malli;
	double hinta;

	public Virtalahde(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
