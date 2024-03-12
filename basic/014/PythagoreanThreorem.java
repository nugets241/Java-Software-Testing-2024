/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.12 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class PythagoreanThreorem {

    /**
     * Calculates the hypotenuse of a right-angled triangle.
     *
     * @param a The length of the first side.
     * @param b The length of the second side.
     */
    public static void calculateHypotenuse(int a, int b) {
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Side a      : " + a);
        System.out.println("Side b      : " + b);
        System.out.println("Hypotenuse  : " + hypotenuse);
    }

    /**
     * Implements exercise 1.4.
     *
     * Demonstrates the calculateHypotenuse method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        calculateHypotenuse(a, b);
    }

}

// End of file
