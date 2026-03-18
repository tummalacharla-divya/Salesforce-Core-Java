/*
Array Operations: Maximum Absolute Difference
You are given an array A of integers. You have to find the value of X+Y, where:
 
X is the maximum absolute difference between two even elements present in the array, and
 
Y is the maximum absolute difference between two odd elements present in the array.
 
Note
It is always guaranteed that at least two odd and two even elements will be present.
 
Input Format
The first line contains an integer N denoting the size of the array A
 
The second line contains N integers denoting the elements of array A.
 
Sample Input
7
1 3 6 8 2 6 8
 
Constraints
4<= N<=100000
 
0<=A[i]<=500
 
Output Format
The output contains a single integer denoting the value of X+Y.
 
Sample Output
8
*/
import java.util.*;
class MaxAbsoluteDiff{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				list.add(arr[i]);
			}
			else{
				list1.add(arr[i]);
			}
		}
		int eveMAX=Collections.max(list);
		int eveMin=Collections.min(list);
		int X=Math.abs(eveMAX-eveMin);
		
		int oddMAx=Collections.max(list1);
		int oddmin=Collections.min(list1);
		int Y=Math.abs(oddMAx-oddmin);
		System.out.println(X+Y);
	}
}