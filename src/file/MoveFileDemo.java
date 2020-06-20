package file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFileDemo {

	public static void main(String[] args) {
		
		Path sourceFilePath = Paths.get("./foo.txt");
        Path targetFilePath = Paths.get(System.getProperty("user.home") + "/Desktop/foo.txt");

        try {
            Files.move(sourceFilePath, targetFilePath);
        } catch (FileAlreadyExistsException ex) {
            System.out.println("Target file already exists");
        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }
	}

}
