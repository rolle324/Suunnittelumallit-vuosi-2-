package composite;

public class Tuuletin implements tietokone {
	String malli;
	double hinta;

	public Tuuletin(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
