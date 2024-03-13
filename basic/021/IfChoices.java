/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.13 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class IfChoices {

    /**
     * Decides the order of three numbers.
     *
     * <p>Compares three numbers and decides which is the biggest, middle, and smallest.
     *
     * @param a  The first number.
     * @param b  The second number.
     * @param c  The third number.
     */
    public static void decideOrder(int a, int b, int c) {
        int biggest = 0;
        int middle = 0;
        int smallest = 0;

        if (a > b && a > c) {
            biggest = a;
            if (b > c) {
                middle = b;
                smallest = c;
            } else {
                middle = c;
                smallest = b;
            }
        }else if (b > a && b > c) {
            biggest = b;
            if (a > c) {
                middle = a;
                smallest = c;
            } else {
                middle = c;
                smallest = a;
            }
        } else {
            biggest = c;
            if (a > b) {
                middle = a;
                smallest = b;
            } else {
                middle = b;
                smallest = a;
            }
        }

        System.out.println(biggest + " is the biggest");
        System.out.println(middle + " is the middle");
        System.out.println(smallest + " is the smallest");
    }

    /**
     * Implements exercise 2.1.
     *
     * Demonstrates the decideOrder method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        int c = 7;

        decideOrder(a, b, c);

    }

}
