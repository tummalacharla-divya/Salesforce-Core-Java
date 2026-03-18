//Example 1: Check subset of a Set using HashSet class
import java.util.*;
class SubsetOfSet{
	public static void main(String[] args){
		Set<Integer> set1=new HashSet<>(Arrays.asList(1,4,2,3,6,3));
		
		Set<Integer> set2=new HashSet<>(Arrays.asList(4,3,6));
		
		boolean res=set1.containsAll(set2);
		System.out.println("Set contains sub set? "+res);
	}
}