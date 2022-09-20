package composite;

public class Keskusmuisti implements tietokone {
	String malli;
	double hinta;

	public Keskusmuisti(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
