//Example 1: Convert Map to List
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class ConvertMapToList{
	public static void main(String[] args){
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"java");
		map.put(2,"python");
		map.put(3,"c");
		
		List<Integer> keylist=new ArrayList<>(map.keySet());
		List<String> valuelist=new ArrayList<>(map.values());
		//using streams
		//List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        //List<String> valueList = map.values().stream().collect(Collectors.toList());
		
		System.out.println("key list: "+keylist);
		System.out.println("value list: "+valuelist);
	}
}