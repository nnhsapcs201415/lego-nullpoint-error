import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class LS implements SensorPortListener{
    
    public static void main (String args[]){
        SensorPort.S2.addSensorPortListener(this);
    }
    
    public void stateChanged(SensorPort port, int value, int oldValue){
        if(port == SensorPort.S1 
    }
}