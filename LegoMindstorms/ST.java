import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class ST{
    DifferentialPilot pilot;
    public static void main (String args[]){
        ST sq = new ST();
        sq.pilot = new DifferentialPilot(5.5f, 16.5f, Motor.A, Motor.C);
        sq.go();
    }
    
    public void go(){
        pilot.travel(20, false);
        pilot.rotate(90);
        pilot.travel(20, false);
        pilot.rotate(90);
        pilot.travel(20, false);
        pilot.rotate(90);
        pilot.travel(20, false);
        pilot.rotate(90);
    }
}