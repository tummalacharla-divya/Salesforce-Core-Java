/*
5. Maximum Subarray
 
Problem: Given an integer array nums, find the subarray which has the largest sum and return its sum.
Example:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

class MaxSubArray{
	public static void main(String[] args){
		int[] nums={-2 ,1,-3,4,-1,2,1,-5,4};
		System.out.println("Largest sum: "+maxSubArray(nums));
	}
	public static int maxSubArray(int[] nums){
		/*int max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++){
			int sum=0;
			for(int j=i;j<nums.length;j++){
				sum+=nums[j];
				if(sum>max){
					max=sum;
				}
			}
		}
		return max;
		*/
		
		int sum=nums[0];
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(sum>=0){
				sum+=nums[i];
			}
			else{
				sum=nums[i];
			}
			if(sum>max){
				max=sum;
			}
		}
		return max;
		
	}
}