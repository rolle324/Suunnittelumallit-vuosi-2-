package pokemon;

public class Charmander implements PokemonState {

	public String name = "Charmander";
	public String type = "Fire";
	
	//Kehittyminen seuraavaan muotoon (state)
	@Override
	public void nextEvolution(Pokemon pokemon) {
		pokemon.setState(new Charmeleon());
	}
	
	//Eri pokemon liikkeet
	@Override
	public void moves(int move) {
		if (move == 1) {
			System.out.println(name+" used Growl");	
		}
		else if (move == 2) {
			System.out.println(name+" used Ember");
		}
		
		else if (move == 3) {
			System.out.println(name+" used Dragon breath");
		}
		
		else {
			System.out.println(name+" used Smokescreen");
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
