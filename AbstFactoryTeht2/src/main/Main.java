package main;

import AdidasFactory.AdidasFactory;
import AdidasFactory.Adidasproduct;
import BossFactory.BossFactory;
import BossFactory.Bossproduct;

public class Main {

	public static void main(String[] args) {
		//Luodaan tehtaat
		AdidasFactory AdidasFactory = new AdidasFactory();
		BossFactory BossFactory = new BossFactory();
		
		Jasper Jasper = new Jasper();
		
		//Luodaan Adidaksen tuotteet
		Adidasproduct AdidasCap = AdidasFactory.createCap();
		Adidasproduct AdidasJeans = AdidasFactory.createJeans();
		Adidasproduct AdidasShoes = AdidasFactory.createShoes();
		Adidasproduct AdidasTshirt = AdidasFactory.createTshirt();
		
		//Luodaan Bossin tuotteet
		Bossproduct BossCap = BossFactory.createCap();
		Bossproduct BossJeans = BossFactory.createJeans();
		Bossproduct BossShoes = BossFactory.createShoes();
		Bossproduct BossTshirt = BossFactory.createTshirt();
		
		
		Jasper.WearClothes(AdidasCap, AdidasJeans, AdidasShoes, AdidasTshirt);
		
		//Valmistuttuaan insinööriksi vaatemaku muuttui Jasperilla
		Jasper.WearClothes(BossCap, BossJeans, BossShoes, BossTshirt);
		
		
		
		
		
		
		
	}

}
