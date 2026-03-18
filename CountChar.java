//Exercise 4: Create a method that accepts a character array and count the number of times each character is present in the array.
import java.util.Map;
import java.util.TreeMap;
class CountChar{
	public static void main(String[] args){
		char[] c={'a','g','a','d','g','d','s'};
		Map<Character,Integer> map=countChar(c);
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static Map<Character, Integer> countChar(char[] c){
		Map<Character,Integer> m=new TreeMap<>();
		for(char ch:c){
			if(m.containsKey(ch)){
				m.put(ch,m.get(ch)+1);
			}
			else{
				m.put(ch,1);
			}
		}
		return m;
	}
}