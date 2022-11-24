package matkatoimisto;

public class VarojenCheckkaus {

	
	public boolean check(double matkanhinta, double asiakkaanBalanssi) {
		
		if(matkanhinta < asiakkaanBalanssi || matkanhinta == asiakkaanBalanssi) {
			System.out.println("Asiakkaalta voidaan veloittaa matkan hinta");
			return true;
		}
		
		else {
			System.out.println("Harmillisesti sinulla ei ollut varaa matkaan");
			return false;
		}
		
	}
	
}
