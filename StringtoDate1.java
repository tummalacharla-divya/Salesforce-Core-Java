//Example 2: Convert String to Date using pattern formatters
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
class StringtoDate1{
	public static void main(String[] args){
		String string="December 28, 2024";
		DateTimeFormatter date=DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate d=LocalDate.parse(string, date);
		
		System.out.println(d);
	}
}