//Example 1: Convert char to String
import java.util.Arrays;
class ConvertCharToString{
	/*public static void main(String[] args){
		char c='c';
		//String s=Character.toString(c); //using Character classes toString() method
		
		String s=String.valueOf(c); //using String classes valueOf() method
		System.out.println("the String is: "+s);
	}*/
	/*//Example 2: Convert char array to String
	public static void main(String[] args){
		char[] c={'d','g','e','s'};
		String s=String.valueOf(c);
		String s1=new String(c);
		System.out.println("the String is: "+s);
		System.out.println("the String using new keyword is: "+s1);
	}*/
	
	//Example 3: Convert String to char array
	public static void main(String[] args){
		String str="this is type casting";
		char[] c=str.toCharArray(); //it is not possible to convert to char.
		System.out.println("Character array is: "+Arrays.toString(c));
	}
}