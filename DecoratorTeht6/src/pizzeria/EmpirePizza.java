package pizzeria;

public class EmpirePizza extends PizzanValmistaja {
	double taytteidenHinta = 4;

	public EmpirePizza(Pizza eriPizzat) {
		super(eriPizzat);
	}
	
	@Override
	public String valmista() {
		super.valmista();
		String valmispizza = valmistaEmpirePizza();
		return valmispizza;
		
	}
	
	
	private String valmistaEmpirePizza() {
		return "Katkarapu, kinkku, salami ja punasipuli";
	}
	
	public double pizzanTaytteidenHinta() {
		super.pizzanTaytteidenHinta();
		double hinta = empireHinta();
		return hinta;
	}
	
	private double empireHinta() {
		return taytteidenHinta;
		
	}
}