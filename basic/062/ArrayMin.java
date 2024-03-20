/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ArrayMin {

    /**
     * Returns the minimum value of an array of integers.
     *
     * @param array  The array to find the minimum of.
     * @return       The minimum value of the array.
     */
    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Demonstrates the min method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
        int min = min(array);
        System.out.println("The minimum value of the array is " + min);
    }
}
