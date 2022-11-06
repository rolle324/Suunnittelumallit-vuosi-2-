package teht15Visitor;

public class Charizard implements iPokemonMuodot {

	@Override
	public void accept(PokemonMuodotNaytaVisitor pokemonmuodotvisitor) {
		pokemonmuodotvisitor.visit(this);
		
	}

}
