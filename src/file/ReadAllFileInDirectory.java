package file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAllFileInDirectory {

	public static void main(String[] args) throws IOException {
		Path directoryPath = Paths.get("D:/ftp/uploads");  
		DirectoryStream<Path> directories = Files.newDirectoryStream(directoryPath);
		for(Path path : directories) {
			System.out.println(path.isAbsolute());
			System.out.println(path.getNameCount());
			System.out.println(path.getFileName());
			System.out.println(path.getParent());
			System.out.println(path.getRoot());
		}
	}

}
