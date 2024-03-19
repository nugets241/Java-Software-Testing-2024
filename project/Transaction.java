import java.util.Date;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Transaction {

    /**
     * The user of the transaction.
     */
    private User user;

    /**
     * The book of the transaction.
     */
    private Book book;

    /**
     * The borrow date of the transaction.
     */
    private Date borrowDate;

    /**
     * The return date of the transaction.
     */
    private Date returnDate;

    /**
     * Creates a new transaction.
     *
     * @param user The user who borrows the book.
     * @param book The book that is borrowed.
     */
    public Transaction(User user, Book book) {
        this.user = user;
        this.book = book;
        this.borrowDate = new Date();
        this.returnDate = null;
    }

    /**
     * Returns the user of the transaction.
     *
     * @return The user of the transaction.
     */
    public User getUser() {
        return user;
    }

    /**
     * Returns the book of the transaction.
     *
     * @return The book of the transaction.
     */
    public Book getBook() {
        return book;
    }

    /**
     * Returns the borrow date of the transaction.
     *
     * @return The borrow date of the transaction.
     */
    public Date getBorrowDate() {
        return borrowDate;
    }

    /**
     * Returns the return date of the transaction.
     *
     * @return The return date of the transaction.
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the return date of the transaction.
     *
     * @param returnDate The return date of the transaction.
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * Checks if the book is returned.
     *
     * @return True if the book is returned, false otherwise.
     */
    public boolean isReturned() {
        return returnDate != null;
    }
}
