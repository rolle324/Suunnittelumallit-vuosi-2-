package saie;

import java.util.Observable;
import java.util.Scanner;

public class DigitalClock extends Observable implements Runnable{

    private int seconds=0;
    private int minutes=0;
    private int hours=0;
    private boolean lopetus = false;
    ClockTimer clocktimer = new ClockTimer();

    @Override
    public void run() {
        while(!lopetus) {
        	
            seconds++;
            if(seconds == 60) {
            	minutes = clocktimer.getMinute(minutes);
            	seconds = clocktimer.resetSeconds();
            }
            
            if(minutes == 60) {
            	hours = clocktimer.getMinute(hours);
            	seconds = clocktimer.resetSeconds();
            }
            
            String currentTime = ""+hours+":"+minutes+":"+seconds;
            
            setChanged();
            notifyObservers(currentTime);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        }
    
    

    public void lopeta() {
        lopetus = true;
    }
}
