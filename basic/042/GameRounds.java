/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class GameRounds {

    /**
     * Determines how many rounds a player can afford to play.
     *
     * @param money       The amount of money the player has.
     * @param roundPrice  The cost of each round.
     * @return            The number of rounds the player can afford.
     */
    public static int play(double money, double roundPrice) {
        return (int) (money / roundPrice);
    }

    /**
     * Demonstrates the play method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double money = 20.55;
        double roundPrice = 1.5;
        int rounds = play(money, roundPrice);
        System.out.println("The player can afford to play " + rounds + " rounds.");
    }
}
