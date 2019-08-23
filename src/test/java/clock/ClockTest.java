package clock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockTest {
    private Clock clock;
    private Date date;
    private GregorianCalendar calendar;


    @BeforeEach
    void init(){
        clock = new Clock();
        date = new Date();
        calendar = new GregorianCalendar();
    }

    @Nested
    @DisplayName("Testing 12-hours format with exact hours")
    class TestTwelveHourTime {

        @Test
        void testOneAM() {
            date.setHours(1);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 30;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 30°.");

        }

        @Test
        void testTwoAM() {
            date.setHours(2);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 60;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 60°.");

        }

        @Test
        void testThreeAM() {
            date.setHours(3);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 90;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 90°.");

        }

        @Test
        void testFourAM() {
            date.setHours(4);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 120;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 120°.");

        }

        @Test
        void testFiveAM() {
            date.setHours(5);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 150;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 150°.");

        }

        @Test
        void testSixAM() {
            date.setHours(6);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 180;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 180°.");

        }

        @Test
        void testSevenAM() {
            date.setHours(7);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 150;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 150°.");

        }

        @Test
        void testEightAM() {
            date.setHours(8);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 120;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 120°.");

        }

        @Test
        void testNineAM() {
            date.setHours(9);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 90;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 90°.");

        }

        @Test
        void testTenAM() {
            date.setHours(10);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 60;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 60°.");

        }

        @Test
        void testElevenAM() {
            date.setHours(11);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 30;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 30°.");

        }

        @Test
        void testTwelveAM() {
            date.setHours(12);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 0;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 0°.");

        }
    }

    @Nested
    @DisplayName("Testing 24-hours format with exact hours")
    class TestTwentyFourHourTime {

        @Test
        void testOnePM() {
            date.setHours(13);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 30;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 30°.");

        }

        @Test
        void testTwoPM() {
            date.setHours(14);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 60;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 60°.");

        }

        @Test
        void testThreePM() {
            date.setHours(15);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 90;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 90°.");

        }

        @Test
        void testFourPM() {
            date.setHours(16);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 120;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 120°.");

        }

        @Test
        void testFivePM() {
            date.setHours(17);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 150;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 150°.");

        }

        @Test
        void testSixPM() {
            date.setHours(18);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 180;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 180°.");

        }

        @Test
        void testSevenPM() {
            date.setHours(19);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 150;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 150°.");

        }

        @Test
        void testEightPM() {
            date.setHours(20);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 120;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 120°.");

        }

        @Test
        void testNinePM() {
            date.setHours(21);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 90;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 90°.");

        }

        @Test
        void testTenPM() {
            date.setHours(22);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 60;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 60°.");

        }

        @Test
        void testElevenPM() {
            date.setHours(23);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 30;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 30°.");

        }

        @Test
        void testTwelvePM() {
            date.setHours(24);
            date.setMinutes(0);
            calendar.setTime(date);

            double expected = 0;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 0°.");

        }
    }

    @Nested
    @DisplayName("Testing hours with random minutes")
    class TestHoursWithMinutes {

        @Test
        void testOneThirty() {
            date.setHours(1);
            date.setMinutes(30);
            calendar.setTime(date);

            double expected = 135;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 135°.");

        }

        @Test
        void testOneFifty() {
            date.setHours(1);
            date.setMinutes(50);
            calendar.setTime(date);

            double expected = 115;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 115°.");

        }

        @Test
        void testTwentyTwoFortySix() {
            date.setHours(22);
            date.setMinutes(46);
            calendar.setTime(date);

            double expected = 47;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 170°.");

        }

        @Test
        void testFifteenForty() {
            date.setHours(15);
            date.setMinutes(40);
            calendar.setTime(date);

            double expected = 130;
            double actual = clock.getAngleByTime(calendar);

            assertEquals(expected, actual, "Should return 130°.");

        }
    }
}