package teht15Visitor;

public class Charmeleon implements iPokemonMuodot {

	@Override
	public void accept(PokemonMuodotNaytaVisitor pokemonmuodotvisitor) {
		pokemonmuodotvisitor.visit(this);
		
	}

}
