import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class LS implements SensorPortListener{
    
    public static void main (String args[]) throws Exception{ 
        LS listener = new LS();
        listener.run();
        Button.waitForAnyPress();
        LCD.clear();
        LCD.drawString("Finished", 3, 4);
        LCD.refresh();
    }
    
    public void stateChanged(SensorPort port, int value, int oldValue){
        if(port == SensorPort.S2){
            LCD.clear();
            LCD.drawString("State Changed",0,0);
            LCD.drawInt(value,7,1);
            LCD.drawInt(oldValue,11,2);
            LCD.refresh();
        }
    }
    
    private void run() throws InterruptedException{
		SensorPort.S2.addSensorPortListener(this);
	}
}