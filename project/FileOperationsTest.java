import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.Assert.*;

public class FileOperationsTest {
    private FileOperations fileOperations;
    private Path tempFile1, tempFile2, tempFile3;

    @Before
    public void setUp() throws IOException {
        fileOperations = new FileOperations();

        tempFile1 = Files.createTempFile("temp1", ".txt");
        tempFile2 = Files.createTempFile("temp2", ".txt");
        tempFile3 = Files.createTempFile("temp3", ".txt");
    }

    @Test
    public void testReadFile() throws IOException {
        assertNotNull(fileOperations.readFile(tempFile1.toString()));
    }

    @Test
    public void testReadFile2() throws IOException {
        assertNotNull(fileOperations.readFile(tempFile2.toString()));
    }

    @Test
    public void testReadFile3() throws IOException {
        assertNotNull(fileOperations.readFile(tempFile3.toString()));
    }

    @Test
    public void testWrite() throws IOException {
        String content1 = "Hello, World!";

        fileOperations.writeToFile(tempFile1.toString(), content1);
        assertEquals(content1, fileOperations.readFile(tempFile1.toString()));
    }

    @Test
    public void testWrite2() throws IOException {
        String content2 = "Java is fun.";

        fileOperations.writeToFile(tempFile2.toString(), content2);
        assertEquals(content2, fileOperations.readFile(tempFile2.toString()));
    }

    @Test
    public void testWrite3() throws IOException {
        String content3 = "I love programming.";

        fileOperations.writeToFile(tempFile3.toString(), content3);
        assertEquals(content3, fileOperations.readFile(tempFile3.toString()));
    }

    @Test
    public void testAppendToFile() throws IOException {
        String content1 = "Hello, World!";
        String content2 = "Java is fun.";

        fileOperations.writeToFile(tempFile1.toString(), content1);
        fileOperations.appendToFile(tempFile1.toString(), content2);
        assertEquals(content1 + content2, fileOperations.readFile(tempFile1.toString()));
    }

    @Test
    public void testAppendToFile2() throws IOException {
        String content2 = "Java is fun.";
        String content3 = "I love programming.";

        fileOperations.writeToFile(tempFile2.toString(), content2);
        fileOperations.appendToFile(tempFile2.toString(), content3);
        assertEquals(content2 + content3, fileOperations.readFile(tempFile2.toString()));
    }

    @Test
    public void testAppendToFile3() throws IOException {
        String content1 = "Hello, World!";
        String content3 = "I love programming.";

        fileOperations.writeToFile(tempFile3.toString(), content3);
        fileOperations.appendToFile(tempFile3.toString(), content1);
        assertEquals(content3 + content1, fileOperations.readFile(tempFile3.toString()));
    }

    @Test
    public void testDeleteFile() throws IOException {
        fileOperations.deleteFile(tempFile1.toString());
        assertFalse(Files.exists(tempFile1));
    }

    @Test
    public void testDeleteFile2() throws IOException {
        fileOperations.deleteFile(tempFile2.toString());
        assertFalse(Files.exists(tempFile2));
    }

    @Test
    public void testDeleteFile3() throws IOException {
        fileOperations.deleteFile(tempFile3.toString());
        assertFalse(Files.exists(tempFile3));
    }

    @Test
    public void testRenameFile() throws IOException {
        String newFilePath1 = tempFile1.toString().replace("temp1", "new1");

        fileOperations.renameFile(tempFile1.toString(), newFilePath1);
        assertFalse(Files.exists(tempFile1));
        assertTrue(Files.exists(Path.of(newFilePath1)));
    }

    @Test
    public void testRenameFile2() throws IOException {
        String newFilePath2 = tempFile2.toString().replace("temp2", "new2");

        fileOperations.renameFile(tempFile2.toString(), newFilePath2);
        assertFalse(Files.exists(tempFile2));
        assertTrue(Files.exists(Path.of(newFilePath2)));
    }

    @Test
    public void testRenameFile3() throws IOException {
        String newFilePath3 = tempFile3.toString().replace("temp3", "new3");

        fileOperations.renameFile(tempFile3.toString(), newFilePath3);
        assertFalse(Files.exists(tempFile3));
        assertTrue(Files.exists(Path.of(newFilePath3)));
    }

    @Test
    public void testReadFileException() {
        assertThrows(IOException.class, () -> fileOperations.readFile("nonexistent.txt"));
    }

    @Test
    public void testWriteToFileException() {
        assertThrows(IOException.class, () -> fileOperations.writeToFile("", "content"));
    }

    @Test
    public void testAppendToFileException() {
        assertThrows(IOException.class, () -> fileOperations.appendToFile("", "content"));
    }

    @Test
    public void testDeleteFileException() {
        assertThrows(IOException.class, () -> fileOperations.deleteFile("nonexistent.txt"));
    }

    @Test
    public void testRenameFileException() {
        assertThrows(IOException.class, () -> fileOperations.renameFile("nonexistent.txt", "newname.txt"));
    }
}