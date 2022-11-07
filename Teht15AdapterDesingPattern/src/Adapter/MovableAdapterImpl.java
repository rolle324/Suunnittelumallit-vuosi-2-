package Adapter;

public class MovableAdapterImpl implements MovableAdapter {
private Movable cars;
	
public MovableAdapterImpl(Object cars) {
	this.cars = (Movable) cars;
}
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH (cars.getSpeed());
	}
	
	private double convertMPHtoKMPH (double mph) {
		return mph * 1.60934;
	}

}
