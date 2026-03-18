/*
Exercise 2: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed 
number is equal to the difference between two consecutive digits in the original number. The digit in the units place can 
be left as it is.
Note: Take the absolute value of the difference. Ex: 6-8 = 2
Method Name
modifyNumber

Method Description	
Accepts a number and modify it as per the requirement

Argument
int number1

Return Type
int

Logic	
Accept a number and modify it such that the each of the digit in the newly formed number is equal to the difference between 
two consecutive digits in the original number.
For example.
Input: 45862
Output:13242
Algorithm:
 Convert number into String
 Extract each char using charAt method
 Convert char to int and find the difference
 Create new StringBuffer object and keep adding the difference
 Finally convert StringBuffer to int 
*/
import java.util.Scanner;
import java.util.*;
import java.lang.*;
class ModifyNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("modified number: "+modifyNumber(number));
	}
	public static int modifyNumber(int number1){
		StringBuffer sb=new StringBuffer();
		String s=Integer.toString(number1);
		for(int i=1;i<s.length();i++){
			sb.append(Math.abs((int)s.charAt(i-1)-(int)s.charAt(i)));
		}
		sb.append(s.charAt(s.length()-1));
		
		return Integer.parseInt(sb.toString());
	}
}

