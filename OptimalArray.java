/*
Array Operations: Permutations of array A
You have an array A of size N.
The score of an array A is defined as the sum of multiplication of smallest prime factor (SPF) of A[i] and A[i+1] for all 1 <= i <= (N-1) 
(1-based indexing).
The formula for score is:
Σ SPF(A[i])*SPF(A[i+1]) for 1 <= i <= (N-1)
SPF of an integer X is defined as the smallest prime number that divides X.
Example: SPF(15) = 3
Find the maximum score obtained from all of the permutations of array A.
Note
All array elements are positive and greater than or equal to 2.
A permutation of array A is defined as array B formed by using the elements of array A only, but there exists a minimum of one index i 
such that A[i] != B[i].
Function Description
In the provided code snippet, implement the provided getOptimalArray(...) method using the variables to print the maximum score obtained
 from all of the permutations of array A. You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”.
There will be multiple test cases running so the Input and Output should match exactly as provided.
Input Format
The first line contains an integer N denoting the size of the array A.
The second line contains N space-separated integers denoting elements of array A.
Sample Input
3
2 4 7
Constraints
2 <= N<= 10
2 <= A[i] <= 1000000
Output Format
The output contains a single integer denoting the maximum score you can get.
Sample Output
28
Explanation
For given array A, the SPF are => 2 → 2 , 4 → 2 , 7 → 7
Possible permutations and corresponding scores are as follows:
2 4 7 2*2 + 2*7 = 18
2 7 4 2*7 + 7*2 = 28
4 2 7 2*2 + 2*7 = 18
4 7 2 2*7 + 7*2 = 28
7 2 4 2*2 + 2*7 = 18
7 4 2 2*2 + 2*7 = 18
The maximum score is: 28
*/

import java.util.*;
 
public class OptimalArray {
 
    // Function to calculate the smallest prime factor (SPF) for all numbers up to the limit
    public static int[] getSPF(int limit) {
        int[] spf = new int[limit + 1];
        for (int i = 0; i <= limit; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i <= limit; i++) {
            if (spf[i] == i) { // i is a prime
                for (int j = i * i; j <= limit; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }
 
    // Function to calculate the maximum score from all permutations
    public static int getOptimalArray(int n, int[] arr) {
        int limit = 1000000;
        int[] spf = getSPF(limit);
 
        List<int[]> permutations = new ArrayList<>();
        permute(arr, 0, permutations);
 
        int maxScore = 0;
 
        // Iterate through all permutations and calculate the score
        for (int[] perm : permutations) {
            int score = 0;
            for (int i = 0; i < n - 1; i++) {
                score += spf[perm[i]] * spf[perm[i + 1]];
            }
            maxScore = Math.max(maxScore, score);
        }
 
        return maxScore;
    }
 
    // Helper function to generate all permutations of the array
    public static void permute(int[] arr, int index, List<int[]> permutations) {
        if (index == arr.length) {
            permutations.add(arr.clone());
            return;
        }
 
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, permutations);
            swap(arr, index, i); // Backtrack
        }
    }
 
    // Helper function to swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    // Main method
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
        // Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        // Output the maximum score
        System.out.println(getOptimalArray(n, arr));
    }
}