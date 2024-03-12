/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.12 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Print {

    /**
     * Prints out the date, name, and height of the author.
     *
     * @param  date      The date of the print.
     * @param  firstName The first name of the author.
     * @param  lastName  The last name of the author.
     * @param  height    The height of the author.
     */
    public static void printInfo(String date, String firstName, String lastName, int height) {
        System.out.println("The date is " + date);
        System.out.println("Hello, I'm " + firstName + " " + lastName);
        System.out.println("I am " + height + " cm tall");
    }

    /**
     * Implements exercise 1.2.
     *
     * Demonstrates the printInfo method.
     *
     * @param  args  Command line arguments. Not used.
     */

    public static void main(String[] args) {
        String date = "2024-03-12";
        String firstName = "Ej";
        String lastName = "Sobrepeña";
        int height = 161;

        printInfo(date, firstName, lastName, height);
    }
}

// End of file
