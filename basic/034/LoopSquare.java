/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class LoopSquare {

    /**
     * Prints a square of the given size.
     *
     * @param size  The size of the square to print.
     */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    /**
     * Implements exercise 3.4.
     *
     * Demonstrates the printSquare method with various sizes.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        printSquare(2);
        System.out.println();
        printSquare(3);
        System.out.println();
        printSquare(4);
    }
}
