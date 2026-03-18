/*
Exercise 4: Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
Method Name	
getSquares

Method Description	
Accepts a list of numbers and return their squares

Argument	
int[]

Return Type
Map

Logic	
Iterate through the list, find the square of each
number and add the elements to a map object
with the number as the key and the square as the value
*/
import java.util.Map;
import java.util.HashMap;
class SquaresToHashMap{
	public static void main(String[] args){
		int[] arr={3,2,5,4,6};
		Map<Integer,Integer> map=getSquares(arr);
		System.out.println("numbers and squares of numbers in an array are: "+map);
	}
	
	public static Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr){
			map.put(i,i*i);
		}
		return map;
	}
}