package saie;

import java.util.Observable;
import java.util.Observer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DigitalClock timer = new DigitalClock();

		timer.addObserver(new Observer() {

			@Override
			public void update(Observable obj, Object arg) {
				System.out.println("time is: " + arg);

			}

		});

		new Thread(timer).start();

		try {
			Thread.sleep(90000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		timer.lopeta();
	}

}
