package BossFactory;

import main.FactoryInterface;

public class BossFactory implements FactoryInterface {

	public Bossproduct createCap() {
		return new BossCaps();
	}
	
	public Bossproduct createJeans() {
		return new BossJeans();
	}
	
	public Bossproduct createShoes() {
		return new BossShoes();
	}
	
	public Bossproduct createTshirt() {
		return new BossTshirts();
	}
	
}
