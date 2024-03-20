/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class CircleArea {

    /**
     * Calculates the area of a circle with the given radius.
     *
     * @param radius  The radius of the circle.
     * @return        The area of the circle.
     */
    public static double areaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Demonstrates the areaCircle method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double radius = 5.0;
        double area = areaCircle(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }
}
