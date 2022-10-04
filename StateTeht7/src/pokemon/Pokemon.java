package pokemon;

import java.util.Random;

public class Pokemon {
	private int experience = 0;
	private int neededExperienceToEvolve = 30;
	private boolean fullyEvolved = false;

	private PokemonState currentState = new Charmander();
	
	
	//Pokemon muuttuu seuraavaan muotoon, jos sillä on tarpeeksi kokemuspisteitä
	public void nextState() {
		if (experience > neededExperienceToEvolve && fullyEvolved == false) {
			timeBetweenActions();
			experience = experience - neededExperienceToEvolve;
		String lastEvolution = currentState.getName();
		currentState.nextEvolution(this);
		System.out.println(lastEvolution+" evolved into "+currentState.getName());
		}
	}
	
	//Asetetaan uusi muoto
	public void setState(PokemonState state) {
		currentState = state;
	}
	
	//Arvotaan neljästä liikkestä yksi liike, jota käytetään
	public void useMove() {
		timeBetweenActions();
		Random randomNum = new Random();
		  int moveNumber = 1 + randomNum.nextInt(4);
		currentState.moves(moveNumber);
	}
	
	
	//Arpoo 1-10 kokemuspistettä
	public void gainExperience() {
		timeBetweenActions();
		Random randomNum = new Random();
		int experienceAmount = 1 + randomNum.nextInt(10);
		experience += experienceAmount;
		System.out.println(currentState.getName()+ " Gained "+ experienceAmount+" Experience!");
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
	
	//Ilmoittaa että pokemon on vikassa muodossa eikä pysty enään kehittymään 
	public void fullyEvolvedNotification() {
		fullyEvolved = true;
	}
	
}
