/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class ReverseArray {

    /**
     * Prints the elements of an array in reverse order.
     *
     * @param array  The array to print in reverse.
     */
    public static void printReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Demonstrates the printReverse method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        printReverse(array);
    }
}
