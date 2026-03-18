//Example 3: Convert a String to ArrayList
import java.util.ArrayList;
import java.util.Arrays;
class StringToArrayList{
	public static void main(String[] args){
		String str="java is a programming language";
		
		String[] strarr=str.split(" ");
		
		ArrayList<String> list=new ArrayList<>(Arrays.asList(strarr));
		System.out.println(list);
	}
}