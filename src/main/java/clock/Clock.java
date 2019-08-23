package clock;

import java.util.GregorianCalendar;

public class Clock {

    public double getAngleByTime(GregorianCalendar time) {
        int minutes = time.getTime().getMinutes();
        double additionalHours = minutesToHours(minutes);

        double hours = formatHours(time.getTime().getHours() + additionalHours);

        double angleByHours = getAngleByHours(hours);
        double angleByMintues = getAngleByMinutes(minutes);

        double angleBetweenPointers = getAngleBetweenPointers(angleByHours, angleByMintues);

        return getSmallestInternalAngle(angleBetweenPointers);

    }

    private double getSmallestInternalAngle(double angle) {
        double smallestAngle;
        if (angle > 180)
            smallestAngle = 360 - angle;
        else
            smallestAngle = angle;
        return smallestAngle;
    }

    private double getAngleBetweenPointers(double angleHours, double angleMinutes) {
        double angleBetween;
        if (angleHours >= angleMinutes)
            angleBetween = angleHours - angleMinutes;
        else
            angleBetween = angleMinutes - angleHours;
        return angleBetween;
    }

    private double getAngleByMinutes(int minutes) {
        int degreesByMinute = 360/60;
        return minutes * degreesByMinute;
    }

    private double getAngleByHours(double hours) {
        int degreesByHour = 360/12;
        return hours * degreesByHour;
    }

    private double formatHours(double hours) {
        if (hours >= 12)
            hours = hours - 12;
        return hours;
    }

    private double minutesToHours(int minutes) {
        return (double) minutes/60 ;
    }
}
