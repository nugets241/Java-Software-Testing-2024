/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ArraySearch {

    /**
     * Prints the elements of an array that are within the given range.
     *
     * @param array  The array to search.
     * @param min    The minimum value of the range.
     * @param max    The maximum value of the range.
     */
    public static void printInRange(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                System.out.print(array[i]);
                if (i != array.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    /**
     * Demonstrates the printInRange method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {-3, -2, -1, 0, 1, 2, 3};
        int min = -1;
        int max = 2;
        printInRange(array, min, max);
    }
}
