/*
Array Operations: Difference between X and Y
 
You have an array of N elements.
 
Find and print the difference between the Xth and Yth largest elements of the given array.
 
Input Format
The first line contains a single integer N, the size of the array.
 
The next line contains N space-separated integers i.e. array elements.
 
The next line contains two space-separated integers X and Y. 
Sample Input
3
3 1 2
1 3
 
Constraints
1 <= N <= 1000
 
1 <= X <= Y <= N
 
1 <= A[i] <= 1000
 
Output Format 
Print the required integer in a single line.
 
Sample Output
2
 
Explanation
The 1st greatest element in the array is 3 and the 3rd greatest element in the array is 1.
 
Hence, their difference is 3 - 1 = 2.
*/
import java.util.*;
class DifferencebetweenXandY{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int X=sc.nextInt();
		int Y=sc.nextInt();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int res=Math.abs(arr[n-X]-arr[n-Y]);
		System.out.println("Difference between X and Y :"+res);
		
	}
}