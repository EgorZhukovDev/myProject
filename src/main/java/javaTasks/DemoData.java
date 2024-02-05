package javaTasks;

import java.util.concurrent.TimeUnit;

public class DemoData {
    public static void main(String[] args) {
        DataManipulations stopwatch = new DataManipulations();
        stopwatch.start();
        stopwatch.stop();

        long millis = stopwatch.getElapsedTime();
        long nanos = stopwatch.getElapsedTime(TimeUnit.NANOSECONDS);

        System.out.println(millis);
        System.out.println(DataManipulations.monthNumberToAbbr(1));
        System.out.println(DataManipulations.monthNumberToFullName(1));
        System.out.println(DataManipulations.monthNumberToName(1));
        System.out.println(nanos);
    }
}
