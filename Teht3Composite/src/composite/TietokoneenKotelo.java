package composite;

import java.util.ArrayList;
import java.util.List;

public class TietokoneenKotelo implements tietokone {

String malli; double hinta;
	
	public TietokoneenKotelo(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	
	//Kotelo + koostekomponenttien laskeminen
	double kokonaisSumma;
	private final List<tietokone> osat = new ArrayList<>();
	
	public void add (tietokone osatlista) {
		osat.add(osatlista);
	}
	
	
	public double calculatePrice() {
		
		for (tietokone osatlista : osat) {
		kokonaisSumma = osatlista.calculatePrice();	
		}
		return kokonaisSumma + hinta;
	}


}
