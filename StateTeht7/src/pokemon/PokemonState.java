package pokemon;

public interface PokemonState {
	void nextEvolution(Pokemon pokemon);
	void moves(int move);
	String getName();
	String getType();
	

}
