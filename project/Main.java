import java.util.Date;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version 2024.03.18 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class Main {

    /**
     * Demonstrates the functionality of all your classes.
     *
     * @param args The command-line arguments passed to the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Create instances of all classes
        Book book = new Book("Title", "Author", "ISBN", 2024);
        User user = new User("User", "user@email.com");
        Library library = new Library();
        Transaction transaction = new Transaction(user, book);
        LibraryManagement libraryManagement = new LibraryManagement();
        Calculator calculator = new Calculator();
        ArrayOperations arrayOperations = new ArrayOperations();
        StringOperations stringOperations = new StringOperations();
        DateOperations dateOperations = new DateOperations();
        FileOperations fileOperations = new FileOperations();

        // Demonstrate Book
        System.out.println("Book:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Publication Year: " + book.getPublicationYear());
        System.out.println("Is Available: " + book.isAvailable());
        System.out.println();

        // Demonstrate User
        System.out.println("User:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Borrowed Books: " + user.getBorrowedBooks());
        user.borrowBook(book);
        System.out.println("Borrowed Books After Borrowing: " + user.getBorrowedBooks());
        user.returnBook(book);
        System.out.println("Borrowed Books After Returning: " + user.getBorrowedBooks());
        System.out.println();

        // Demonstrate Library
        System.out.println("Library:");
        library.addBook(book);
        System.out.println("Book Available After Adding: " + library.findBookByTitle("Title"));
        library.removeBook(book);
        System.out.println("Book Available After Removing: " + library.findBookByTitle("Title"));
        System.out.println();

        // Demonstrate Transaction
        System.out.println("Transaction:");
        System.out.println("User: " + transaction.getUser());
        System.out.println("Book: " + transaction.getBook());
        System.out.println("Borrow Date: " + transaction.getBorrowDate());
        System.out.println("Return Date: " + transaction.getReturnDate());
        System.out.println("Is Returned: " + transaction.isReturned());
        System.out.println();

        // Demonstrate LibraryManagement
        System.out.println("LibraryManagement:");
        libraryManagement.registerUser(user);
        System.out.println("User Found By Name: " + libraryManagement.findUserByName("User"));
        libraryManagement.removeUser(user);
        System.out.println("User Found By Name After Removing: " + libraryManagement.findUserByName("User"));
        System.out.println();

        // Demonstrate Calculator
        System.out.println("Calculator:");
        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
        System.out.println("5 * 3 = " + calculator.multiply(5, 3));
        System.out.println("5 / 3 = " + calculator.divide(5, 3));
        System.out.println("5 % 3 = " + calculator.modulus(5, 3));
        System.out.println();

        // Demonstrate ArrayOperations
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("ArrayOperations:");
        System.out.println("Max: " + arrayOperations.findMax(array));
        System.out.println("Min: " + arrayOperations.findMin(array));
        System.out.println("Average: " + arrayOperations.calculateAverage(array));
        System.out.println("Sorted array: " + Arrays.toString(arrayOperations.sortArray(array)));
        System.out.println("Reversed array: " + Arrays.toString(arrayOperations.reverseArray(array)));
        System.out.println();

        // Demonstrate StringOperations
        String str = "Hello, World!";
        System.out.println("StringOperations:");
        System.out.println("Reversed string: " + stringOperations.reverseString(str));
        System.out.println("Concatenated string: " + stringOperations.concatenateStrings(str, " Java is fun."));
        System.out.println("Substring found: " + stringOperations.findSubstring(str, "World"));
        System.out.println("Replaced substring: " + stringOperations.replaceSubstring(str, "World", "Java"));
        System.out.println("Upper case string: " + stringOperations.convertToUpperCase(str));
        System.out.println();

        // Demonstrate DateOperations
        Date date = new Date();
        System.out.println("DateOperations:");
        System.out.println("Day: " + dateOperations.getDay(date));
        System.out.println("Month: " + dateOperations.getMonth(date));
        System.out.println("Year: " + dateOperations.getYear(date));
        System.out.println("Is leap year: " + dateOperations.isLeapYear(dateOperations.getYear(date)));
        System.out.println("Days between: "
                + dateOperations.calculateDaysBetween(date, new Date(date.getTime() + (1000 * 60 * 60 * 24))));
        System.out.println();

        // Demonstrate FileOperations
        String filePath = "test.txt";
        System.out.println("FileOperations:");
        fileOperations.writeToFile(filePath, "Hello, World!");
        System.out.println("Read file: " + fileOperations.readFile(filePath));
        fileOperations.appendToFile(filePath, " Java is fun.");
        System.out.println("Read file: " + fileOperations.readFile(filePath));
        fileOperations.renameFile(filePath, "newTest.txt");
        System.out.println("Read file: " + fileOperations.readFile("newTest.txt"));
        fileOperations.deleteFile("newTest.txt");
    }
}

// End of file
