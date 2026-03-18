//Example 1: Calculate the intersection of two sets
import java.util.*;
class IntersectionTwoSets{
	public static void main(String[] args){
		Set<Integer> set1=new HashSet<>(Arrays.asList(1,4,2,3,6,3));
		
		Set<Integer> set2=new HashSet<>(Arrays.asList(4,2,6,4,8,7));
		
		set1.retainAll(set2);
		
		System.out.println("intersection of two sets: "+set1);
		
	}
}