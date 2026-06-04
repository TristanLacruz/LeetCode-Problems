/**
 * Problem: Concatenation of Array (#1929)
 * Link: https://leetcode.com/problems/concatenation-of-array/
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.Arrays;

public class Concatenation_of_Array_1929 {

	public static void main(String[] args) {
		int[] nums = {1,2,1};
		int[] ans = getConcatenation(nums);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[nums.length + i] = nums[i];
		}
		return ans;
	}
}
