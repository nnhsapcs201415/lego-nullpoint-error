import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;
public class BMC3{
    public static void main (String args[]){
        LCD.drawString("Program 3",0 ,0);
        Button.waitForAnyPress();
        Motor.A.rotate(1440);
        LCD.clear();
        LCD.drawInt(Motor.A.getTachoCount(),0,0);
        Motor.A.rotateTo(0);
        LCD.drawInt(Motor.A.getTachoCount(),0,1);
        Button.waitForAnyPress();
    }
}