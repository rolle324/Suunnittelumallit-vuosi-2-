package COR;

public class YksikonPaalikko extends TyopaikkaValtuudet {

	

	public void processRequest(TyopaikkaPyynto request) {
		if (request.getAmount() > 2 && request.getAmount() < 5) {
			System.out.println("Yksikönpäällikkö hyväksyi " + request.getAmount()+ "% palkankorotuksen!");
		} else {
			super.processRequest(request);
		}
	}

}
