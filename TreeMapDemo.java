import java.util.*;
class TreeMapDemo{
	public static void main(String[] args){
		Map<String,Integer> fruits=new TreeMap<>();
		fruits.put("Apple",12);
		fruits.put("banana",234);
		fruits.put("Orange",849);
		fruits.put("Apple",120);
		
		

		/*Set<String> keys=fruits.keySet();
		keys.forEach(System.out::println);
		
		System.out.println("key set: "+keys);
		System.out.println(fruits);
		System.out.println(fruits.get("Apple"));
		
		for(Integer i: fruits.values()){
			System.out.print(i+" ");
		}*/
		
		for(Map.Entry<String,Integer> entry: fruits.entrySet()){
			System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
		}
		System.out.println(fruits);
	}
}