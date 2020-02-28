import java.text.NumberFormat;
import java.util.Locale;

public class DemoNumberFormat {

	public static void main(String[] args) {
		
		// Currency Format
		System.out.println(NumberFormat.getCurrencyInstance().format(122222.423));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(122222.423));
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("TH","th")).format(122222.423));
		

	}

}
