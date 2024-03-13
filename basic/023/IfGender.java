/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.13 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class IfGender {

    /**
     * Represents genders.
     */
    final static int MALE = 0;
    final static int FEMALE = 1;

    /**
     * Categorizes an individual's height based on their gender.
     *
     * @param height the height of the individual
     * @param gender the gender of the individual (0 for male, 1 for female)
     */
    public static void heightCategory(int height, int gender) {
        if (gender == MALE) {
            if (height < 180) {
                System.out.println("Short male");
            } else if (height >= 180 && height < 187) {
                System.out.println("Normal male");
            } else {
                System.out.println("Tall male");
            }
        } else {
            if (height < 175) {
                System.out.println("Short female");
            } else if (height >= 175 && height < 182) {
                System.out.println("Normal female");
            } else {
                System.out.println("Tall female");
            }
        }
    }

    /**
     * Implements exercise 2.3.
     *
     * Demonstrates the heightCategory method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int gender = MALE;
        int height = 175;

        heightCategory(height, gender);
    }
}

// End of file
