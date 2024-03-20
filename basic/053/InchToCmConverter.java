/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class InchToCmConverter {

    /**
     * Converts an array of measurements in inches to centimeters.
     *
     * @param inches  The array of measurements in inches.
     * @return        The array of measurements in centimeters.
     */
    public static double[] convertToCm(double[] inches) {
        double[] centimeters = new double[inches.length];
        for (int i = 0; i < inches.length; i++) {
            centimeters[i] = inches[i] * 2.54;
        }
        return centimeters;
    }

    /**
     * Demonstrates the convertToCm method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double[] inches = {1, 2, 3};
        double[] centimeters = convertToCm(inches);
        for (int i = 0; i < inches.length; i++) {
            System.out.printf("%d in = %.2f cm\n", (int)inches[i], centimeters[i]);
        }
    }
}
