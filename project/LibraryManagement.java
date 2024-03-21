import java.util.ArrayList;
import java.util.List;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class LibraryManagement {

    /**
     * The users of the library management system.
     */
    private List<User> users;

    /**
     * The transactions of the library management system.
     */
    private List<Transaction> transactions;

    /**
     * Creates a new library management system.
     */
    public LibraryManagement() {
        this.users = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    /**
     * Registers a new user.
     *
     * @param user The user to be registered.
     */
    public void registerUser(User user) {
        users.add(user);
    }

    /**
     * Removes a user.
     *
     * @param user The user to be removed.
     */
    public void removeUser(User user) {
        users.remove(user);
    }

    /**
     * Finds a user by their name.
     *
     * @param name The name of the user.
     * @return The user if found, null otherwise.
     */
    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Finds a user by their email.
     *
     * @param email The email of the user.
     * @return The user if found, null otherwise.
     */
    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Returns all the transactions.
     *
     * @return All the transactions.
     */
    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}
