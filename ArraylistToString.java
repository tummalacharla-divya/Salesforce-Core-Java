//Example 1: Convert the Arraylist into a String
import java.util.ArrayList;
class ArraylistToString{
	public static void main(String[] args){
		ArrayList<String> arr=new ArrayList<>();
		arr.add("java");
		arr.add("python");
		arr.add("c");
		
		//String str=arr.toString();
		
		//Example 2: Convert ArrayList to String Using join()
		String str=String.join(", ",arr);
		System.out.println(str);
	}
}