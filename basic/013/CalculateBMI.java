/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.12 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class CalculateBMI {

    /**
     * Calculates the BMI of the author.
     *
     * @param weight The weight of the author.
     * @param height The height of the author.
     */
    public static void calculateBMI(int weight, int height) {
        double heightInMeters = height / 100.0;
        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.println("Weight (kg): " + weight);
        System.out.println("height (m) : " + heightInMeters);
        System.out.println("BMI        : " + bmi);
    }

    /**
     * Implements exercise 1.3.
     *
     * Demonstrates the calculateBMI method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int weight = 60;
        int height = 161;

        calculateBMI(weight, height);
    }
}

// End of file
