//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/	

import java.util.Scanner;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1432 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = Integer.valueOf(scanner.nextLine());
		int steps = numberOfSteps(x);
		System.out.println(steps);
		scanner.close();
	}

	public static int numberOfSteps(int num) {
		int count = 0;
		while(num != 0) {
			if(num%2 == 0) {
				num /= 2;
				count ++;
			}else {
				num -= 1;
				count ++;
			}
		}
		return count;
	}
}
