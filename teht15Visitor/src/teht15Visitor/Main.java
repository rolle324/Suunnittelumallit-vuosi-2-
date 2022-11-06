package teht15Visitor;

public class Main {

	public static void main(String[] args) {
		iPokemonMuodot pokemon = new Pokemon();
		
		pokemon.accept(new PokemonMuodotNaytaVisitor());

	}

}
