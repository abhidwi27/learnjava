import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String num = "12334343433";	
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		
		currency.setMaximumFractionDigits(0);
		String format =  currency.format(new BigInteger(num));
		
		System.out.println("Formatted String is " + format);
	}

}
