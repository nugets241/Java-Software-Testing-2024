import java.util.Random;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class DiceRoller {

    /**
     * Rolls a dice and returns a random number between 1 and 6.
     *
     * @return  The result of the dice roll.
     */
    public static int dice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    /**
     * Demonstrates the dice method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int value = dice();
        System.out.println("The dice roll resulted in: " + value);
    }
}
