/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.13 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class IfDay {

    /*
     * The numbers for the days of the week.
     */
    final static int MONDAY = 1;
    final static int TUESDAY = 2;
    final static int WEDNESDAY = 3;
    final static int THURSDAY = 4;
    final static int FRIDAY = 5;
    final static int SATURDAY = 6;
    final static int SUNDAY = 7;

    /**
     * Prints the day of the week.
     *
     * <p>Prints the day of the week based on the given number.
     *
     * @param day  The number of the day.
     */
    public static void printDay(int day){
        if (day == MONDAY) {
            System.out.println("Monday");
        } else if (day == TUESDAY) {
            System.out.println("Tuesday");
        } else if (day == WEDNESDAY) {
            System.out.println("Wednesday");
        } else if (day == THURSDAY) {
            System.out.println("Thursday");
        } else if (day == FRIDAY) {
            System.out.println("Friday");
        } else if (day == SATURDAY) {
            System.out.println("Saturday");
        } else if (day == SUNDAY) {
            System.out.println("Sunday");
        } else {
            System.out.println("Unknown date (" + day + ")");
        }
    }

    /**
     * Implements exercise 2.2.
     *
     * Demonstrates the printDay method.
     */
    public static void main(String[] args) {
        int today = MONDAY;

        printDay(today);
    }
}

// End of file
