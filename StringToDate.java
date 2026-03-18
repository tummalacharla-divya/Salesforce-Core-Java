//Example 1: Convert String to Date using predefined formatters
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class StringToDate{
	public static void main(String[] args){
		String dateString="2024-12-28";
		LocalDate date=LocalDate.parse(dateString,DateTimeFormatter.ISO_DATE);
		System.out.println(date);
	}
}