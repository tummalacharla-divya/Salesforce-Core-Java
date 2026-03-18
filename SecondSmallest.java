/*
Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array
 
Method Name	
getSecondSmallest  

Method Description
Get the second smallest element in the array

Argument
int[]

Return Type	
int

Logic	
Sort the array and return the second smallest element in the array
 */
 
import java.util.Arrays;
class SecondSmallest{
	public static void main(String[] args){
		int[] arr={5,38,19,37,90,15};
		int secondSmallest=getSecondSmallest(arr);
		System.out.println("second smallest: "+secondSmallest);
	}
	public static int getSecondSmallest(int[] arr){
		Arrays.sort(arr);
		return arr[1];
	}
} 