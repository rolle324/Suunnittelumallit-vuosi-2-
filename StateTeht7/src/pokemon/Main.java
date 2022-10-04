package pokemon;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		int actionCycles = 0;

		do {
			pokemon.useMove();
			pokemon.gainExperience();
			pokemon.useMove();
			pokemon.gainExperience();
			pokemon.nextState();
			actionCycles++;
		} while (actionCycles < 20);

	}

}
