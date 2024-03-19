import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOperationsTest {
    private ArrayOperations arrayOperations;
    private int[] array1, array2, array3;

    @Before
    public void setUp() {
        arrayOperations = new ArrayOperations();

        array1 = new int[] { 1, 2, 3, 4, 5 };
        array2 = new int[] { 78, 34, 12, 56, 89, 23, 9, 45, 67, 100 };
        array3 = new int[] { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
    }

    @Test
    public void testFindMax() {
        assertEquals(5, arrayOperations.findMax(array1));
    }

    @Test
    public void testFindMax2() {
        assertEquals(100, arrayOperations.findMax(array2));
    }

    @Test
    public void testFindMax3() {
        assertEquals(9, arrayOperations.findMax(array3));
    }

    @Test
    public void testFindMin() {
        assertEquals(1, arrayOperations.findMin(array1));
    }

    @Test
    public void testFindMin2() {
        assertEquals(9, arrayOperations.findMin(array2));
    }

    @Test
    public void testFindMin3() {
        assertEquals(1, arrayOperations.findMin(array3));
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(3.0, arrayOperations.calculateAverage(array1), 0.01);
    }

    @Test
    public void testCalculateAverage2() {
        assertEquals(51.3, arrayOperations.calculateAverage(array2), 0.01);
    }

    @Test
    public void testCalculateAverage3() {
        assertEquals(4.0, arrayOperations.calculateAverage(array3), 0.01);
    }

    @Test
    public void testSortArray() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, arrayOperations.sortArray(array1));
    }

    @Test
    public void testSortArray2() {
        assertArrayEquals(new int[] { 9, 12, 23, 34, 45, 56, 67, 78, 89, 100 }, arrayOperations.sortArray(array2));
    }

    @Test
    public void testSortArray3() {
        assertArrayEquals(new int[] { 1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9 }, arrayOperations.sortArray(array3));
    }

    @Test
    public void testReverseArray() {
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, arrayOperations.reverseArray(array1));
    }

    @Test
    public void testReverseArray2() {
        assertArrayEquals(new int[] { 100, 67, 45, 9, 23, 89, 56, 12, 34, 78 }, arrayOperations.reverseArray(array2));
    }

    @Test
    public void testReverseArray3() {
        assertArrayEquals(new int[] { 5, 3, 5, 6, 2, 9, 5, 1, 4, 1, 3 }, arrayOperations.reverseArray(array3));
    }
}