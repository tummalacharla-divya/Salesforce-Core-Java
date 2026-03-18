//Example: Convert stack trace to a string
import java.io.StringWriter;
import java.io.PrintWriter;
class PrintStackTrace{
	public static void main(String[] args){
		try{
			int division=0/0;
		}
		catch(ArithmeticException e){
			StringWriter sw=new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String s=sw.toString();
			System.out.println(s);
		}
	}
}
