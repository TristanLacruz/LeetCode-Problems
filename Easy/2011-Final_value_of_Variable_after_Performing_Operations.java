/**
 * Problem: Final Value of Variable After Performing Operations (#2011)
 * Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Final_value_of_Variable_after_Performing_Operations_2011 {

	public static void main(String[] args) {
		String[] operations = {"X++","++X","--X","X--"};
		int x = finalValueAfterOperations(operations);
		System.out.println(x);
	}

	public static int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i].equals("X++") || operations[i].equals("++X")) {
				x++;
			} else {
				x--;
			}
		}
		return x;
	}
}
