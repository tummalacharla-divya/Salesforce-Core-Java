//Example 2: Pass ArrayList as Function Parameter by converting into Array
import java.util.*;
class ArrayListAsFunction{
	public static void main(String[] args){
		List<Integer> list=new ArrayList<>();
		list.add(67);
		list.add(87);
		list.add(56);
		
		arrayList(list.toArray(new Integer[list.size()]));
	}
	public static void arrayList(Integer[] marks){
		int totalMarks=300;
		int obtainedMarks=0;
		for(int i:marks){
			obtainedMarks+=i;
		}
		System.out.println((obtainedMarks*100)/totalMarks);
	}
}