import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;
    private Book book1, book2, book3;

    @Before
    public void setUp() {
        library = new Library();

        book1 = new Book("Title1", "Author1", "ISBN1", 2024);
        book2 = new Book("Title2", "Author2", "ISBN2", 2003);
        book3 = new Book("Title3", "Author3", "ISBN3", 1997);
    }

    @Test
    public void testAddBook1() {
        library.addBook(book1);
        assertEquals(book1, library.findBookByTitle("Title1"));
    }

    @Test
    public void testAddBook2() {
        library.addBook(book2);
        assertEquals(book2, library.findBookByTitle("Title2"));
    }

    @Test
    public void testAddBook3() {
        library.addBook(book3);
        assertEquals(book3, library.findBookByTitle("Title3"));
    }

    @Test
    public void testRemoveBook1() {
        library.addBook(book1);
        library.removeBook(book1);
        assertNull(library.findBookByTitle("Title1"));
    }

    @Test
    public void testRemoveBook2() {
        library.addBook(book2);
        library.removeBook(book2);
        assertNull(library.findBookByTitle("Title2"));
    }

    @Test
    public void testRemoveBook3() {
        library.addBook(book3);
        library.removeBook(book3);
        assertNull(library.findBookByTitle("Title3"));
    }

    @Test
    public void testFindBookByTitle1() {
        library.addBook(book1);
        assertEquals(book1, library.findBookByTitle("Title1"));
        assertNull(library.findBookByTitle("Nonexistent Title"));
    }

    @Test
    public void testFindBookByTitle2() {
        library.addBook(book2);
        assertEquals(book2, library.findBookByTitle("Title2"));
        assertNull(library.findBookByTitle("Nonexistent Title"));
    }

    @Test
    public void testFindBookByTitle3() {
        library.addBook(book3);
        assertEquals(book3, library.findBookByTitle("Title3"));
        assertNull(library.findBookByTitle("Nonexistent Title"));
    }

    @Test
    public void testFindBookByAuthor1() {
        library.addBook(book1);
        assertEquals(book1, library.findBookByAuthor("Author1"));
        assertNull(library.findBookByAuthor("Nonexistent Author"));
    }

    @Test
    public void testFindBookByAuthor2() {
        library.addBook(book2);
        assertEquals(book2, library.findBookByAuthor("Author2"));
        assertNull(library.findBookByAuthor("Nonexistent Author"));
    }

    @Test
    public void testFindBookByAuthor3() {
        library.addBook(book3);
        assertEquals(book3, library.findBookByAuthor("Author3"));
        assertNull(library.findBookByAuthor("Nonexistent Author"));
    }

    @Test
    public void testFindBookByISBN1() {
        library.addBook(book1);
        assertEquals(book1, library.findBookByISBN("ISBN1"));
        assertNull(library.findBookByISBN("Nonexistent ISBN"));
    }

    @Test
    public void testFindBookByISBN2() {
        library.addBook(book2);
        assertEquals(book2, library.findBookByISBN("ISBN2"));
        assertNull(library.findBookByISBN("Nonexistent ISBN"));
    }

    @Test
    public void testFindBookByISBN3() {
        library.addBook(book3);
        assertEquals(book3, library.findBookByISBN("ISBN3"));
        assertNull(library.findBookByISBN("Nonexistent ISBN"));
    }

    @Test
    public void testAddBookException() {
        assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }

    @Test
    public void testRemoveBookException() {
        assertThrows(IllegalArgumentException.class, () -> library.removeBook(null));
    }

    @Test
    public void testFindBookByTitleException() {
        assertThrows(IllegalArgumentException.class, () -> library.findBookByTitle(""));
    }

    @Test
    public void testFindBookByAuthorException() {
        assertThrows(IllegalArgumentException.class, () -> library.findBookByAuthor(""));
    }

    @Test
    public void testFindBookByISBNException() {
        assertThrows(IllegalArgumentException.class, () -> library.findBookByISBN(null));
    }
}
