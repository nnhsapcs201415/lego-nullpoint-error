import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
import lejos.robotics.objectdetection.*;
import lejos.robotics.Touch;
public class Challenge implements SensorPortListener, FeatureListener {
    public static int MAX_DETECT = 80;
    public static int BOX = 15;
    UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
    Touch ts = new TouchSensor(SensorPort.S3);
    LightSensor ls = new LightSensor(SensorPort.S2);
    DifferentialPilot pilot = new DifferentialPilot(5.5f, 16.5f, Motor.A, Motor.C);
    int state = 0;
    public Challenge() throws Exception, InterruptedException {
        RangeFeatureDetector rd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        FeatureDetector fd = new TouchFeatureDetector(ts);
        rd.addListener(this);
        fd.addListener(this);
        SensorPort.S2.addSensorPortListener(this);
    }

    public static void main(String args[]) throws Exception{
        Challenge c = new Challenge();
        Button.waitForAnyPress();
        c.pilot.setTravelSpeed(30);
        c.run();
    }

    public void featureDetected(Feature feature, FeatureDetector detector) {
        int range = (int)feature.getRangeReading().getRange();
        LCD.drawInt(range,0,3);
        if(range < 20){
            state = 0;
        }
    }
    public void stateChanged(SensorPort port, int value, int oldValue){
        if(port == SensorPort.S2){
            LCD.drawInt(value,0,2);
            if( value > 700){
                state = 3;
            }
        }
    }

    public void run() throws InterruptedException{
        while(true){
            if(state == 0){
                //in box
                LCD.drawString("State 0", 0, 1);
                pilot.setRotateSpeed(10);
                pilot.rotate(15, true);
            }
            if(state == 1){
                //look for cans
                LCD.drawString("State 1", 0, 1);
                pilot.travel(50,false);
            }
            if(state == 2){
                //push can
                LCD.drawString("State 2", 0, 1);
            }
            if(state == 3){
                //hit line, backup
                LCD.drawString("State 3", 0, 1);
                pilot.travel(-15, false);
                pilot.rotate(180, false);
            }
        }
    }
}