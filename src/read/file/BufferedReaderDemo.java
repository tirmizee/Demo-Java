package read.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	//166311700
	//172290000
	//15560900
	//4885100
	
	public static void main(String[] args) throws IOException {
		
		long st = System.nanoTime();
	
		
		File file = new File("D:\\ftp\\uploads\\11111111.txt"); 
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file)); 
		  
		String temp = ""; 
		bufferedReader.lines().parallel().forEach(line ->{});
//		while ((temp = bufferedReader.readLine()) != null) {
//		} 
		
		System.out.println(System.nanoTime() - st);
		
	}

}
