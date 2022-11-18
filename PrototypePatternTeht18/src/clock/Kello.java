package clock;

public class Kello implements Ikello {

	Viisarit aika = null;
	Viisarit ruotsinAika = null;
	
	
	@Override
	public void kellojenAlustus() {
		
		aika = new Viisarit();
		ruotsinAika = (Viisarit)aika.clone();
		
		ruotsinAika.setTunnit(-1);
		tarkistaAika();
	}
	
	@Override
	public void tarkistaAika() {
		System.out.println(aika.toString());
		System.out.println(ruotsinAika.toString());
		siirraAikaEteenpain();
	}

	//Siirtää aikaa eteenpäin sekuntilla
	public void siirraAikaEteenpain() {
		
		try {
			Thread.sleep(1000);
			aika.setSekuntit(1);
			ruotsinAika.setSekuntit(1);
			tarkistaAika();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	
	

	
	
}
