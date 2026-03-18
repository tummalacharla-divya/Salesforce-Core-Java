//Example 1: Calculate the difference between two sets
import java.util.*;
class DifferenceBetweenSets{
	public static void main(String[] args){
		Set<Integer> set1=new HashSet<>(Arrays.asList(1,4,2,3,6,3));
		
		Set<Integer> set2=new HashSet<>(Arrays.asList(4,2,6,4,8,7));
		
		set1.removeAll(set2);
		
		System.out.println("Difference of two sets: "+set1);
	}
}