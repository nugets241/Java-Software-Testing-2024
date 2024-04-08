/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    /**
     * Subtracts two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The difference of a and b.
     */
    public int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    /**
     * Multiplies two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    /**
     * Divides two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The quotient of a and b.
     * @throws IllegalArgumentException if b is 0.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Calculates the modulus of two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The modulus of a and b.
     * @throws IllegalArgumentException if b is 0.
     */
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot calculate modulus with zero");
        }
        return a % b;
    }
}
