// write a program to sort a hashMap by its values.
//input : {a:3,b:1,c:2}
//output : {b=1,c=2,a=3}
import java.util.*;
class SortHashMap{
	public static void main(String[] args){
		Map<String,Integer> map=new HashMap<>();
		map.put("a",3);
		map.put("b",1);
		map.put("c",2);
		
		List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		LinkedHashMap<String,Integer> lmap=new LinkedHashMap<>();
		for(Map.Entry<String,Integer> entry:list){
			lmap.put(entry.getKey(),entry.getValue());
		}
		System.out.println("Sorted map: "+lmap);
	}
}