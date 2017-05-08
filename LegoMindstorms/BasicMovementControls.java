import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
public class BasicMovementControls{
    public static void main (String args[]){
        LCD.drawString("Program 1", 0, 0);
        Button.waitForAnyPress();
        Motor.A.forward();
        System.out.println("FORWARD");
        Button.waitForAnyPress();
        Motor.A.backward();
        System.out.println("BACKWARD");
        Button.waitForAnyPress();
        Motor.A.stop();
    }
}
