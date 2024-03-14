/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.14 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class IfCalendar {

    /**
     * Displays events based on date and time.
     *
     * @param weekday the day of the week
     * @param hour    the hour of the day
     * @param minute  the minute of the hour
     */
    public static void displayEvent(String weekday, int hour, int minute) {
        switch (weekday) {
            case "Mon":
                if (hour == 19 && minute >= 0 || hour == 20 && minute <= 30) {
                    System.out.println("volleyball");
                } else {
                    System.out.println("No events for " + weekday + " " + hour + ":" + minute);
                }
                break;
            case "Wed":
                if (hour == 20 && minute >= 30 || hour == 21 && minute <= 30) {
                    System.out.println("badminton");
                } else {
                    System.out.println("No events for " + weekday + " " + hour + ":" + minute);
                }
                break;
            case "Sat":
                if (hour == 10 && minute >= 0 && minute <= 60) {
                    System.out.println("gym");
                } else {
                    System.out.println("No events for " + weekday + " " + hour + ":" + minute);
                }
                break;
            default:
                System.out.println("No events for " + weekday + " " + hour + ":" + minute);
                break;
        }
    }

    /**
     * Implements exercise 2.5.
     *
     * Demonstrates the displayEvent method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String weekday = "Mon"; // values of Mon..Fri
        int hour = 19; // 24-hour format
        int minute = 30;

        displayEvent(weekday, hour, minute);
    }

}
