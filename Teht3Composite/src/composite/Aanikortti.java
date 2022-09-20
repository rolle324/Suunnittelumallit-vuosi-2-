package composite;

public class Aanikortti implements tietokone {
	String malli;
	double hinta;

	public Aanikortti(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
