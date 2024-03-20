/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class SumCalculator {

    /**
     * Calculates the arithmetic sum from 1 to the given number.
     *
     * @param n  The number to calculate the sum to.
     * @return   The arithmetic sum from 1 to n.
     */
    public static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    /**
     * Demonstrates the sum method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int total = sum(10);
        System.out.println("The sum from 1 to 10 is " + total);
    }
}
