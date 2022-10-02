package pizzeria;

public abstract class PizzanValmistaja implements Pizza {
	

	protected Pizza eriPizzat;

	public PizzanValmistaja(Pizza eriPizzat) {
		this.eriPizzat = eriPizzat;
	}
	
	public String valmista() {
		return eriPizzat.valmista();
	}
	
	public double pizzanTaytteidenHinta() {
		return eriPizzat.pizzanTaytteidenHinta();
	}
			
}
