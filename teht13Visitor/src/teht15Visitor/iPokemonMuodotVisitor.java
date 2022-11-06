package teht15Visitor;

public interface iPokemonMuodotVisitor {
	
	public void visit(Pokemon pokemon);
	public void visit(Charmander charmander);
	public void visit(Charmeleon charmeleon);
	public void visit(Charizard charizard);

}
