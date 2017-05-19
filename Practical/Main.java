import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class Main implements Touch{
    public static void main(String args[]){
        TouchSensor ts = new TouchSensor(SensorPort.S1);
    }
    public void addTouchListener(TouchListener touchListener) {

    }
    @Override
    public boolean isPressed() {
        Sound.beep();
        return false;
    }

    public class TouchListener{

    }
}