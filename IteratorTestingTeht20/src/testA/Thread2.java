package testA;

public class Thread2 implements Runnable {
	Thread1 thread1 = new Thread1();
	@Override
	public void run() {
		
		thread1.secondThread();
		
	}

}
