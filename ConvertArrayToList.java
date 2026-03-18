//Example 2: Convert Java Array to List
import java.util.ArrayList;
import java.util.Arrays;
class ConvertArrayToList{
	public static void main(String[] args){
		String[] arr={"java","python","c"};
		System.out.println("Array: "+Arrays.toString(arr));
		
		ArrayList<String> arrlist=new ArrayList<>(Arrays.asList(arr));
		System.out.println("list: "+arrlist);
	}
}