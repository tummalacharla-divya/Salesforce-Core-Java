/*
Exercise 3: Create a method which accepts a hash map and return the values of the map in sorted order as a List.
Method Name
getValues

Method Description
Get the values of a map in sorted order

Argument
HashMap

Return Type
List

Logic
Return the values of a hash map in sorted order 
*/
import java.util.*;
class ReturnValuesOfMap{
	public static void main(String[] args){
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1,435);
		map.put(2,381);
		map.put(3,892);
		map.put(4,7293);
		
		List<Integer> list=getValues(map);
		System.out.println("map values in sorted order are: "+list);
		
	}
	public static List<Integer> getValues(HashMap<Integer,Integer> map){
		List<Integer> values=new ArrayList<>(map.values());
		Collections.sort(values);
		return values;
	}
}