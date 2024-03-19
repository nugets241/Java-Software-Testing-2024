import java.util.Calendar;
import java.util.Date;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class DateOperations {

    /**
     * Gets the day of a date.
     *
     * @param date The date.
     * @return The day of the date.
     */
    public int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Gets the month of a date.
     *
     * @param date The date.
     * @return The month of the date.
     */
    public int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;  // Month is 0-based in Java
    }

    /**
     * Gets the year of a date.
     *
     * @param date The date.
     * @return The year of the date.
     */
    public int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Checks if a year is a leap year.
     *
     * @param year The year to be checked.
     * @return True if the year is a leap year, false otherwise.
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    /**
     * Calculates the number of days between two dates.
     *
     * @param date1 The first date.
     * @param date2 The second date.
     * @return The number of days between date1 and date2.
     */
    public int calculateDaysBetween(Date date1, Date date2) {
        long differenceInMilliSeconds = Math.abs(date2.getTime() - date1.getTime());
        return (int) (differenceInMilliSeconds / (1000 * 60 * 60 * 24));
    }
}
