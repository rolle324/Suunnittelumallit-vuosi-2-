package pizzeria;

public class Main {

	public static void main(String[] args) {
		
		//Pizzat luodaan
		Pizza hawaiiPizza = new HawaiiPizza(new PizzaPohja());
		Pizza empirePizza = new EmpirePizza(new PizzaPohja());
		Pizza kummisetaPizza = new KummisetaPizza(new PizzaPohja());
		Pizza pizzaPohja = new PizzaPohja();
		
		
		//Näytetään kyseisien pizzojen ainesosat sekä hinta
		System.out.println("Pizzan ainesosat ovat: "+pizzaPohja.valmista()+", "+hawaiiPizza.valmista());
		System.out.println("Pohjan hinta on: "+pizzaPohja.pizzanTaytteidenHinta()+"€"+" ja täytteiden hinta on: " +hawaiiPizza.pizzanTaytteidenHinta()+"€");
		
		System.out.println("Pizzan ainesosat ovat: "+pizzaPohja.valmista()+", "+kummisetaPizza.valmista());
		System.out.println("Pohjan hinta on: "+pizzaPohja.pizzanTaytteidenHinta()+"€"+" ja täytteiden hinta on: " +kummisetaPizza.pizzanTaytteidenHinta()+"€");
		

		System.out.println("Pizzan ainesosat ovat: "+pizzaPohja.valmista()+", "+empirePizza.valmista());
		System.out.println("Pohjan hinta on: "+pizzaPohja.pizzanTaytteidenHinta()+"€"+" ja täytteiden hinta on: " +empirePizza.pizzanTaytteidenHinta()+"€");
	}

}
