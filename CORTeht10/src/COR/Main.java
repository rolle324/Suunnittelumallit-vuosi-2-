package COR;

public class Main {

	public static void main(String[] args) {

		Lahiesimies lahiesimies = new Lahiesimies();
		YksikonPaalikko yksikonpaalikko = new YksikonPaalikko();
		Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
		
		lahiesimies.setSuccessor(yksikonpaalikko);
		yksikonpaalikko.setSuccessor(toimitusjohtaja);
		
		// Lähdetään kysymään 5% korotusta, jos lähiesimiehellä ei ole valtuuksia antaa
		// korotusta, siirretään pyyntö seuraavalle.
		lahiesimies.processRequest(new TyopaikkaPyynto(5));

	}

}
