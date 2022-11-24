package matkatoimisto;

public class Matkanvaraus {

	public void matkaVarattu(boolean checked) {
		
		if(!checked) {
			System.out.println("Tapahtui virhe! Varmista että tietosi on oikein!");
		}
		
		
		else {
			System.out.println("Matka on onnistuneesti varattu!");	
		}
	}
	
	
}
