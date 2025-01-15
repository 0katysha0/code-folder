import java.util.Scanner; 

import static java.lang.System.*;

public class MilesPerHour {

    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0, 0, 0);
        mph = 0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        setNums(dist, hrs, mins);
        calcMPH();
    }

    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void calcMPH() {
        double totalTimeInHours = hours + (minutes / 60.0); 
        if (totalTimeInHours > 0) { 
            mph = distance / totalTimeInHours;
        } else {
            mph = 0.0; 
        }
    }

    public void print() {
        out.printf("%d miles in %d hour%s and %d minute%s = %.2f MPH.%n",
                   distance, hours, (hours == 1 ? "" : "s"), minutes, (minutes == 1 ? "" : "s"), mph);
    }
}
