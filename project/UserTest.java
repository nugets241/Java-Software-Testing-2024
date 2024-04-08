import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
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
    }

    @Test
    public void testGetName1() {
        assertEquals("User1", user1.getName());
    }

    @Test
    public void testGetName2() {
        assertEquals("User2", user2.getName());
    }

    @Test
    public void testGetName3() {
        assertEquals("User3", user3.getName());
    }

    @Test
    public void testGetEmail1() {
        assertEquals("user1@email.com", user1.getEmail());
    }

    @Test
    public void testGetEmail2() {
        assertEquals("user2@email.com", user2.getEmail());
    }

    @Test
    public void testGetEmail3() {
        assertEquals("user3@email.com", user3.getEmail());
    }

    @Test
    public void testGetBorrowedBooks1() {
        user1.borrowBook(book1);
        assertTrue(user1.getBorrowedBooks().contains(book1));
    }

    @Test
    public void testGetBorrowedBooks2() {
        user2.borrowBook(book2);
        assertTrue(user2.getBorrowedBooks().contains(book2));
    }

    @Test
    public void testGetBorrowedBooks3() {
        user3.borrowBook(book3);
        assertTrue(user3.getBorrowedBooks().contains(book3));
    }

    @Test
    public void testBorrowBook1() {
        user1.borrowBook(book1);
        assertTrue(user1.getBorrowedBooks().contains(book1));
        assertFalse(book1.isAvailable());
    }

    @Test
    public void testBorrowBook2() {
        user2.borrowBook(book2);
        assertTrue(user2.getBorrowedBooks().contains(book2));
        assertFalse(book2.isAvailable());
    }

    @Test
    public void testBorrowBook3() {
        user3.borrowBook(book3);
        assertTrue(user3.getBorrowedBooks().contains(book3));
        assertFalse(book3.isAvailable());
    }

    @Test
    public void testReturnBook1() {
        user1.borrowBook(book1);
        user1.returnBook(book1);
        assertFalse(user1.getBorrowedBooks().contains(book1));
        assertTrue(book1.isAvailable());
    }

    @Test
    public void testReturnBook2() {
        user2.borrowBook(book2);
        user2.returnBook(book2);
        assertFalse(user2.getBorrowedBooks().contains(book2));
        assertTrue(book2.isAvailable());
    }

    @Test
    public void testReturnBook3() {
        user3.borrowBook(book3);
        user3.returnBook(book3);
        assertFalse(user3.getBorrowedBooks().contains(book3));
        assertTrue(book3.isAvailable());
    }

    @Test
    public void testConstructorAuthorException() {
        assertThrows(IllegalArgumentException.class, () -> new User(null, "email"));
    }

    @Test
    public void testConstructorEmailException() {
        assertThrows(IllegalArgumentException.class, () -> new User("name", null));
    }

    @Test
    public void testBorrowBookException() {
        assertThrows(IllegalArgumentException.class, () -> user1.borrowBook(null));
    }

    @Test
    public void testReturnBookException() {
        assertThrows(IllegalArgumentException.class, () -> user1.returnBook(null));
    }

    @Test
    public void testBorrowBookExceptionUnavailable() {
        user1.borrowBook(book1);
        assertThrows(IllegalStateException.class, () -> user2.borrowBook(book1));
    }
}
