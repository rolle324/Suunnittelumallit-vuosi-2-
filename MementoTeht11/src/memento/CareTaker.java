package memento;

import java.util.Random;

public class CareTaker extends Thread {
	Originator gameHost = new Originator();
	private Object letter;
	private static int playerNumberCount = 1;
	private int playerNumber;

	public CareTaker() {
		// Antaa jokaiselle pelaajalle oman numeron
		playerNumber = playerNumberCount++;

	}

	public void run() {
		participateGame();
	}

	public void participateGame() {

		// pelaaja liittyy peliin ja saa kirjekuoren jossa on numero sisällä
		letter = gameHost.joinGame();

		// pelaaja tekee arvauksen
		generateNumber();
	}

	public void generateNumber() {
		Random randomNum = new Random();
		int guessedNumber = 1 + randomNum.nextInt(10);
		takeGuess(guessedNumber);

	}

	
	public void takeGuess(int guessedNumber) {
		System.out.println("Pelaaja " + playerNumber + " arvaa " + guessedNumber);
		timeBetweenActions();

		// Annetaan Originatorille takaisin kirjekuori, sekä arvattu numero
		Boolean result = gameHost.compare(letter, guessedNumber);

		if (result == true) {
			System.out.println("Pelaaja " + playerNumber + " arvasi numeron oikein!");
		} else {
			System.out.println("Pelaaja " + playerNumber + " arvasi väärin!");
			timeBetweenActions();
			generateNumber();
		}
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	// Arvauksien välissä odotettava aika
	public void timeBetweenActions() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
