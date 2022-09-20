package composite;

public class Verkkokortti implements tietokone {
	String malli;
	double hinta;

	public Verkkokortti(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
