package test;

import main.MyGregorianCalendar;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyGregorianCalendarTest {
    // Test the date of my birthday
    @Test
    public void testMyBirthday() {
        MyGregorianCalendar myGregorianCalendar = new MyGregorianCalendar();

        GregorianCalendar birthday = new GregorianCalendar(2000, Calendar.JANUARY, 1);

        assertEquals(2000, birthday.get(birthday.YEAR));
        assertEquals(0, birthday.get(birthday.MONTH));
        assertEquals(1, birthday.get(birthday.DATE));
    }

    // Test the date of some days away from my birthday
    @Test
    public void testTenThousandDaysFromMyBirthday() {
        MyGregorianCalendar myGregorianCalendar = new MyGregorianCalendar();

        GregorianCalendar birthday = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        birthday.add(Calendar.DAY_OF_MONTH, 10000);

        assertEquals(2027, birthday.get(birthday.YEAR));
        assertEquals(4, birthday.get(birthday.MONTH));
        assertEquals(19, birthday.get(birthday.DATE));
    }
}
