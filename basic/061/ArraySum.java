/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ArraySum {

    /**
     * Calculates the sum of an array of integers.
     *
     * @param array  The array to sum.
     * @return       The sum of the array.
     */
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    /**
     * Demonstrates the sum method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
        int sum = sum(array);
        System.out.println("The sum of the array is " + sum);
    }
}
