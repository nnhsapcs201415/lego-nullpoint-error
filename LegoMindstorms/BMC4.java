import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;
public class BMC4{
    public static void main (String args[]){
        LCD.drawString("Program 4",0 ,0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.rotate(1440, true);
        while(Motor.A.getTachoCount() < 1440){ LCD.drawInt(Motor.A.getTachoCount(),0,0); }
        Button.waitForAnyPress();
        Motor.A.stop();
        LCD.drawInt(Motor.A.getTachoCount(),0,1);
        Button.waitForAnyPress();
    }
}