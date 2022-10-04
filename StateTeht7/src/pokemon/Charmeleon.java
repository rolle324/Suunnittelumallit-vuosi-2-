package pokemon;

public class Charmeleon implements PokemonState {

	public String name = "Charmeleon";
	public String type = "Fire";
	
	//Kehittyminen seuraavaan muotoon (state)
	@Override
	public void nextEvolution(Pokemon pokemon) {
		pokemon.setState(new Charizard());
		pokemon.fullyEvolvedNotification();	
	}

	//Eri pokemon liikkeet
	@Override
	public void moves(int move) {
		if (move == 1) {
		System.out.println(name+" used Fire fang");	
		}
		else if (move == 2) {
			System.out.println(name+" used Scratch");
		}
		
		else if (move == 3) {
			System.out.println(name+" used Dragon Breath");
		}
		
		else {
			System.out.println(name+" used Slash");
		}
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getType() {
		return type;
	}

}
