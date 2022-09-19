package AdidasFactory;

import main.FactoryInterface;

public class AdidasFactory implements FactoryInterface {

	public Adidasproduct createCap() {
		return new AdidasCaps();
	}
	
	public Adidasproduct createJeans() {
		return new AdidasJeans();
	}
	
	public Adidasproduct createShoes() {
		return new AdidasShoes();
	}
	
	public Adidasproduct createTshirt() {
		return new AdidasTshirts();
	}
	
}
