
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
