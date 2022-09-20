package composite;

public class Kiintolevy implements tietokone {
	String malli;
	double hinta;

	public Kiintolevy(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
