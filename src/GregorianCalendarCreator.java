import java.util.Calendar;
import java.util.GregorianCalendar;

//https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html#UNDECIMBER
//https://www.geeksforgeeks.org/java-util-gregoriancalendar-class-java/

public class GregorianCalendarCreator {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar birthday = new GregorianCalendar(1970,Calendar.JANUARY, 1);


        int todayMonth = today.get(today.MONTH);
        int todayDayOfMonth = today.get(today.DAY_OF_MONTH);
        int todayYear = today.get(today.YEAR);


        int birthdayMonth = birthday.get(birthday.MONTH);
        int birthdayDayOfMonth = birthday.get(birthday.DAY_OF_MONTH);
        int birthdayYear = birthday.get(birthday.YEAR);


    }

}
