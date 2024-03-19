import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryManagementTest {
    private LibraryManagement libraryManagement;
    private User user1, user2, user3;
    private Book book1, book2, book3;

    @Before
    public void setUp() {
        libraryManagement = new LibraryManagement();

        user1 = new User("User1", "user1@email.com");
        user2 = new User("User2", "user2@email.com");
        user3 = new User("User3", "user3@email.com");

        book1 = new Book("Title1", "Author1", "ISBN1", 2024);
        book2 = new Book("Title2", "Author2", "ISBN2", 2025);
        book3 = new Book("Title3", "Author3", "ISBN3", 2026);
    }

    @Test
    public void testRegisterUser1() {
        libraryManagement.registerUser(user1);
        assertEquals(user1, libraryManagement.findUserByName("User1"));
    }

    @Test
    public void testRegisterUser2() {
        libraryManagement.registerUser(user2);
        assertEquals(user2, libraryManagement.findUserByName("User2"));
    }

    @Test
    public void testRegisterUser3() {
        libraryManagement.registerUser(user3);
        assertEquals(user3, libraryManagement.findUserByName("User3"));
    }

    @Test
    public void testRemoveUser1() {
        libraryManagement.registerUser(user1);
        libraryManagement.removeUser(user1);
        assertNull(libraryManagement.findUserByName("User1"));
    }

    @Test
    public void testRemoveUser2() {
        libraryManagement.registerUser(user2);
        libraryManagement.removeUser(user2);
        assertNull(libraryManagement.findUserByName("User2"));
    }

    @Test
    public void testRemoveUser3() {
        libraryManagement.registerUser(user3);
        libraryManagement.removeUser(user3);
        assertNull(libraryManagement.findUserByName("User3"));
    }

    @Test
    public void testFindUserByName1() {
        libraryManagement.registerUser(user1);
        assertEquals(user1, libraryManagement.findUserByName("User1"));
        assertNull(libraryManagement.findUserByName("Nonexistent User"));
    }

    @Test
    public void testFindUserByName2() {
        libraryManagement.registerUser(user2);
        assertEquals(user2, libraryManagement.findUserByName("User2"));
        assertNull(libraryManagement.findUserByName("Nonexistent User"));
    }

    @Test
    public void testFindUserByName3() {
        libraryManagement.registerUser(user3);
        assertEquals(user3, libraryManagement.findUserByName("User3"));
        assertNull(libraryManagement.findUserByName("Nonexistent User"));
    }

    @Test
    public void testFindUserByEmail1() {
        libraryManagement.registerUser(user1);
        assertEquals(user1, libraryManagement.findUserByEmail("user1@email.com"));
        assertNull(libraryManagement.findUserByEmail("nonexistent@email.com"));
    }

    @Test
    public void testFindUserByEmail2() {
        libraryManagement.registerUser(user2);
        assertEquals(user2, libraryManagement.findUserByEmail("user2@email.com"));
        assertNull(libraryManagement.findUserByEmail("nonexistent@email.com"));
    }

    @Test
    public void testFindUserByEmail3() {
        libraryManagement.registerUser(user3);
        assertEquals(user3, libraryManagement.findUserByEmail("user3@email.com"));
        assertNull(libraryManagement.findUserByEmail("nonexistent@email.com"));
    }

    @Test
    public void testGetAllTransactions1() {
        assertTrue(libraryManagement.getAllTransactions().isEmpty());
    }

    @Test
    public void testGetAllTransactions2() {
        Transaction transaction1 = new Transaction(user1, book1);
        libraryManagement.getAllTransactions().add(transaction1);
        assertEquals(1, libraryManagement.getAllTransactions().size());
        assertTrue(libraryManagement.getAllTransactions().contains(transaction1));
    }

    @Test
    public void testGetAllTransactions3() {
        Transaction transaction1 = new Transaction(user1, book1);
        Transaction transaction2 = new Transaction(user2, book2);
        Transaction transaction3 = new Transaction(user3, book3);
        libraryManagement.getAllTransactions().add(transaction1);
        libraryManagement.getAllTransactions().add(transaction2);
        libraryManagement.getAllTransactions().add(transaction3);
        assertEquals(3, libraryManagement.getAllTransactions().size());
        assertTrue(libraryManagement.getAllTransactions().contains(transaction1));
        assertTrue(libraryManagement.getAllTransactions().contains(transaction2));
        assertTrue(libraryManagement.getAllTransactions().contains(transaction3));
    }
}
