import java.util.ArrayList;
import java.util.List;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class User {

    /**
     * The name of the user.
     */
    private String name;

    /**
     * The email of the user.
     */
    private String email;

    /**
     * The books borrowed by the user.
     */
    private List<Book> borrowedBooks;

    /**
     * Creates a new user.
     *
     * @param name The name of the user.
     * @param email The email of the user.
     * @throws IllegalArgumentException If the name or email is null or empty.
     */
    public User(String name, String email) {
        if (name == null || name.isEmpty() || email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Name and email must not be null or empty");
        }
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * Returns the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the email of the user.
     *
     * @return The email of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Allows the user to borrow a book.
     *
     * @param book The book to be borrowed.
     * @throws IllegalArgumentException If the book is null or if the book is
     *                                  not available.
     */
    public void borrowBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available");
        }
        borrowedBooks.add(book);
        book.setAvailable(false);
    }

    /**
     * Returns the books borrowed by the user.
     *
     * @return The books borrowed by the user.
     */
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    /**
     * Allows the user to return a book.
     *
     * @param book The book to be returned.
     * @throws IllegalArgumentException If the book is null or if the book was
     *                                  not borrowed by the user.
     */
    public void returnBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        if (!borrowedBooks.contains(book)) {
            throw new IllegalStateException("Book was not borrowed by this user");
        }
        borrowedBooks.remove(book);
        book.setAvailable(true);
    }
}
