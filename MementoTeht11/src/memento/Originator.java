package memento;

import java.util.Random;

public class Originator extends Thread {

	public Memento joinGame() {
		
		//Luodaan kirjekuori jonka sisällä on satunnainen numero
		Object letter = createLetter();
		
		//Annetaan kirjekuori pelaajalle
		return (Memento) letter;

	}

	public int generateNumber() {
		// arvotaan luku 1-10 kirjekuoreen
		Random randomNum = new Random();
		return 1 + randomNum.nextInt(10);
	}

	public Object createLetter() {
		int generatedNum = generateNumber();
		return new Memento(generatedNum);
	}

	//tarkastaa onko numero kirjekuoren sisällä sekä arvaajan numerot samat jos on niin palautetaan true
	public Boolean compare(Object letter, int guessedNumber) {

		if (((Memento) letter).getNum() == guessedNumber) {
			System.out.println("kirjekuoressa oli numero: " + ((Memento) letter).getNum());
			return true;

		}

		else {
			return false;
		}

	}

	
	private class Memento {
		int num;

		// kirjekuoren sisälle menee numero
		public Memento(int num) {
			this.num = num;
		}

		public int getNum() {
			return num;
		}
	}

}
