/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class LoopMultable {

    /**
     * Prints a multiplication table of the given size.
     *
     * @param size  The size of the table to print.
     */
    public static void printMultable(int size) {
        System.out.print("  * |");
        for (int i = 1; i <= size; i++) {
            System.out.printf(" %2d", i);
        }
        System.out.println("\n" + "----|" + "---".repeat(size));
        for (int i = 1; i <= size; i++) {
            System.out.printf(" %2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf(" %2d", i * j);
            }
            System.out.println();
        }
    }

    /**
     * Implements exercise 3.6.
     *
     * Demonstrates the printMultable method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int size = 9;
        printMultable(size);
    }
}
