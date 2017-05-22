import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.Touch;
public class Challenge implements SensorPortListener, FeatureListener {
    public static int MAX_DETECT = 80;
    UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
    Touch ts = new TouchSensor(SensorPort.S3);
    LightSensor ls = new LightSensor(SensorPort.S2);
    DifferentialPilot pilot = new DifferentialPilot(5.5f, 16.5f, Motor.A, Motor.C);
    int state = 0;
    public Challenge() throws Exception, InterruptedException {
        RangeFeatureDetector rd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        rd.addListener(this);
        FeatureDetector fd = new TouchFeatureDetector(ts);
        fd.addListener(this);
        SensorPort.S2.addSensorPortListener(this);
    }
    public static void main(String args[]) throws Exception{
        Challenge c = new Challenge();
        Button.waitForAnyPress();
        c.pilot.travel(50, true);
        c.run();
        
    }
    public void featureDetected(Feature feature, FeatureDetector detector) {
        
    }
    public void stateChanged(SensorPort port, int value, int oldValue){
        if( oldValue > 780 ){
            state = 3;
        }
    }
    public void run(){
        while(true){
            if(state == 0){
                //in box
                
            }
            if(state == 1){
                //look for cans
                
            }
            if(state == 2){
                //push can
                
            }
            if(state == 3){
                //hit line, backup
                Motor.A.rotate(180);
                pilot.travel(50, false);
            }
        }
    }
}