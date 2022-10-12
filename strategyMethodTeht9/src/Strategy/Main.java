package Strategy;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CreateString createstring = new CreateString();
		
		String StrategyA = createstring.returnStrategyA();
		System.out.println("Strategy A: "+StrategyA);
	  
		String StrategyB = createstring.returnStrategyB();
		System.out.println("Strategy B: "+StrategyB);
		
		String StrategyC = createstring.returnStrategyC();
		System.out.println("Strategy C: "+StrategyC);

	}

}
