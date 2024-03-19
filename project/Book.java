/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private boolean isAvailable;

    /**
     * Creates a new book.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param isbn The ISBN of the book.
     * @param publicationYear The publication year of the book.
     */
    public Book(String title, String author, String isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    /**
     * Returns the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Returns the publication year of the book.
     *
     * @return The publication year of the book.
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Checks if the book is available.
     *
     * @return True if the book is available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability of the book.
     *
     * @param isAvailable The new availability of the book.
     */
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

// End of file
