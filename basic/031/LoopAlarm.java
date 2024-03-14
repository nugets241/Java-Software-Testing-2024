/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.14 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class LoopAlarm {

    /**
     * Counts down from the given number to 1, then prints "ALARM!".
     *
     * @param max  The number to count down from.
     */
    public static void countdown(int max) {
        for (int i = max; i >= 1; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("ALARM!");
    }

    /**
     * Implements exercise 3.1.
     *
     * Demonstrates the countdown method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int max = 10;
        countdown(max);
    }
}
