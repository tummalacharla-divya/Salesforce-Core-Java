/*
4. Contains Duplicate
 
Problem: Given an integer array nums, return true if any value appears at least twice in the array, and false if every element is distinct.
Example:
Input: nums = [1,2,3,1]
Output: true
*/

class ContainsDuplicate{
	public static void main(String[] args){
		int[] nums={1,2,3,1};
		System.out.println("given array contains duplicates?: "+containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] arr){
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==2){
				return true;
			}
		}
		return false;
		
		/*Arrays.sort(arr); 
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i+1]) {
                    return true;
                }
        }
        return false;
		*/
		
		/*
		HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            }
            map.put(arr[i],1);
        }
        return false;
		*/
		
		/*
		HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
                if (set.contains(arr[i])) {
                    return true;
                }
                set.add(arr[i]);
        }
        return false;
		*/
	}
}