import java.util.Calendar;
import java.util.GregorianCalendar;

//https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html#UNDECIMBER
//https://www.geeksforgeeks.org/java-util-gregoriancalendar-class-java/

public class GregorianCalendarCreator {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar birthday = new GregorianCalendar(1970,Calendar.JANUARY, 1);

        int todayYear = today.get(today.YEAR);
        System.out.println(todayYear);

        //today.add(Calendar.YEAR, 100);

        int todayYear2 = today.get(today.YEAR);
        System.out.println(todayYear2);
        int hello = today.get(today.DAY_OF_WEEK);
        System.out.println(hello);





        birthday.add(Calendar.YEAR, 20);
        int year = birthday.get(Calendar.YEAR);
        System.out.println(year);

    }

}
