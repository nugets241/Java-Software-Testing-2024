import java.util.ArrayList;
import java.util.List;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Library {
    private List<Book> books;

    /**
     * Creates a new library.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Removes a book from the library.
     *
     * @param book The book to be removed.
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Finds a book by its title.
     *
     * @param title The title of the book.
     * @return The book if found, null otherwise.
     */
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Finds a book by its author.
     *
     * @param author The author of the book.
     * @return The book if found, null otherwise.
     */
    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Finds a book by its ISBN.
     *
     * @param isbn The ISBN of the book.
     * @return The book if found, null otherwise.
     */
    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
