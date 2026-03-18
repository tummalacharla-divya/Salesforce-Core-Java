//Example 3: Convert Set to Array

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
class ConvertSetToArray{
	public static void main(String[] args){
		Set<String> s=new HashSet<>();
		s.add("1");
		s.add("2");
		
		String[] arr=new String[s.size()];
		s.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}