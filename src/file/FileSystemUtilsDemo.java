package file;

import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;

public class FileSystemUtilsDemo {

	public static void main(String[] args) {
		try {

			System.out.println("Free Space " + FileSystemUtils.freeSpaceKb("C:/") + " Bytes");
	        
	      } catch(IOException e) {
	         System.out.println(e.getMessage());
	      }
	}

}
