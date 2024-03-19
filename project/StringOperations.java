/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class StringOperations {

    /**
     * Reverses a string.
     *
     * @param str The string to be reversed.
     * @return The reversed string.
     */
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Concatenates two strings.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The concatenated string.
     */
    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    /**
     * Finds a substring in a string.
     *
     * @param str The string to be searched.
     * @param sub The substring to be found.
     * @return True if the substring is found, false otherwise.
     */
    public boolean findSubstring(String str, String sub) {
        return str.contains(sub);
    }

    /**
     * Replaces a substring in a string with a new substring.
     *
     * @param str The string to be modified.
     * @param oldSub The substring to be replaced.
     * @param newSub The new substring.
     * @return The modified string.
     */
    public String replaceSubstring(String str, String oldSub, String newSub) {
        return str.replace(oldSub, newSub);
    }

    /**
     * Converts a string to upper case.
     *
     * @param str The string to be converted.
     * @return The upper case string.
     */
    public String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
}
