import org.junit.Before;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;

public class DateOperationsTest {
    private DateOperations dateOperations;
    private Date date1, date2, date3;

    @Before
    public void setUp() throws ParseException {
        dateOperations = new DateOperations();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date1 = sdf.parse("2024-03-23");
        date2 = sdf.parse("2025-05-15");
        date3 = sdf.parse("2026-04-22");
    }

    @Test
    public void testGetDay() {
        assertEquals(23, dateOperations.getDay(date1));
    }

    @Test
    public void testGetDay2() {
        assertEquals(15, dateOperations.getDay(date2));
    }

    @Test
    public void testGetDay3() {
        assertEquals(22, dateOperations.getDay(date3));
    }

    @Test
    public void testGetMonth() {
        assertEquals(3, dateOperations.getMonth(date1));
    }

    @Test
    public void testGetMonth2() {
        assertEquals(5, dateOperations.getMonth(date2));
    }

    @Test
    public void testGetMonth3() {
        assertEquals(4, dateOperations.getMonth(date3));
    }

    @Test
    public void testGetYear() {
        assertEquals(2024, dateOperations.getYear(date1));
    }

    @Test
    public void testGetYear2() {
        assertEquals(2025, dateOperations.getYear(date2));
    }

    @Test
    public void testGetYear3() {
        assertEquals(2026, dateOperations.getYear(date3));
    }

    @Test
    public void testIsLeapYear() {
        assertTrue(dateOperations.isLeapYear(dateOperations.getYear(date1)));
    }

    @Test
    public void testIsLeapYear2() {
        assertFalse(dateOperations.isLeapYear(dateOperations.getYear(date2)));
    }

    @Test
    public void testIsLeapYear3() {
        assertFalse(dateOperations.isLeapYear(dateOperations.getYear(date3)));
    }

    @Test
    public void testCalculateDaysBetween() {
        assertEquals(417, dateOperations.calculateDaysBetween(date1, date2));
    }

    @Test
    public void testCalculateDaysBetween2() {
        assertEquals(342, dateOperations.calculateDaysBetween(date2, date3));
    }

    @Test
    public void testCalculateDaysBetween3() {
        assertEquals(759, dateOperations.calculateDaysBetween(date1, date3));
    }

    @Test
    public void testGetDayException() {
        assertThrows(IllegalArgumentException.class, () -> dateOperations.getDay(null));
    }

    @Test
    public void testGetMonthException() {
        assertThrows(IllegalArgumentException.class, () -> dateOperations.getMonth(null));
    }

    @Test
    public void testGetYearException() {
        assertThrows(IllegalArgumentException.class, () -> dateOperations.getYear(null));
    }

    @Test
    public void testIsLeapYearException() {
        assertThrows(IllegalArgumentException.class, () -> dateOperations.isLeapYear(0));
    }

    @Test
    public void testCalculateDaysBetweenException() {
        assertThrows(IllegalArgumentException.class, () -> dateOperations.calculateDaysBetween(null, date2));
    }
}