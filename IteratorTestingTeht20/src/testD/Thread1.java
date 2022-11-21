package testD;

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
		colorlist.add("ruskea");
	}
	
	synchronized void iterate() {
		
		Iterator<String> it = colorlist.iterator();
		
		while(it.hasNext()) {

			  if (it.next().equalsIgnoreCase("musta")) {
				  it.remove();
			  }

			}
		System.out.println(colorlist);
	}
	

}
