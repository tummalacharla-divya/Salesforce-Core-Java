//Java Program to Join Two Lists

//Example 1: Join Two Lists using addAll()
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class JoinTeoLists{
	public static void main(String[] args){
		List<String> list1=new ArrayList<String>(Arrays.asList("apple","banana"));
		List<String> list2=new ArrayList<String>(Arrays.asList("orange"));
		List<String> join=new ArrayList<String>();
		
		join.addAll(list1);
		join.addAll(list2);
		
		System.out.println(join);
	}
}
		