package teht15Visitor;

public class Pokemon implements iPokemonMuodot {

	iPokemonMuodot[] muodot;
	
	public Pokemon() {
		muodot = new iPokemonMuodot[] {
				new Charmander(), new Charmeleon(), new Charizard()
		};
	}
	
	
	@Override
	public void accept(PokemonMuodotNaytaVisitor pokemonmuodotvisitor) {
		for (int i = 0; i < muodot.length; i++) {
			muodot[i].accept(pokemonmuodotvisitor);
		}
		
		pokemonmuodotvisitor.visit(this);
	}

}
