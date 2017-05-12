import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class STT{
    public static void main (String args[]){
        LCD.drawString("STT", 0, 0);
        Button.waitForAnyPress();
        DifferentialPilot pilot = new DifferentialPilot(5.5f, 16.5f, Motor.A, Motor.C);
        ButtonCounter bc = new ButtonCounter();
        while(true){
             bc.count("Turn Rate");
             int tr = 10 * bc.getLeftCount() + 100 * bc.getRightCount();
             bc.count("Angle");
             int ang = 10 * bc.getLeftCount() + 100 * bc.getRightCount();
             pilot.steer(tr, ang);
        }
    }
}