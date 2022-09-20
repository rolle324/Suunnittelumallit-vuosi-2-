package Main;


import composite.*;

public class Main {

	public static void main(String[] args) {
		Aanikortti aanikortti = new Aanikortti("Creative sound Blaster", 69);
		Keskusmuisti keskusmuisti = new Keskusmuisti("XLR8 gaming", 219);
		Prosessori prosessori = new Prosessori("AMD ryzen 7 S800X", 379);
		Kiintolevy kiintolevy = new Kiintolevy("Samsung 2TB 870 QVO", 169.90);
		Naytonohjain naytonohjain = new Naytonohjain("Geforce RTX 3070",550);
		OptinenAsema optinenasema = new OptinenAsema("Asus BW-16D1X", 149);
		Tuuletin tuuletin = new Tuuletin("Corsair LL120 RGB", 111.99);
		Verkkokortti verkkokortti = new Verkkokortti("TP-LINK TX401", 94.90);
		Virtalahde virtalahde = new Virtalahde("Corsair CX750F", 103.90);
		
		//Kotelo + koostekomponentit
		TietokoneenKotelo tietokoneenkotelo = new TietokoneenKotelo("Kolink Observatory RGB", 82.90);
		tietokoneenkotelo.add(virtalahde);
		tietokoneenkotelo.add(optinenasema);
		tietokoneenkotelo.add(kiintolevy);
		double tietokoneenkoteloSumma = tietokoneenkotelo.calculatePrice();
		System.out.println("Tietokoneen kotelon + koostekomponenttien summaksi tuli: "+tietokoneenkoteloSumma+"€");
		
		//Emolevy + koostekomponentit
		Emolevy emolevy = new Emolevy("Asus prime590M", 209.90);
		emolevy.add(verkkokortti);
		emolevy.add(aanikortti);
		emolevy.add(naytonohjain);
		emolevy.add(prosessori);
		emolevy.add(keskusmuisti);
		emolevy.add(tuuletin);
		double emolevySumma = emolevy.calculatePrice();
		System.out.println("Emolevyn + koostekomponenttien summaksi tuli: "+emolevySumma+"€");
		
		double kokonaissumma = emolevySumma + tietokoneenkoteloSumma;
		
		System.out.println("Kokonaissummaksi tuli: "+kokonaissumma+"€");
		
		

	}

}
