package teht15Visitor;

public class Charmander implements iPokemonMuodot {

	@Override
	public void accept(PokemonMuodotNaytaVisitor pokemonmuodotvisitor) {
		pokemonmuodotvisitor.visit(this);
		
	}

}
