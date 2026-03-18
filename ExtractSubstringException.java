/*
Create a program that asks the user to enter a string and an index. The program should attempt to extract a substring from the string using the
 provided index. If the index is out of bounds, catch the StringIndexOutOfBoundsException.
Requirements:
Accept a string and an index from the user.
Try to extract a substring using the index.
Handle StringIndexOutOfBoundsException if the index is invalid (i.e., if it is less than 0 or greater than the length of the string).
---------------------------------------
Output:
Enter a string: HelloWorld
Enter an index: 5
Substring: World
 
Enter a string: Hello
Enter an index: 10
Error: Invalid index for substring. Index out of bounds.

*/

import java.util.Scanner;
class ExtractSubstringException{
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			int index=sc.nextInt();
			isValidIndex(index,str);
			System.out.println(str.substring(index));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
	public static boolean isValidIndex(int index, String str) throws StringIndexOutOfBoundsException{
		if(index<0 || index>str.length()){
			throw new StringIndexOutOfBoundsException("Error: Invalid index for substring. Index out of bounds.");
		}
		return true;
	}
}
class StringIndexOutOfBoundsException extends Exception{
	public StringIndexOutOfBoundsException(String msg){
		super(msg);
	}
}