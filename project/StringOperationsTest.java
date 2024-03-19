import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringOperationsTest {
    private StringOperations stringOperations;
    private String str1, str2, str3;

    @Before
    public void setUp() {
        stringOperations = new StringOperations();

        str1 = "Hello, World!";
        str2 = "Java is fun.";
        str3 = "I love programming.";
    }

    @Test
    public void testReverseString() {
        assertEquals("!dlroW ,olleH", stringOperations.reverseString(str1));
    }

    @Test
    public void testReverseString2() {
        assertEquals(".nuf si avaJ", stringOperations.reverseString(str2));
    }

    @Test
    public void testReverseString3() {
        assertEquals(".gnimmargorp evol I", stringOperations.reverseString(str3));
    }

    @Test
    public void testConcatenateStrings() {
        assertEquals("Hello, World!Java is fun.", stringOperations.concatenateStrings(str1, str2));
    }

    @Test
    public void testConcatenateStrings2() {
        assertEquals("Java is fun.I love programming.", stringOperations.concatenateStrings(str2, str3));
    }

    @Test
    public void testConcatenateStrings3() {
        assertEquals("Hello, World!I love programming.", stringOperations.concatenateStrings(str1, str3));
    }

    @Test
    public void testFindSubstring() {
        assertTrue(stringOperations.findSubstring(str1, "World"));
        assertFalse(stringOperations.findSubstring(str1, "world"));
    }

    @Test
    public void testFindSubstring2() {
        assertTrue(stringOperations.findSubstring(str2, "Java"));
        assertFalse(stringOperations.findSubstring(str2, "Hello"));
    }

    @Test
    public void testFindSubstring3() {
        assertTrue(stringOperations.findSubstring(str3, "programming"));
        assertFalse(stringOperations.findSubstring(str3, "fun"));
    }

    @Test
    public void testReplaceSubstring() {
        assertEquals("Hello, Java!", stringOperations.replaceSubstring(str1, "World", "Java"));
    }

    @Test
    public void testReplaceSubstring2() {
        assertEquals("Java is great.", stringOperations.replaceSubstring(str2, "fun", "great"));
    }

    @Test
    public void testReplaceSubstring3() {
        assertEquals("I love Java is fun.", stringOperations.replaceSubstring(str3, "programming", "Java is fun"));
    }

    @Test
    public void testConvertToUpperCase() {
        assertEquals("HELLO, WORLD!", stringOperations.convertToUpperCase(str1));
    }

    @Test
    public void testConvertToUpperCase2() {
        assertEquals("JAVA IS FUN.", stringOperations.convertToUpperCase(str2));
    }

    @Test
    public void testConvertToUpperCase3() {
        assertEquals("I LOVE PROGRAMMING.", stringOperations.convertToUpperCase(str3));
    }

}