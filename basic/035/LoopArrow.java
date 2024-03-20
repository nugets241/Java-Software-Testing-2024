/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class LoopArrow {

    /**
     * Prints an arrow pattern of the given size with the given character.
     *
     * @param size  The size of the arrow to print.
     * @param ch    The character to use in the arrow.
     */
    public static void printArrow(int size, String ch) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < size; k++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < size; k++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /**
     * Implements exercise 3.5.
     *
     * Demonstrates the printArrow method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int size = 5;
        String ch = "*";
        printArrow(size, ch);
    }
}
