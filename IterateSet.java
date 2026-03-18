//Example 1: Iterate through Set using the forEach loop
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
class IterateSet{
	public static void main(String[] args){
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(4);
		set.add(2);
		set.add(4);
		
		System.out.println("Iterate through Set using the forEach loop");
		for(int i:set){
			System.out.print(i+" ");
		}
		
		//Example 2: Iterate through Set using iterator()
		System.out.println("Iterate through Set using iterator()");
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		//Example 3: Iterate through Set using forEach() method
		System.out.println("Iterate through Set using forEach() method");
		set.forEach((e)->System.out.print(e+" "));
	}
}