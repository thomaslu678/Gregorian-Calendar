package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyGregorianCalendar {
    // Create an array for weekdays, as the get DAY_OF_WEEK method returns weekdays as numbers from 1-7
    static String [] WEEKDAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    // Create a global birthday object, which is repeatedly used
    static GregorianCalendar BIRTHDAY = new GregorianCalendar(1912,Calendar.JUNE, 23);

    // Method to display the date and weekday of some n number of days from today's date
    public void calculateNDaysFromToday(int nDays) {
        GregorianCalendar today = new GregorianCalendar();

        today.add(Calendar.DAY_OF_MONTH, nDays);

        // Get info about some number of days away from today
        int month = today.get(today.MONTH);
        int date = today.get(today.DATE);
        int year = today.get(today.YEAR);
        int dayOfWeek = today.get(today.DAY_OF_WEEK);

        String howManyDays = "days";
        if (nDays == 1) {howManyDays = "day";}

        // Display info about today
        System.out.println(nDays + " " + howManyDays + " after today, the date will be " + year + "/" + ((month) + 1) + "/" + date + ".");
        System.out.println("That will be a " + WEEKDAYS[dayOfWeek - 1] + ".");
    }

    // Method to display the date and weekday of the global birthday object
    public void displayBirthday() {

        // Get info about my birthday
        int month = BIRTHDAY.get(BIRTHDAY.MONTH);
        int date = BIRTHDAY.get(BIRTHDAY.DATE);
        int year = BIRTHDAY.get(BIRTHDAY.YEAR);
        int dayOfWeek = BIRTHDAY.get(BIRTHDAY.DAY_OF_WEEK);

        // Display info about my birthday
        System.out.println("\nOne famous computer scientist was born on the date " + year + "/" + month + "/" + date + ".");
        System.out.println("That was a " + WEEKDAYS[dayOfWeek - 1] + ".");
    }

    // Method to display the date of some n number of days away from the specified birthday
    public void calculateNDaysFromBirthday(int nDays) {
        BIRTHDAY.add(Calendar.DAY_OF_MONTH, nDays);

        // Get info about some number of days away from my birthday
        int month = BIRTHDAY.get(BIRTHDAY.MONTH);
        int date = BIRTHDAY.get(BIRTHDAY.DATE);
        int year = BIRTHDAY.get(BIRTHDAY.YEAR);

        String howManyDays = "days";
        if (nDays == 1) {howManyDays = "day";}

        // Display the info
        System.out.println("\n" + nDays + " " + howManyDays + " after the birthday of a famous computer scientist, the date is " + year + "/" + ((month) + 1) + "/" + date + ".");
    }

    public static void main(String[] args) {
        MyGregorianCalendar myGregorianCalendar = new MyGregorianCalendar();

        // Display info 100 days from today
        myGregorianCalendar.calculateNDaysFromToday(100);

        // Display info about my birthday
        myGregorianCalendar.displayBirthday();

        // Display info 10,000 days from my birthday
        myGregorianCalendar.calculateNDaysFromBirthday(10000);
    }
}
