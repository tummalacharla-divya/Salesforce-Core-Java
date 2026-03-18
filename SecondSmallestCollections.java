/*
Exercise 5: Create a method which accepts an array of integer elements and return the second smallest element in the array
Method Name
getSecondSmallest

Method Description 
Get the second smallest element in the array

Argument
int[]

Return Type
int

Logic	
Sort the array and return the second smallest element in the array Hint: 1. Convert to Array List 2. Use sort method in Collections class 
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class SecondSmallestCollections{
	public static void main(String[] args){
		int[] arr={3,2,5,4,6};
		System.out.println("second smallest: "+getSecondSmallest(arr));
	}
	public static int getSecondSmallest(int[] arr){
		List<Integer> list=new ArrayList<>();
		for(int i:arr){
			list.add(i);
		}
		Collections.sort(list);
		return list.get(1);
	}
}