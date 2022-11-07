package Builder;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cook cook = new Cook();
		ArrayList<Object> heseHamppari = new ArrayList<Object>();
		
		IHamburgerBuilder heseHamburgerbuilder = new HesekerrosBuilder();
		IHamburgerBuilder mckerrosbuilder = new McKerrosBuilder();
		
		
		//Asiakas 1
		cook.setHamburgerBuilder(heseHamburgerbuilder);
		cook.constructHamburger();
		
		
		//Oliot laitettu arrayListin sisälle
		heseHamppari = (ArrayList<Object>) heseHamburgerbuilder.getHamburger();
		System.out.println("Asiakas 1 tilaus: ");
		for (int i = 0; i < heseHamppari.size(); i++) {
			System.out.println(heseHamppari.get(i));
		}
		
		//Asiakas 2
		cook.setHamburgerBuilder(mckerrosbuilder);
		cook.constructHamburger();
		Mckerroshamppari mcHamppari = (Mckerroshamppari) mckerrosbuilder.getHamburger();
		
		System.out.println("Asiakas 2 tilaus: "+ mcHamppari);
		
	}

}
