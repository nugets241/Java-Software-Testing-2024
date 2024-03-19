import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    private Book book1, book2, book3;

    @Before
    public void setUp() {
        book1 = new Book("Title1", "Author1", "ISBN1", 2024);
        book2 = new Book("Title2", "Author2", "ISBN2", 2025);
        book3 = new Book("Title3", "Author3", "ISBN3", 2026);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Title1", book1.getTitle());
        assertEquals("Title2", book2.getTitle());
        assertEquals("Title3", book3.getTitle());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("Author1", book1.getAuthor());
        assertEquals("Author2", book2.getAuthor());
        assertEquals("Author3", book3.getAuthor());
    }

    @Test
    public void testGetISBN() {
        assertEquals("ISBN1", book1.getISBN());
        assertEquals("ISBN2", book2.getISBN());
        assertEquals("ISBN3", book3.getISBN());
    }

    @Test
    public void testGetPublicationYear() {
        assertEquals(2024, book1.getPublicationYear());
        assertEquals(2025, book2.getPublicationYear());
        assertEquals(2026, book3.getPublicationYear());
    }

    @Test
    public void testIsAvailable() {
        assertTrue(book1.isAvailable());
        assertTrue(book2.isAvailable());
        assertTrue(book3.isAvailable());
    }
}
