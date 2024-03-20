/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class LoopSeries {

    /**
     * Prints a series of 10-based column numbers up to the given length.
     *
     * <p>The last number is substituted with a space.
     *
     * @param length  The length of the series to print.
     */
    public static void printSeries(int length) {
        for (int i = 1; i <= length; i++) {
            if (i % 10 == 0) {
                System.out.print(" ");
            } else {
                System.out.print(i % 10);
            }
        }
        System.out.println();
    }

    /**
     * Implements exercise 3.2.
     *
     * Demonstrates the printSeries method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int length = 25;
        printSeries(length);
    }
}
