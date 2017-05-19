import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class LightSensor implements SensorPortListener{   
    public static void main (String args[]) throws Exception{ 
        LightSensor listener = new LightSensor();
        listener.run();
    }
    
    public void stateChanged(SensorPort port, int value, int oldValue){
        if(port == SensorPort.S2){
            
        }
    }
    
    private void run() throws InterruptedException{
		SensorPort.S2.addSensorPortListener(this);
	}
}