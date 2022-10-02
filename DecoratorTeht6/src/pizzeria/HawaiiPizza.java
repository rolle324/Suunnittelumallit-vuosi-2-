package pizzeria;

public class HawaiiPizza extends PizzanValmistaja {
	double taytteidenHinta = 3;

	public HawaiiPizza(Pizza eriPizzat) {
		super(eriPizzat);
	}
	
	@Override
	public String valmista() {
		super.valmista();
		String valmispizza = valmistaHawaiiPizza();
		return valmispizza;
		
	}
	
	
	private String valmistaHawaiiPizza() {
		return "Kinkku ja Ananas ";
	}
	
	public double pizzanTaytteidenHinta() {
		super.pizzanTaytteidenHinta();
		double hinta = hawaiiHinta();
		return hinta;
	}
	
	private double hawaiiHinta() {
		return taytteidenHinta;
		
	}
}
