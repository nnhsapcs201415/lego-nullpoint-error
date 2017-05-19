import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
import lejos.robotics.objectdetection.*;
public class UltrasonicSense implements FeatureListener {
    public static int MAX_DETECT = 80;
    public UltrasonicSense() throws Exception {
        UltrasonicSense listener = new UltrasonicSense();
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        fd.addListener(listener);
        Button.ENTER.waitForPressAndRelease();
    }
    public void featureDetected(Feature feature, FeatureDetector detector) {
        int range = (int)feature.getRangeReading().getRange();
    }
    public int getDetected()
    {
        return featureDetected(feature, detector6te5q   q   t )
    }
}