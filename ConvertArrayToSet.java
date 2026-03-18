//Example 1: Convert Array to Set
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class ConvertArrayToSet{
	public static void main(String[] args){
		String[] arr={"1","2","2","3"};
		
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		//using stream
		//Set<String> set = new HashSet<>(Arrays.stream(arr).collect(Collectors.toSet()));
		System.out.println(set);
	}
}
