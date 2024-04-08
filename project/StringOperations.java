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
     * @throws IllegalArgumentException If the string is null or empty.
     */
    public String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Concatenates two strings.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return The concatenated string.
     * @throws IllegalArgumentException If either string is null or empty.
     */
    public String concatenateStrings(String str1, String str2) {
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("Strings must not be null or empty");
        }
        return str1 + str2;
    }

    /**
     * Finds a substring in a string.
     *
     * @param str The string to be searched.
     * @param sub The substring to be found.
     * @return True if the substring is found, false otherwise.
     * @throws IllegalArgumentException If either string is null or empty.
     */
    public boolean findSubstring(String str, String sub) {
        if (str == null || str.isEmpty() || sub == null || sub.isEmpty()) {
            throw new IllegalArgumentException("String and substring must not be null or empty");
        }
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
        if (str == null || str.isEmpty() || oldSub == null || oldSub.isEmpty() || newSub == null) {
            throw new IllegalArgumentException("String, old substring and new substring must not be null or empty");
        }
        return str.replace(oldSub, newSub);
    }

    /**
     * Converts a string to upper case.
     *
     * @param str The string to be converted.
     * @return The upper case string.
     */
    public String convertToUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }
        return str.toUpperCase();
    }
}
