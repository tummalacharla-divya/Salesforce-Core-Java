/*
Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order. The elements in the left half should be 
completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
*/
import java.util.Arrays;
class AlphabeticalOrder{
	public static void main(String[] args){
		String[] arr={"divya","mounika","ajay","hansi","vijaY"};
		Arrays.sort(arr);
		String[] res=halfArrToUppercase(arr);
		System.out.println(Arrays.toString(res));
	}
	public static String[] halfArrToUppercase(String[] arr){
		int lefthalf=0;
		if(arr.length%2==0){
			lefthalf=arr.length/2;
		}
		else{
			lefthalf=arr.length/2+1;
		}
		
		for(int i=0;i<lefthalf;i++){
			arr[i]=arr[i].toUpperCase();
		}
		for(int i=lefthalf;i<arr.length;i++){
			arr[i]=arr[i].toLowerCase();
		}
		return arr;
	}
}