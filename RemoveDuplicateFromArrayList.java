//Example 1: Remove duplicate elements from ArrayList using Set
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;
class RemoveDuplicateFromArrayList{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,4,3,5,2,3));
		
		//Set<Integer> set=new LinkedHashSet<>(list);
		
		Set<Integer> set=new LinkedHashSet<>();
		set.addAll(list);
		
		list.clear();
		list.addAll(set);
		//System.out.println(set);
		System.out.println(list);
	}
}

/*//Example 2: Remove duplicate elements from ArrayList using Stream
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RemoveDuplicateFromArrayList{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,4,3,5,2,3));
		
		Stream<Integer> stream=list.stream();
		stream=stream.distinct();
		list=(ArrayList<Integer>)stream.collect(Collectors.toList());
		
		System.out.println(list);
	}
}*/
