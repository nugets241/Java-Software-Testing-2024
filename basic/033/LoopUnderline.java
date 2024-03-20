/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class LoopUnderline {

    /**
     * Prints a string and an underline of the same length.
     *
     * @param str  The string to print and underline.
     */
    public static void printUnderlined(String str) {
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Implements exercise 3.3.
     *
     * Demonstrates the printUnderlined method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String str = "This is a test";
        printUnderlined(str);
    }
}
