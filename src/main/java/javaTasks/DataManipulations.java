package javaTasks;

import java.time.Duration;
import java.time.Instant;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DataManipulations {
    private Instant startTime;
    private Instant endTime;
    private boolean running;

    public void start() {
        if (!running) {
            startTime = Instant.now();
            running = true;
        } else {
            System.out.println("Stopwatch is already running. Use stop() before starting again.");
        }
    }

    public void stop() {
        if (running) {
            endTime = Instant.now();
            running = false;
        } else {
            System.out.println("Stopwatch is not running. Use start() before stopping.");
        }
    }
    public Duration getElapsedDuration() {
        if (running) {
            return Duration.between(startTime, Instant.now());
        } else {
            return Duration.between(startTime, endTime);
        }
    }

    public long getElapsedTime() {
        Duration duration = getElapsedDuration();
        return duration.toMillis();
    }

    public long getElapsedTime(TimeUnit timeUnit) {
        return timeUnit.convert(getElapsedTime(), TimeUnit.MILLISECONDS);
    }

// 1 - Jan

    public static String monthNumberToAbbr(int monthNumber) {

        return Month.of(monthNumber).getDisplayName(
                TextStyle.SHORT, Locale.getDefault()
        );
    }

// 1 - January

    public static String monthNumberToFullName(int monthNumber) {
        return Month.of(monthNumber).getDisplayName(
                TextStyle.FULL, Locale.getDefault()
        );
    }

// 1 - JANUARY

    public static String monthNumberToName(int monthNumber) {
        return Month.of(monthNumber).name();
    }

}
