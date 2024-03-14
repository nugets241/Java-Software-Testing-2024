/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.14 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class IfTemperature {

    /**
     * Represents cities.
     */
    final static int TORONTO = 0;
    final static int MONTREAL = 1;
    final static int VANCOUVER = 2;

    /**
     * Categorizes the temperature based on the city.
     *
     * @param city the city where the temperature is measured
     * @param temperature the temperature in the city
     */
    public static void temperatureCategory(int city, int temperature) {
        if (city == MONTREAL && temperature < -20) {
            System.out.println("Freezing");
        } else if ((city == TORONTO || city == VANCOUVER) && temperature < -20) {
            System.out.println("Ice Freezing");
        } else if (city == MONTREAL && temperature > -20) {
            System.out.println("Moderate Winter");
        } else if ((city == TORONTO || city == VANCOUVER) && temperature < -10 && temperature > -20) {
            System.out.println("Ice Cold");
        } else {
            System.out.println("Unknown");
        }
    }

    /**
     * Implements exercise 2.4.
     *
     * Demonstrates the temperatureCategory method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int city = TORONTO;
        int temperature = -25;

        temperatureCategory(city, temperature);
    }
}
