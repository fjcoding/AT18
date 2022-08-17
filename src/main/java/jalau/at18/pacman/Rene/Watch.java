package jalau.at18.pacman.Rene;

import java.util.Calendar;

public class Watch {
    private long time;

    public long getTime() {
        long startTime = Calendar.getInstance().getTimeInMillis();
        longRunningMethod();
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        return time;
    }

     public static void longRunningMethod() {
        try {
           Thread.sleep(1000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
    
}
