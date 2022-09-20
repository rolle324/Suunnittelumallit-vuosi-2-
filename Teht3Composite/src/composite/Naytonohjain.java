package composite;

public class Naytonohjain implements tietokone {
	String malli;
	double hinta;

	public Naytonohjain(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
