package matkatoimisto;

public class MatkatoimistoFacade {

	Asiakas asiakas;
	TervetuloaMatkatoimistoon tervetuloamatkatoimistoon = new TervetuloaMatkatoimistoon();
	VarojenCheckkaus varojencheckkaus = new VarojenCheckkaus();
	Matkanvaraus varataanmatka;
	Matkanvalitseminen matkanvalitseminen;
	
	
	public void varaaMatka() {
		asiakas = new Asiakas("Pekka", "Ahola", "030700A224M", (double) 3000);
		tervetuloamatkatoimistoon.tervetuloa();
		matkanvalitseminen = new Matkanvalitseminen("Japani", "21.12.2022", 1200);
		
		System.out.println("Matka valittu kohteeseen: "+matkanvalitseminen.getMinne());
		
		boolean checked = varojencheckkaus.check(matkanvalitseminen.getHinta(), asiakas.getSaldo());
		
		varataanmatka = new Matkanvaraus();
		varataanmatka.matkaVarattu(checked);
		
		
		
		
		
	}
	
	
}
