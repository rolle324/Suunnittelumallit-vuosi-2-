package Adapter;

public class Main {

	public static void main(String[] args) {
		Movable bmw = new Bmw();
		MovableAdapter bmwAdapter = new MovableAdapterImpl(bmw);
		
		
		System.out.println("Miles per hour: "+bmw.getSpeed());
		System.out.println("Kilometers per hour: "+bmwAdapter.getSpeed());
	

	}

}
