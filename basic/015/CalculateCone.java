/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.12 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class CalculateCone {

    /**
     * Calculates the volume of a cone.
     *
     * <p>Multiples the area of the base of the cone
     * by the height and divides the product by 3.
     *
     * @param  radius The radius of the cone.
     * @param  height The height of the cone.
     * @return        The volume of the cone.
     */
    public static double calculateConeVolume(int radius, int height) {
        double volume = (Math.PI * Math.pow(radius, 2) * height) / 3;

        return volume;
    }

    /**
     * Implements exercise 1.5.
     *
     * Demonstrates the calculateConeVolume method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int radius = 3;
        int height = 4;

        double volume = calculateConeVolume(radius, height);

        System.out.println("The radius of the cone is " + radius);
        System.out.println("The height of the cone is " + height);
        System.out.println("The volume of the cone is " + volume);
    }

}

// End of file
