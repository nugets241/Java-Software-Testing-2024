/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ArrayMax {

    /**
     * Returns the maximum value of an array of integers.
     *
     * @param array  The array to find the maximum of.
     * @return       The maximum value of the array.
     */
    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Demonstrates the max method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
        int max = max(array);
        System.out.println("The maximum value of the array is " + max);
    }
}
