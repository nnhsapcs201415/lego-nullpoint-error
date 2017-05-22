import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
import lejos.robotics.objectdetection.*;
public class TouchSense implements FeatureListener {
    public static void main (String args[]) throws Exception{
        TouchSense listener = new TouchSense();
        Touch bump = new TouchSensor(SensorPort.S3);
        FeatureDetector fd = new TouchFeatureDetector(bump);
        fd.addListener(listener);
    }
    public void featureDetected(Feature feature, FeatureDetector detector) {
        
    }
}