//https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class Running_Sum_of_1D_Array {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5};
		int aux[] = runningSum(nums);
		System.out.println(Arrays.toString(aux));
	}
	
	public static int[] runningSum(int[] nums) {
        int count = 0;
        int newNums[]  = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
        	count += nums[i];
        	newNums[i] = count;
        }
        return newNums;
    }

}
