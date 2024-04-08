import java.util.ArrayList;
import java.util.List;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Library {

    /**
     * The books in the library.
     */
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
     * @throws IllegalArgumentException If the book is null.
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        books.add(book);
    }

    /**
     * Removes a book from the library.
     *
     * @param book The book to be removed.
     * @throws IllegalArgumentException If the book is null.
     */
    public void removeBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        books.remove(book);
    }

    /**
     * Finds a book by its title.
     *
     * @param title The title of the book.
     * @return The book if found, null otherwise.
     * @throws IllegalArgumentException If the title is null or empty.
     */
    public Book findBookByTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title must not be null or empty");
        }
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
     * @throws IllegalArgumentException If the author is null or empty.
     */
    public Book findBookByAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author must not be null or empty");
        }
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
     * @throws IllegalArgumentException If the ISBN is null or empty.
     */
    public Book findBookByISBN(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("ISBN must not be null or empty");
        }
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
