package COR;

public class Toimitusjohtaja extends TyopaikkaValtuudet {

	public void processRequest(TyopaikkaPyynto request) {
		if (request.getAmount() >= 5) {
			System.out.println("Toimitusjohtaja hyväksyi " + request.getAmount()+ "% palkankorotuksen!");
		} else {
			System.out.println("Error!");
		}
	}
}
