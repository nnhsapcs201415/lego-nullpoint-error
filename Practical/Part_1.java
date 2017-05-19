import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;
public class Part_1
{
    DifferentialPilot pilot = new DifferentialPilot(5.5f, 16.5f, Motor.A, Motor.C);
    UltrasonicSense us = new UltrasonicSense();
    public Part_1()
    {
        exit=findExit();
        pilot.rotate(exit, true);
        pilot.travel(20,false);
        //move forword
    }
    public int findExit()
    {
        int turn=0;
        int distence=0;
        int exit=0;
        while(turn>=21600)
        {
            pilot.rotate(900, true);
            turn+=900;
            distence = us.getDetection;
            if (distence>exit)
            {exit=distence;}
        }
        return exit;
    }
    public static void main(String args[])
    {
        part1=new Part_l();
    }
}