/**
 * Problem: Build Array from Permutation (#1920)
 * Link: https://leetcode.com/problems/build-array-from-permutation/
 *
 * Time Complexity:  O(n)
 * Space Complexity: O(n)
 */
import java.util.Arrays;

public class Build_Array_from_Permutation {

	public static void main(String[] args) {
		int[] nums = {0, 2, 1, 5, 3, 4};
		int[] ans = buildArray(nums);
		System.out.println(Arrays.toString(ans));;
	}
	
	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}
}
