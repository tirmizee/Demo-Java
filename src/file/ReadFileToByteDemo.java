package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileToByteDemo {

	public static void main(String[] args) {
		try {
			int count = 0;
			byte[] data = Files.readAllBytes(Paths.get("C:\\Users\\Lenovo-User\\Downloads\\export_SentReport.csv"));
			for (byte b : data) {
				if (b == '\n') {
					count++;
				}
			}
			System.out.println(count);
		} catch (IOException ex) {
		    System.out.format("I/O error: %s%n", ex);
		}
	}

}
