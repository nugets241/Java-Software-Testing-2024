import java.io.*;
import java.nio.file.*;

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class FileOperations {

    /**
     * Reads a file.
     *
     * @param filePath The path of the file.
     * @return The content of the file.
     * @throws IOException if an I/O error occurs.
     */
    public String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    /**
     * Writes to a file.
     *
     * @param filePath The path of the file.
     * @param content The content to be written.
     * @throws IOException if an I/O error occurs.
     */
    public void writeToFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }

    /**
     * Appends to a file.
     *
     * @param filePath The path of the file.
     * @param content The content to be appended.
     * @throws IOException if an I/O error occurs.
     */
    public void appendToFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.APPEND);
    }

    /**
     * Deletes a file.
     *
     * @param filePath The path of the file.
     * @throws IOException if an I/O error occurs.
     */
    public void deleteFile(String filePath) throws IOException {
        Files.delete(Paths.get(filePath));
    }

    /**
     * Renames a file.
     *
     * @param oldFilePath The old path of the file.
     * @param newFilePath The new path of the file.
     * @throws IOException if an I/O error occurs.
     */
    public void renameFile(String oldFilePath, String newFilePath) throws IOException {
        Files.move(Paths.get(oldFilePath), Paths.get(newFilePath), StandardCopyOption.REPLACE_EXISTING);
    }
}
