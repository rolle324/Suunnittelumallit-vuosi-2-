package singletonTeht5;

public class Pelikone {

	private int coins;
	
	
	//Singleton malli
	private static Pelikone instance = new Pelikone();
	private Pelikone() {}
	public static Pelikone getInstance() {
		return instance;
	}

	
	public int getCoins() {
		return coins;
	}
	
	public void addCoins(int coins) {
		this.coins = this.coins + coins; 
	}
	
	public void deductCoins(int coins) {
		this.coins = this.coins - coins; 
	}
}
