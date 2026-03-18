/*
An array A of length N is given. We can arrange the array elements as needed.
Print the minimum cost of the array.
The cost of an array is the sum of the absolute difference of adjacent elements.
Example
A[] = {-3,2,4}
The cost of the array: abs(-3-2) + abs(2-4) = 5+2 = 7.
Note that this is not the minimum cost for this array.
Note
If the length of the array entered by the user is Zero(0) or negative, then throw a custom exception NumberIsNotValid and "The Number is not Valid" message will be displayed on the output screen.
Function Description
In the provided code snippet, implement the provided minScore(...) method to print the minimum cost of the array.
There will be multiple test cases running so the Input and Output should match exactly as provided.
Input Format
The first line contains an integer N.
The second line contains N space-separated integers.
Sample Input
5  --> Denotes N size of the array A.
-4 2 -1 0 5  --> Denotes N elements of the array A.
Constraints
1 <= N <= 20
-100 <= A[i] <= 100
Output Format
The output contains a single integer denoting the minimum cost of the array.
Sample Output
9
Explanation
Here, arranging the given array as [-4,-1,0,2,5].
abs(-4+1) + abs(-1-0) + abs(0-2) + abs(2-5) = 3+1+2+3 = 9.
Hence, the output is 9.
*/

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
class MinimumCostUsingException{
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			isValidSize(size);
			int[] arr=new int[size];
			for(int i=0;i<size;i++){
				arr[i]=sc.nextInt();
			}
		
			Arrays.sort(arr);
		
			System.out.println(minScore(arr,size));
		}catch(NumberIsNotValid e){
			System.out.println(e.getMessage());
		}
			
	}
	
	public static boolean isValidSize(int size) throws NumberIsNotValid{
			if(size<=0){
				throw new NumberIsNotValid("The Number is not Valid");
			}
			return true;
		
	}
	public static int minScore(int[] arr,int size){
		int mincost=0;
		for(int i=1;i<size;i++){
			mincost+=Math.abs(arr[i-1]-arr[i]);
		}
		return mincost;
	}
}
class NumberIsNotValid extends Exception{
	public NumberIsNotValid(String str){
		super(str);
	}
}