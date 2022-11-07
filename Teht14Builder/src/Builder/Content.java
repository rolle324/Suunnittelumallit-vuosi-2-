package Builder;

public class Content {

String pihvi ="";
String salaatti = "";
String kastike = "";
	
public Content(String pihvi, String salaatti, String kastike) {
	this.pihvi = pihvi;
	this.salaatti = salaatti;
	this.kastike = kastike;
}

@Override
public String toString() {
	return "Sisältö: "+pihvi+" "+salaatti+" "+kastike;
	
}

	
}
