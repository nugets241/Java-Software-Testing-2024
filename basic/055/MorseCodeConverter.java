/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class MorseCodeConverter {

    /**
     * Converts a string of numbers into Morse code.
     *
     * @param str  The string of numbers to convert.
     * @return     The Morse code representation of the string.
     */
    public static String convertToMorse(String str) {
        String[] morseCodes = {
            "-----", // 0
            ".----", // 1
            "..---", // 2
            "...--", // 3
            "....-", // 4
            ".....", // 5
            "-....", // 6
            "--...", // 7
            "---..", // 8
            "----."  // 9
        };

        StringBuilder morse = new StringBuilder();
        for (char c : str.toCharArray()) {
            int digit = Character.getNumericValue(c);
            morse.append(morseCodes[digit]).append(" ");
        }

        return morse.toString();
    }

    /**
     * Demonstrates the convertToMorse method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String str = "050123456";
        String morse = convertToMorse(str);
        System.out.println("The Morse code representation of " + str + " is " + morse);
    }
}
