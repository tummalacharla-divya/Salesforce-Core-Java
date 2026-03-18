/*
2. Two Sum
 
Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
import java.util.Arrays;
class TwoSum{
	public static void main(String[] args){
		int[] nums={2,7,11,15};
		int target=9;
		int[] res=twoSum(nums,target);
		
		System.out.println(Arrays.toString(res));
	}
	public static int[] twoSum(int[] arr,int target){
		//int[] res=new int[2];
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==target){
					/*res[0]=i;
					res[1]=j;
					*/
					return new int[]{i,j};
				}
			}
		}
		return new int[]{};
	}
	
	/*public static int[] findTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }*/
}