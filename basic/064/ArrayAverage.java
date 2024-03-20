/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ArrayAverage {

    /**
     * Calculates the average of an array of integers.
     *
     * @param array  The array to calculate the average of.
     * @return       The average of the array.
     */
    public static double average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    /**
     * Demonstrates the average method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
        double average = average(array);
        System.out.println("The average of the array is " + average);
    }
}
