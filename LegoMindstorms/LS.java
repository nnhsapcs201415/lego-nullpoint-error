import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class LS implements SensorPortListener{
    
    public static void main (String args[]){
        LS listener = new LS();
        LightSensor light = new LightSensor(SensorPort.S2);
        SensorPort.S2.addSensorPortListener(listener);
        LCD.drawInt(light.readValue(),0,0);
    }
    
    public void stateChanged(SensorPort port, int value, int oldValue){
        if(port == SensorPort.S2){
            Button.waitForAnyPress();
        }
    }
}