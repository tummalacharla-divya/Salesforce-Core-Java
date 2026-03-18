/*
Exercise : Create a method which accepts an integer array and removes all the duplicates in the array. Return the 
resulting array in descending order
Method Name
modifyArray

Method Description
Remove duplicates

Argument
int []

Return Type	
int []

Logic	
Remove the duplicate elements in the array and sort it in descending order 
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
class ReverseArray{
	public static void main(String[] args){
		int[] arr={7,2,3,6,4,2,3,8,5,4};
		
		int[] res=modifyArray(arr);
		System.out.println(Arrays.toString(res));
		
	}
	public static int[] modifyArray(int[] arr){
		HashSet<Integer> set=new HashSet<>();
		for(int i:arr){
			set.add(i);
		}
		
		int[] resArr=new int[set.size()];
		int c=0;
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){
			resArr[c++]=it.next();
		}
		
		Arrays.sort(resArr);
		int left=0;
		int right=resArr.length-1;
		while(left<right){
			int temp=resArr[left];
			resArr[left]=resArr[right];
			resArr[right]=temp;
			right--;
			left++;
		}
		
		return resArr;
	}
}