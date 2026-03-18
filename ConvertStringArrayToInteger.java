/*Write a program that attempts to convert an array of String elements into an array of Integer values. Handle the NumberFormatException that occurs 
when a String element cannot be converted to an integer.
Requirements:
Create an array of String values representing numbers.
Convert each String element to an Integer.
If any element cannot be converted, catch and handle the NumberFormatException.
-----------------------------------------
Output
Array of Strings: ["10", "20", "abc", "30"]
Converting elements to integers:
Converted element 1: 10
Converted element 2: 20
Error: Invalid format for element 'abc'. Cannot convert to integer.
Converted element 3: 30
*/

import java.util.*;
class ConvertStringArrayToInteger{
	public static void main(String[] args){
		String[] str={"10", "20", "abc", "30"};
		System.out.println("Array of Strings: ");
		for(String s:str){
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("Converting elements to integers:");
		convertString(str);
	}
	public static void convertString(String[] str){
		for(int i=0;i<str.length;i++){
			try{
				int convertElement=Integer.parseInt(str[i]);
				System.out.println("Converted element "+(i+1)+":"+convertElement);
			}catch(Exception e){
				System.out.println("Error: Invalid format for element ' "+str[i]+" '. Cannot convert to integer.");
			}
		}
		
	}
	
}
