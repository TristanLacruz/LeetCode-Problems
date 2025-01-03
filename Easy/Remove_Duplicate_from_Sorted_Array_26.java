//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=array

public class Remove_Duplicate_from_Sorted_Array_26 {

	public static void main(String[] args) {
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int result = removeDuplicates(nums);
		System.out.println(result);
	}

	public static int removeDuplicates(int[] nums) {
		int writeIndex = 1;
		for(int readIndex = 1; readIndex < nums.length; readIndex++) {
			if(nums[readIndex] != nums[readIndex - 1]) {
				nums[writeIndex] = nums[readIndex]; 
				writeIndex++;
			}
		}
		return writeIndex;
	}
}
