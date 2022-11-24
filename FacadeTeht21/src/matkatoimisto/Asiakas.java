package matkatoimisto;

public class Asiakas {

	String nimi;
	String sukunimi;
	String henkilötunnus;
	Double saldo;
	
	public Asiakas(String nimi, String sukunimi, String henkiltunnus, Double saldo) {
		this.nimi = nimi;
		this.sukunimi = sukunimi;
		this.henkilötunnus = henkilötunnus;
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	
	
	
	
	
}
