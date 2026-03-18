//Java Program to Convert a List to Array and Vice Versa

//Example 1: Convert the Java List into Array
import java.util.ArrayList;
import java.util.Arrays;
class ListIntoArray{
	public static void main(String[] args){
		ArrayList<String> languages=new ArrayList<String>(Arrays.asList("java","python","c"));
		
		String[] arr=new String[languages.size()];
		
		languages.toArray(arr);
		
		System.out.println("Array is: ");
		for(String s:arr){
			System.out.print(s+",");
		}
	}
}