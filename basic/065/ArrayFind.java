/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ArrayFind {

    /**
     * Returns the first value in the array that is within the given range.
     * If no such value is found, returns the specified NOT_FOUND value.
     *
     * @param array      The array to search.
     * @param from       The lower bound of the range.
     * @param to         The upper bound of the range.
     * @param NOT_FOUND  The value to return if no value is found in the range.
     * @return           The first value in the range, or NOT_FOUND if no such value exists.
     */
    public static int findInRange(int[] array, int from, int to, int NOT_FOUND) {
        for (int num : array) {
            if (num >= from && num <= to) {
                return num;
            }
        }
        return NOT_FOUND;
    }

    /**
     * Demonstrates the findInRange method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {3, 1, 2};
        int from = 2;
        int to = 10;
        final int NOT_FOUND = -1;
        int value = findInRange(array, from, to, NOT_FOUND);
        if (value == NOT_FOUND) {
            System.out.println("No value found in the range.");
        } else {
            System.out.println("The first value in the range is " + value);
        }
    }
}
