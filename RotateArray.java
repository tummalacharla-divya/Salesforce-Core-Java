/*1. Array Rotation
 
Problem: Given an integer array, rotate the array to the right by k steps, where k is non-negative.
Example:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4] 
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
import java.util.*;
class RotateArray{
	public static void main(String[] args){
		int[] nums={1,2,3,4,5,6,7};
		int k=3;
		System.out.println(Arrays.toString(rotateArray(nums,k)));
	}
	public static int[] rotateArray(int[] nums,int k){
		rotate(nums,0,nums.length-1);
		rotate(nums,0,k-1);
		rotate(nums,k,nums.length-1);
		return nums;
	}
	public static void rotate(int[] nums,int start,int end){
		while(start<end){
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	
}