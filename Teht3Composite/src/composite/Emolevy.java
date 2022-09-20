package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements tietokone {
String malli; double hinta;
	
	public Emolevy(String malli, double hinta) {
		this.malli = malli;
		this.hinta = hinta;
	}
	
	//Emolevy + koostekomponenttien laskeminen
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
