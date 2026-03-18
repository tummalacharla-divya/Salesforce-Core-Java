import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class ListDemo{
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();
		ArrayList<String> fruits=new ArrayList(Arrays.asList("Apple","banana","mango","orange")); //we can use both ways
		//to add an object in the list use add()
		list.add("welcome");
		list.add("238");
		list.add("true");
		list.add("30.29f");
		
		//to add an object on a specific index use add(index,object) method
		
		list.add(1,"year");
		System.out.println(list);
		
		//to get an object based on index use get(int index) method.
		System.out.println("value is: "+list.get(2));
		
		//to check if the list is empty: isEmpty()
		System.out.println("Is List Empty: "+list.isEmpty());
		
		//to check if the object is available or not: contains(object)
		System.out.println("Is true available in list ?: "+list.contains(238));
		
		//for updating the value on index 2
		list.set(2,"2024");
		System.out.println(list);
		
		//to remove an object use remove(object)
		//for integer give index value or in othercase give object names(like string float etc.)
		list.remove(2);
		System.out.println("List size: "+list.size());
		
		//to make the list empty: clear() method is used
		//list.clear();
		//System.out.println("List size after clear method: "+list.size());
		
		//to add the list iinto another list use addAll(list) method
		list.addAll(fruits);
		System.out.println(list);
		
		list.removeAll(fruits);
		System.out.println(list);
		
		//sort the Array elements: sort() is used
		Collections.sort(list); //we can not sort because list contains different datatypes
		System.out.println("list after sorting: "+list);
		
		for(Object obj: list){ //if we dont know exact data type then use Object.
			System.out.println(obj);
		}
	}
}