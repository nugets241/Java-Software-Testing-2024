import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BookTest {
    private Book book1, book2, book3;

    @Before
    public void setUp() {
        book1 = new Book("Title1", "Author1", "ISBN1", 2024);
        book2 = new Book("Title2", "Author2", "ISBN2", 1997);
        book3 = new Book("Title3", "Author3", "ISBN3", 2003);
    }

    @Test
    public void testGetTitle1() {
        assertEquals("Title1", book1.getTitle());
    }

    @Test
    public void testGetTitle2() {
        assertEquals("Title2", book2.getTitle());
    }

    @Test
    public void testGetTitle3() {
        assertEquals("Title3", book3.getTitle());
    }
    @Test
    public void testGetAuthor1() {
        assertEquals("Author1", book1.getAuthor());
    }

    @Test
    public void testGetAuthor2() {
        assertEquals("Author2", book2.getAuthor());
    }

    @Test
    public void testGetAuthor3() {
        assertEquals("Author3", book3.getAuthor());
    }

    @Test
    public void testGetISBN1() {
        assertEquals("ISBN1", book1.getISBN());
    }

    @Test
    public void testGetISBN2() {
        assertEquals("ISBN2", book2.getISBN());
    }

    @Test
    public void testGetISBN3() {
        assertEquals("ISBN3", book3.getISBN());
    }

    @Test
    public void testGetPublicationYear1() {
        assertEquals(2024, book1.getPublicationYear());
    }

    @Test
    public void testGetPublicationYear2() {
        assertEquals(1997, book2.getPublicationYear());
    }

    @Test
    public void testGetPublicationYear3() {
        assertEquals(2003, book3.getPublicationYear());
    }

    @Test
    public void testIsAvailable1() {
        assertTrue(book1.isAvailable());
    }

    @Test
    public void testIsAvailable2() {
        assertTrue(book2.isAvailable());
    }

    @Test
    public void testIsAvailable3() {
        assertTrue(book3.isAvailable());
    }

    @Test
    public void testConstructorTitleException() {
        assertThrows(IllegalArgumentException.class, () -> new Book(null, "Author", "ISBN", 2000));
    }

    @Test
    public void testConstructorAuthorException() {
        assertThrows(IllegalArgumentException.class, () -> new Book("Title", null, "ISBN", 2000));
    }

    @Test
    public void testConstructorISBNException() {
        assertThrows(IllegalArgumentException.class, () -> new Book("Title", "Author", null, 2000));
    }

    @Test
    public void testConstructorPublicationYearNegativeException() {
        assertThrows(IllegalArgumentException.class, () -> new Book("Title", "Author", "ISBN", -1));
    }

    @Test
    public void testConstructorPublicationYearFutureException() {
        assertThrows(IllegalArgumentException.class, () -> new Book("Title", "Author", "ISBN", 2030));
    }
}
