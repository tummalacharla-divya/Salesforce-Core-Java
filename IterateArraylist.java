//Example 1: Iterate through ArrayList using for loop
import java.util.ArrayList;
import java.util.ListIterator;
class IterateArraylist{
	public static void main(String[] args){
		ArrayList<String> arr=new ArrayList<>();
		arr.add("divya");
		arr.add("rani");
		arr.add("java");
		arr.add("python");
		
		/*System.out.println("Iterate ArrayList using for loop: ");
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}*/
		
		/*//Example 2: Iterate through ArrayList using for-each loop
		System.out.println("Iterate ArrayList using forEach loop: ");
		for(String str:arr){
			System.out.print(str+" ");
		}*/
		
		//Example 3: Iterate over ArrayList using listIterator()
		System.out.println("Iterate ArrayList using listIterator: ");
		ListIterator<String> it=arr.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
	}
}