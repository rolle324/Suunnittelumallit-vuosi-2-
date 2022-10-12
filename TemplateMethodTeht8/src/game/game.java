package game;

abstract class game {

	abstract void initializeGame();
	abstract void playRound();
	abstract boolean endOfGame();
	abstract void printWinner();
	
	public final void playOneGame() {
		initializeGame();
		while(endOfGame() == false) {
			playRound();
		}
		printWinner();
	}
	
}
