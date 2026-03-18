import java.util.*;
class LinkedHashSetDemo{
	public static void main(String[] args){
		HashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(123);
		set.add(23);
		set.add(758);
		set.add(null);
		set.add(374);
		set.add(null);
		
		System.out.println(set);
	}
}