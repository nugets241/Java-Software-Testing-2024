/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.02.29 (last modified)
 * @since       17.0 (minimum Java version)
 */
class Hello {

    /**
     * Implements exercise 1.1.
     *
     * Demonstrates the Hello World program.
     *
     * @param  args  Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String name = "Ej Sobrepena";
        String message = "Hello, I am " + name;
        String border = "*".repeat(message.length() + 4);

        System.out.println(border);
        System.out.println("* " + message + " *");
        System.out.println(border);
    }
}

// End of file
