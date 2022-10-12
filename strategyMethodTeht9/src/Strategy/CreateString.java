package Strategy;

import java.util.ArrayList;

public class CreateString {


	ArrayList<String> cars = new ArrayList<String>();
	
	
	
	public String returnStrategyA() {
		cars.removeAll(cars);
		createList();
		ListConverter strategyA = new ListConverterA();  
		return strategyA.listToString(cars);
	}
	
	
	public String returnStrategyB() {
		cars.removeAll(cars);
		createList();
		ListConverter strategyB = new ListConverterB();  
		return strategyB.listToString(cars);
	}
	
	public String returnStrategyC() {
		cars.removeAll(cars);
		createList();
		ListConverter strategyC = new ListConverterC();  
		return strategyC.listToString(cars);
	}
	
	
	
	
	private void createList() {
	  
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Honda");
	    cars.add("Toyota");
	    cars.add("Nissan");
	}
	
}
