package date;

import java.util.Date;

import org.apache.commons.lang3.time.FastDateFormat;

public class FastDateFormatDemo {

	public static final FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd/MM/yyyy");
	
	public static void main(String[] args) {
		System.out.println(fastDateFormat.format(new Date()));
	}

}
