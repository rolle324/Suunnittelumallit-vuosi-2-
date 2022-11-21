package testA;

public class Main {

	public static void main(String[] args) {
	Thread1 thread1 = new Thread1();
	Thread2 thread2 = new Thread2();
	
	
	thread1.AddingColors();
	Thread threadA = new Thread(thread1);
	Thread threadB = new Thread(thread2);
	threadA.start();
	threadB.start();

	}

}
