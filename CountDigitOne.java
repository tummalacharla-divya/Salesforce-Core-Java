/*
Given an integer N, find the total number of times the digit "1" appears in all non-negative integers less than or equal to N.
 
Function Description
In the provided code snippet, implement the provided countDigitOne(...) method using the variables to print the total number of times the digit 1 
appears in all non-negative integers less than or equal to N.   
 
If the Number N entered by the User is a Negative(<0) and greater than 100, then it will throw a custom exception "NumberIsNotValid" and the message 
should be displayed is "The number is Not Valid".
There will be multiple test cases running so the Input and Output should match exactly as provided.
 
 
Input Format
The first line of input contains an integer N denoting the number.
 
Sample Input
12    -- denotes N.
 
Constraints
0 <= N <=100
 
Output Format
The output contains a single integer denoting the total number of times the digit 1 appears in all non-negative integers less than or equal to N.
 
Sample Output
5
 
Explanation
The number of ones from 0 to 9 is 1 for only "1".
10 has one "1", 11 has two "1"s, 12 has one "1".
Hence, the total number of 1s appearing in all non-negative integers less than or equal to N is 5.
*/

import java.util.Scanner;
class CountDigitOne{
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			isValidNum(n);
			countDigitOne(n);
		}catch(NumberIsNotValid e){
			System.out.println(e.getMessage());
		}
		
	}
	public static boolean isValidNum(int n) throws NumberIsNotValid{
			if(n<0 || n>100){
				throw new NumberIsNotValid("The number is Not Valid");
			}
			return true;
		
	}
	public static void countDigitOne(int num){
		int count=0;
		for(int i=0;i<=num;i++){
			count+=countOne(i);
		}
		System.out.println(count);
	}
	public static int countOne(int n){
		int countone=0;
		while(n!=0){
			int rem=n%10;
			if(rem==1)
				countone+=1;
			n/=10;
		}
		return countone;
	}
}
class NumberIsNotValid extends Exception{
	public NumberIsNotValid(String msg){
		super(msg);
	}
}