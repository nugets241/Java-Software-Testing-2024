import java.util.Random;
import java.util.HashSet;
import java.util.Set;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Lottery {

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
     * Generates a lottery draw.
     *
     * @return  A set of unique lottery numbers.
     */
    public static Set<Integer> lottery() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 7) {
            int number = dice() + new Random().nextInt(35); // Generate a number between 1 and 40
            numbers.add(number);
        }
        return numbers;
    }

    /**
     * Demonstrates the lottery method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        Set<Integer> lotteryNumbers = lottery();
        System.out.println("Lottery: " + lotteryNumbers);
    }
}
