package teht15Visitor;

import java.util.Random;

public class PokemonMuodotNaytaVisitor implements iPokemonMuodotVisitor {
	
	private int experience = 0;

	@Override
	public void visit(Pokemon pokemon) {
		System.out.println("Kaikki pokemonit ovat käyty läpi!");
		
	}

	@Override
	public void visit(Charmander charmander) {
		while(experience < 25) {
			System.out.println("Charmander taistelee ja tämän hetkiset tasopisteet ovat: "+gainExperience());
			
		}
		experience = 0;
		System.out.println("Charmander kehittyi Charmeleoniksi!");
	}

	@Override
	public void visit(Charmeleon charmeleon) {
		while(experience < 25) {
			System.out.println("Charmeleon taistelee ja tämän hetkiset tasopisteet ovat: "+gainExperience());
			
		}
		experience = 0;
		System.out.println("Charmeleon kehittyi Charizardiksi!");
		
	}

	@Override
	public void visit(Charizard charizard) {
		System.out.println("Onneksi olkoon olet saavuttanut vikan evoluutio muodon!");
		
	}

	
	
	public int gainExperience() {
		timeBetweenActions();
		Random randomNum = new Random();
		int experienceAmount = 1 + randomNum.nextInt(10);
		return experience += experienceAmount;
	}
	
	
	//Jokaisen toiminnon välissä odotettava aika
	public void timeBetweenActions() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
