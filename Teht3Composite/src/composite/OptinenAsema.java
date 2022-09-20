package composite;

public class OptinenAsema implements tietokone {
	String malli;
	double hinta;

	public OptinenAsema(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	public double calculatePrice() {
		return hinta;
	}
	
}
