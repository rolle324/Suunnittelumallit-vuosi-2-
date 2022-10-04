package pokemon;

public class Charizard implements PokemonState {

	public String name = "Charizard";
	public String type = "Fire/Flying";
	
	
	@Override
	public void nextEvolution(Pokemon pokemon) {
		System.out.println("Evolution tree fully evolved!");
		
	}
	//Eri pokemon liikkeet
	@Override
	public void moves(int move) {
		if (move == 1) {
			System.out.println(name+" used Dragon Dance");
		}
		else if (move == 2) {
			System.out.println(name+" used Flare Blitz");
		}
		
		else if (move == 3) {
			System.out.println(name+" used Earthquake");
		}
		
		else {
			System.out.println(name+" used Roost");	
		}
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
