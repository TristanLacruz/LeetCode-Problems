/**
 * Problem: Sum of Square Numbers (#633)
 * Link: https://leetcode.com/problems/sum-of-square-numbers/
 *
 * Approach: Two pointers. One starts from 0 and the other from √c. In each step it calculates the sum of squares of the two pointers. 
 * 		If the sum is equal to c, it returns true. If the sum is less than c, it moves the left pointer to the right (incrementing it).
 * 		If the sum is greater than c, it moves the right pointer to the left (decrementing it). 
 * 		The loop continues until the left pointer exceeds the right pointer.
 * Time Complexity: O(√c)
 * Space Complexity: O(1)
 */
public class Sum_of_Square_Numbers_633 {

	public static void main(String[] args) {
		int input1 = 3;
		System.out.println(judgeSquareSum(input1));
		int input2 = 5;
		System.out.println(judgeSquareSum(input2));
	}

	public static boolean judgeSquareSum(int c) {
		long left = 0; 
		long right = (long) Math.sqrt(c); 

		while (left <= right) {
			long sum = left * left + right * right; 
			if (sum == c) {
				return true;
			} else if (sum < c) {
				left++; 
			} else {
				right--; 
			}
		}
		return false; 
	}
}
