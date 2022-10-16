package memento;

public class Main {

	public static void main(String[] args) {

		//luodaan osallistujat
		CareTaker participant1 = new CareTaker();
		CareTaker participant2 = new CareTaker();

		participant1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		participant2.start();

		// Jokaiselle pelaajalle on annettu minuutti aikaa arvata oikea numero
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		participant1.stop();
		participant2.stop();

	}

}
