//Example 1: Calculate the union of two sets using addAll()
import java.util.*;
class UnionOfTwoSets{
	public static void main(String[] args){
		Set<Integer> set1=new HashSet<>(Arrays.asList(1,3,1,4,5));
		
		Set<Integer> set2=new HashSet<>(Arrays.asList(6,2,3,4,1));
		
		//Set<Integer> res=new HashSet<>();
		//res.addAll(set1);
		//res.addAll(set2);
		set1.addAll(set2);
		//System.out.println("union of two sets: "+res);
		System.out.println("union of two sets: "+set1);
	}
}