package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileDemo {

	static String path = "D:\\ftp\\\\uploads\\";
	
	private static void zipFile(String filePath) {
        try {
        	
            File file = new File(filePath);
            String zipFileName = file.getName().concat(".zip");
            FileOutputStream fos = new FileOutputStream( path + "\\" + zipFileName);
            ZipOutputStream zos = new ZipOutputStream(fos);
 
            zos.putNextEntry(new ZipEntry(file.getName()));
 
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            zos.write(bytes, 0, bytes.length);
            zos.closeEntry();
            zos.close();
            
 
        } catch (FileNotFoundException ex) {
            System.err.format("The file %s does not exist", filePath);
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        }
    }
 
    public static void main(String[] args) {
        String filePath = path+"11111111.txt";
        zipFile(filePath);
    }

}
