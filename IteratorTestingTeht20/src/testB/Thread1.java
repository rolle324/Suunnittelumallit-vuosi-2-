package testB;

import java.util.ArrayList;
import java.util.Iterator;

public class Thread1 implements Runnable {

	ArrayList<String> colorlist = new ArrayList<String>();
	boolean alreadyExecuted = false;

	@Override
	public void run() {
		iterate();
		

	}

	public void AddingColors() {

		colorlist.add("valkoinen");
		colorlist.add("punainen");
		colorlist.add("sininen");
		colorlist.add("musta");
		colorlist.add("oranssi");
	}
	
	synchronized void iterate() {
		
		Iterator<String> it = colorlist.iterator();
		
		while(it.hasNext()) {
			  System.out.println(it.next());
			  try {
				  notifyAll();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	

}
