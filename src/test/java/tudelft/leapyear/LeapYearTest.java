package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        LeapYear ly = new LeapYear();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }

    @Test
    public void nonLeapYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }

    @Test
    public void negativeNumber() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(-4));
    }

    @Test
    public void centennialNumber() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1900));
    }

    @Test
    public void zero() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(0));
    }

    @Test
    public void centennialDivisibleBy400Number() {
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }
}