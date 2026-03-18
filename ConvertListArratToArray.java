//Java Program to Convert a List to Array and Vice Versa

import java.util.ArrayList;
import java.util.Arrays;
class ConvertListArratToArray{
	public static void main(String[] args){
		ArrayList<String> languages=new ArrayList<>();
		languages.add("java");
		languages.add("python");
		languages.add("c");
		
		String[] str=new String[languages.size()];
		languages.toArray(str);
		System.out.println(Arrays.toString(str));
	}
}