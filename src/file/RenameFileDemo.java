package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFileDemo {

	public static void main(String[] args) throws IOException {
		Path sourceFilePath = Paths.get("foo.txt");
		Path targetFilePath = Paths.get("bar.txt");

		Files.move(sourceFilePath, targetFilePath);

	}

}
