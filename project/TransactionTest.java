import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Date;

public class TransactionTest {
    private Transaction transaction1, transaction2, transaction3;
    private User user1, user2, user3;
    private Book book1, book2, book3;

    @Before
    public void setUp() {
        user1 = new User("User1", "user1@email.com");
        user2 = new User("User2", "user2@email.com");
        user3 = new User("User3", "user3@email.com");

        book1 = new Book("Title1", "Author1", "ISBN1", 2024);
        book2 = new Book("Title2", "Author2", "ISBN2", 1997);
        book3 = new Book("Title3", "Author3", "ISBN3", 2003);

        transaction1 = new Transaction(user1, book1);
        transaction2 = new Transaction(user2, book2);
        transaction3 = new Transaction(user3, book3);
    }

    @Test
    public void testGetUser1() {
        assertEquals(user1, transaction1.getUser());
    }

    @Test
    public void testGetUser2() {
        assertEquals(user2, transaction2.getUser());
    }

    @Test
    public void testGetUser3() {
        assertEquals(user3, transaction3.getUser());
    }

    @Test
    public void testGetBook1() {
        assertEquals(book1, transaction1.getBook());
    }

    @Test
    public void testGetBook2() {
        assertEquals(book2, transaction2.getBook());
    }

    @Test
    public void testGetBook3() {
        assertEquals(book3, transaction3.getBook());
    }

    @Test
    public void testGetBorrowDate1() {
        assertNotNull(transaction1.getBorrowDate());
    }

    @Test
    public void testGetBorrowDate2() {
        assertNotNull(transaction2.getBorrowDate());
    }

    @Test
    public void testGetBorrowDate3() {
        assertNotNull(transaction3.getBorrowDate());
    }

    @Test
    public void testGetReturnDate1() {
        assertNull(transaction1.getReturnDate());
    }

    @Test
    public void testGetReturnDate2() {
        assertNull(transaction2.getReturnDate());
    }

    @Test
    public void testGetReturnDate3() {
        assertNull(transaction3.getReturnDate());
    }

    @Test
    public void testIsReturned1() {
        assertFalse(transaction1.isReturned());
    }

    @Test
    public void testIsReturned2() {
        assertFalse(transaction2.isReturned());
    }

    @Test
    public void testIsReturned3() {
        assertFalse(transaction3.isReturned());
    }

    @Test
    public void testConstructorUserException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Transaction(null, book1));
    }

    @Test
    public void testConstructorBookException() {
        assertThrows(IllegalArgumentException.class, () -> new Transaction(user1, null));
    }

    @Test
    public void testSetReturnDateException() {
        assertThrows(IllegalArgumentException.class, () -> transaction1.setReturnDate(null));
    }

    @Test
    public void testSetReturnDateExceptionZero() {
        Date returnDate = new Date(0);
        assertThrows(IllegalArgumentException.class, () -> transaction1.setReturnDate(returnDate));
    }

    @Test
    public void testExtendedDueDateException() {
        assertThrows(IllegalArgumentException.class, () -> transaction1.extendDueDate(0));
    }
}
