package clock;

import java.time.LocalDateTime;

public class Viisarit implements iPrototype {

	LocalDateTime now = LocalDateTime.now();
	
	//Katsoo nykyisen ajan valmiiksi
	private int tunnit = now.getHour();
	private int minuutit = now.getMinute();
	private int sekuntit = now.getSecond();

	public void setTunnit(int tunnit) {
		if (this.tunnit == 23) {
			this.tunnit = 0;
			this.minuutit = 0;
			this.sekuntit = 0;
		}
		else {
			this.tunnit += tunnit;
		}
	}

	public int getTunnit() {
		return tunnit;
	}



	public void setMinuutit(int minuutit) {

		if (this.minuutit == 59) {
			setTunnit(1);
			this.minuutit = 0;
			this.sekuntit = 0;
		}

		else {
			this.minuutit += minuutit;
		}
	}

	public void setSekuntit(int sekuntit) {
		
		if (this.sekuntit == 59) {
			setMinuutit(1);
			this.sekuntit = 0;
		}

		else {
			this.sekuntit += sekuntit;
		}

	}

	@Override
	public String toString() {
		String sekuntit = String.format("%02d", this.sekuntit);
		String minuutit = String.format("%02d", this.minuutit);
		String tunnit = String.format("%01d", this.tunnit);

		return "Kello on: " + tunnit + ":" + minuutit + ":" + sekuntit;

	}
	
	
	//Shallow copy, kopioi ainoastaan olion arvot ei viitteitä muihin olioihin
	@Override
	public iPrototype clone() {
		try {
			return (iPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
