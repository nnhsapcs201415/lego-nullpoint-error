import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class ST2{
    DifferentialPilot pilot;
    public static void main (String args[]){
        LCD.drawString("ST2", 0, 0);
        Button.waitForAnyPress();
        ST2 sq2 = new ST2();
        sq2.pilot = new DifferentialPilot(5.5f, 16.5f, Motor.A, Motor.C);
        sq2.go();
    }
    
    public void go(){
        
        for(int i = 0; i < 4; i++){
            pilot.travel(20, false);
            pilot.rotate(90 + i);
        }
        pilot.rotate(90, false);
        for(int i = 4; i > 0; i--){
            pilot.travel(20, false);
            pilot.rotate(-90 - i);
        }
        pilot.rotate(-90, false);
    }
}