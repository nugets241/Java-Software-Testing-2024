import java.util.Arrays;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ArrayOperations {

    /**
     * Finds the maximum value in an array.
     *
     * @param array The array to be searched.
     * @return The maximum value in the array.
     */
    public int findMax(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    /**
     * Finds the minimum value in an array.
     *
     * @param array The array to be searched.
     * @return The minimum value in the array.
     */
    public int findMin(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    /**
     * Calculates the average of an array.
     *
     * @param array The array to be averaged.
     * @return The average of the array.
     */
    public double calculateAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    /**
     * Sorts an array in ascending order.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public int[] sortArray(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }

    /**
     * Reverses an array.
     *
     * @param array The array to be reversed.
     * @return The reversed array.
     */
    public int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}
