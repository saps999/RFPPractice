import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFileOperationsExample {
    public static void main(String[] args) {
        // Create a new file
        String fileName = "new_file.txt";
        Path path = Paths.get(fileName);
        try {
            Files.createFile(path);
        } catch (IOException e) {
            System.out.println("Error creating file: " + fileName);
            e.printStackTrace();
        }

        // Create a new directory
        String dirName = "new_dir";
        path = Paths.get(dirName);
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            System.out.println("Error creating directory: " + dirName);
            e.printStackTrace();
        }

        // Check if a file or directory exists
        fileName = "new_file.txt";
        path = Paths.get(fileName);
        System.out.println("Does file exist: " + Files.exists(path));

        dirName = "new_dir";
        path = Paths.get(dirName);
        System.out.println("Does directory exist: " + Files.exists(path));

        // Copy a file
        String sourceFile = "source.txt";
        String targetFile = "target.txt";
        try {
            Files.copy(Paths.get(sourceFile), Paths.get(targetFile));
        } catch (IOException e) {
            System.out.println("Error copying file: " + sourceFile);
            e.printStackTrace();
        }

        // Move a file
        sourceFile = "source.txt";
        targetFile = "target.txt";
        try {
            Files.move(Paths.get(sourceFile), Paths.get(targetFile));
        } catch (IOException e) {
            System.out.println("Error moving file: " + sourceFile);
            e.printStackTrace();
        }

        // Delete a file
        fileName = "new_file.txt";
        path = Paths.get(fileName);
        try {
            Files.delete(path);
        } catch (IOException e) {
            System.out.println("Error deleting file: " + fileName);
            e.printStackTrace();
        }

        // Read the contents of a file
        fileName = "file.txt";
        path = Paths.get(fileName);
        try {
            byte[] contents = Files.readAllBytes(path);
            System.out.println("File contents: " + new String(contents));
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
            e.printStackTrace();
        }

        // Write to a file
        fileName = "output.txt";
        path = Paths.get(fileName);
        String content = "This is some content to write to the file.";
        try {
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
            e.printStackTrace();
        }

        // Append to a file
        fileName = "output.txt";
        path = Paths.get(fileName);
        content = "This is more content to append to the file.";
        try {
            Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error appending to file: " + fileName);
            e.printStackTrace();
        }
    }
}
