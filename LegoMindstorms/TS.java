import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class TS{
    public static void main (String args[]){
        TouchSensor ts = new TouchSensor(SensorPort.S3);
        while(true){
            if(ts.isPressed() == true){
                LCD.drawString("Touched",0,0);
                Delay.msDelay(2000);
                LCD.clear();
            }
        }
    }
}