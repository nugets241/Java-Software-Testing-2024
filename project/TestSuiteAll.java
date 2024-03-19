import java.sql.Date;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
        BookTest.class,
        UserTest.class,
        LibraryTest.class,
        TransactionTest.class,
        LibraryManagementTest.class,
        CalculatorTest.class,
        ArrayOperationsTest.class,
        StringOperationsTest.class,
        DateOperationsTest.class,
        FileOperationsTest.class

})

public class TestSuiteAll {
}