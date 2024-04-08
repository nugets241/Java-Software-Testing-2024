import java.util.Calendar;
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
     * The date by which the book should be returned.
     */
    private Date dueDate;

    /**
     * The return date of the transaction.
     */
    private Date returnDate;

    /**
     * Creates a new transaction.
     *
     * @param user The user who borrows the book.
     * @param book The book that is borrowed.
     * @throws IllegalArgumentException If the user or book is null.
     */
    public Transaction(User user, Book book) {
        if (user == null) {
            throw new IllegalArgumentException("User must not be null");
        } else if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        this.user = user;
        this.book = book;
        this.borrowDate = new Date();
        this.dueDate = new Date(14 * 24 * 60 * 60 * 1000L + borrowDate.getTime());
        this.returnDate = null;
    }

    /**
     * Returns the user of the transaction.
     *
     * @return The user of the transaction.
     */
    public User getUser() {
        if (user == null) {
            throw new IllegalArgumentException("User must not be null");
        }
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
     * Returns the return date of the transaction.
     *
     * @return The return date of the transaction.
     */
    public Date getReturnDate() {
        return returnDate;
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
     * Sets the return date of the transaction.
     *
     * @param returnDate The return date of the transaction.
     * @throws IllegalArgumentException If the return date is null or before
     *                                  the borrow date.
     */
    public void setReturnDate(Date returnDate) {
        if (returnDate == null) {
            throw new IllegalArgumentException("Return date must not be null");
        } else if (returnDate.before(borrowDate)) {
            throw new IllegalArgumentException("Return date must not be before borrow date");
        }
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

    /**
     * Sets the due date of the transaction.
     *
     * @param days The number of days to borrow the book.
     * @throws IllegalArgumentException If the days is less than or equal to 0.
     */
    public void extendDueDate(int extensionDays) {
        if (extensionDays <= 0) {
            throw new IllegalArgumentException("Extension days must be greater than 0");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.returnDate);
        calendar.add(Calendar.DATE, extensionDays);
        this.returnDate = calendar.getTime();
    }

    /**
     * Returns the due date of the transaction.
     *
     * @return The due date of the transaction.
     */
    public Date getDueDate() {
        return dueDate;
    }
}
