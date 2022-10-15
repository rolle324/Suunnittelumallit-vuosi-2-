package COR;

public class Lahiesimies extends TyopaikkaValtuudet {

	public void processRequest(TyopaikkaPyynto request) {
		if (request.getAmount() == 2) {
			System.out.println("Lähiesimies hyväksyi " + request.getAmount()+ "% palkankorotuksen!");
		} else {
			super.processRequest(request);
		}
	}
	
}
