/*
Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 
Method Name
getSorted  

Method Description
Return the resulting array after reversing the numbers and sorting it

Argument	
int []

Return Type	
int

Logic	
Accept and integer array, reverse the numbers in the array, sort it and return the resulting array.
Hint
Convert the numbers to String to reverse it
*/
import java.util.Arrays;
import java.io.*;
class ReverseNumbers{
	public static void main(String[] args){
		int[] arr={837,2893,5263,55,28,46,29};
		System.out.println(Arrays.toString(getSorted(arr)));
	}
	public static int[] getSorted(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=reverse(arr[i]);
		}
		Arrays.sort(arr);
		return arr;
	}
	public static int reverse(int n){
		/*int reverse=0;
		while(n!=0){
			int reminder=n%10;
			reverse=reverse*10+reminder;
			n/=10;
		}
		return reverse;*/
		
		/*String str=Integer.toString(n);
		String s="";
		for(int i=str.length()-1;i>0;i++){
			s+=str.charAt(i);
		}
		return Integer.parseInt(s);*/
		
		String str=Integer.toString(n);
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		return Integer.parseInt(sb.toString());
		
	}
}
