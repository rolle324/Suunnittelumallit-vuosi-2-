package pizzeria;

public class PizzaPohja implements Pizza {

	private double pohjanTaytteidenHinta = 7.50;
	
	@Override
	public String valmista() {
		
		return "taikina, tomaatti, juusto";
	}

	@Override
	public double pizzanTaytteidenHinta() {

		return pohjanTaytteidenHinta;
	}

}
