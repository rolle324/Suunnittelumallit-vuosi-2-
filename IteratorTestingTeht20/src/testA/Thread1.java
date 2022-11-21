package testA;

import java.util.ArrayList;
import java.util.Iterator;

public class Thread1 implements Runnable {

	ArrayList<String> colorlist = new ArrayList<String>();
	boolean alreadyExecuted = false;

	@Override
	public void run() {
		firstThread();
		

	}

	public void AddingColors() {

		colorlist.add("valkoinen");
		colorlist.add("punainen");
		colorlist.add("sininen");
		colorlist.add("musta");
		colorlist.add("oranssi");
	}
	
	public void firstThread() {
		
		Iterator<String> it = colorlist.iterator();
		
		while(it.hasNext()) {
			  System.out.println(it.next());
			}
	}
	
	public void secondThread() {
		
		Iterator<String> it2 = colorlist.iterator();
		
		while(it2.hasNext()) {
			  System.out.println(it2.next());
			}
	}

}
