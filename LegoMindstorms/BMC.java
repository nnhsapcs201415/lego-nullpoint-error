import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
public class BMC{
    public static void main (String args[]){
        LCD.drawString("Program 1", 0, 0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.forward();
        LCD.drawString("FORWARD", 0, 0);
        Button.waitForAnyPress();
        Motor.A.backward();
        LCD.drawString("BACKWARD", 0, 0);
        Button.waitForAnyPress();
        Motor.A.stop();
    }
}
