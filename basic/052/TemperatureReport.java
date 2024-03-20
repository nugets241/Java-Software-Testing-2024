/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class TemperatureReport {

    /**
     * Calculates and prints the minimum, maximum, and average of an array of temperatures.
     *
     * @param temperatures  The array of temperatures.
     */
    public static void printReport(double[] temperatures) {
        double min = temperatures[0];
        double max = temperatures[0];
        double sum = 0.0;

        for (double temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
            sum += temp;
        }

        double avg = sum / temperatures.length;

        System.out.println("Temperatures:");
        System.out.printf("Min: %.1f\n", min);
        System.out.printf("Max: %.1f\n", max);
        System.out.printf("Avg: %.1f\n", avg);
    }

    /**
     * Demonstrates the printReport method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double[] temperatures = {15.5, 17.2, 16.8, 14.9, 15.2, 16.3, 15.8, 16.1, 15.6, 16.5};
        printReport(temperatures);
    }
}
