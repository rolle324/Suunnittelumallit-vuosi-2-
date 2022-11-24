package matkatoimisto;

public class Matkanvalitseminen {
private String minne ="";
private String milloin = "";
private double hinta;


public Matkanvalitseminen(String minne, String milloin, double hinta) {
	this.minne = minne;
	this.milloin = milloin;
	this.hinta = hinta;
	
}


public String getMinne() {
	return minne;
}


public String getMilloin() {
	return milloin;
}


public double getHinta() {
	return hinta;
}



	
	
}
