package pizzeria;

public class KummisetaPizza extends PizzanValmistaja {
	double taytteidenHinta = 5;

	public KummisetaPizza(Pizza eriPizzat) {
		super(eriPizzat);
	}
	
	@Override
	public String valmista() {
		super.valmista();
		String valmispizza = valmistaKummisetaPizza();
		return valmispizza;
		
	}
	
	
	private String valmistaKummisetaPizza() {
		return "Kinkku, herkkusieni, parsa, katkarapu ja valkosipuli";
	}
	
	public double pizzanTaytteidenHinta() {
		super.pizzanTaytteidenHinta();
		double hinta = kummisetaHinta();
		return hinta;
	}
	
	private double kummisetaHinta() {
		return taytteidenHinta;
		
	}
}
