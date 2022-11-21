package testB;

public class Main {

	public static void main(String[] args) {
	Thread1 thread1 = new Thread1();
	
	
	
	thread1.AddingColors();
	Thread threadA = new Thread(thread1);
	Thread threadB = new Thread(thread1);
	threadA.start();
	threadB.start();

	}

}
