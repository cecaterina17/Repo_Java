package Class9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class calendar {

    /**
     * Due: Wed (Apr 6)
     * <p>
     * Create a method that will print timeline for given input data-points
     * <p>
     * Timeline should be (hour am/pm) with 2 hour interval from the current time.
     * <p>
     * generateTimeline(5)
     * Now 11pm 1am 3am 5am
     * <p>
     * generateTimeline(2)
     * Now 11pm
     * <p>
     * generateTimeline(8)      // running code at 4:30am
     * Now 6am 8am 10am 12pm 2pm 4pm 6pm
     */

    // I had issues with AM and PM. Tried multiple solutions and following worked
    // I use 1-24 hour format to get users local time. Also, I convert String output to Integer to create conditions & compare values
    // Also, figured that I can use if else blocks to separate AM/PM. 12-24 is PM and 24-12 is AM
    // Incrementing also added complexity and I needed to consider what happens when code gets incremented past value 24

    // Modulus operator gives remainder when dividing by 12. Using 1-24 hour format, remainder is value between 1-11
    // Only exceptions are Noon and Midnight with respective remainder of 0 and 2.

    // If value is exactly Noon(12th Hour), I increment as usual until increments get to 24th Hour
    // While incrementing, if loop ends up on Midnight(24th Hour), I reset hour variable which corresponds to initial starting hour & increments after each loop cycle.
    // After resetting hour variable, it ends up in AM period and can normally proceed incrementing until the Midnight.

    // If, due to incrementing, hour variable goes past 24, never entering dedicated (hour == 24), following logic executes:
    // Whatever value it is, 25,28,29.. etc, I use modulus to find remainder and reset hour variable to that value
    // It resets time back to AM part of the clock
    public static void timeline(int hourInterval) {
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("k");
        int hour = Integer.valueOf(sdf.format(time));
        System.out.print("\nNow");
        for (int i = 0; i < hourInterval - 1; i++) {
            hour += 2;
            if (hour >= 1 && hour < 12) {
                System.out.print(" " + hour % 12 + "am");
            } else if (hour > 12 && hour < 24) {
                System.out.print(" " + hour % 12 + "pm");
            } else if (hour == 12) {
                System.out.print(" 12pm");
            } else if (hour == 24) {
                System.out.print(" 12am");
                hour = 0;
            } else if (hour > 24) {
                System.out.print(" " + hour % 12 + "am");
                hour = hour % 12;
            }
        }
    }

    public static void main(String[] args) {
        timeline(5);
    }
}
