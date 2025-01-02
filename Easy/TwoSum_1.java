//https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array

import java.util.Arrays;

public class TwoSum_1 {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] results = twoSum(nums, target);
		System.out.println(Arrays.toString(results));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] results = new int[2];
		for(int i = 0; i < nums.length; i++) {
			results[0] = i;
			int firstNumber = nums[i];
			for(int j = (i+1); j < nums.length; j++) {
				if(firstNumber + nums[j] == target) {
					results[1] = j;
					return results;
				}
			}
		}
		return results;
	}
}
