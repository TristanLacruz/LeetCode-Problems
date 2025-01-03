
public class Remove_Element_27 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int result = removeElement(nums, val);
		System.out.println(result);
	}

	public static int removeElement(int[] nums, int val) {
		int writeIndex = 0;
		for(int readIndex = 0; readIndex < nums.length; readIndex++) {
			if(nums[readIndex] != val) {
				nums[writeIndex] = nums[readIndex]; 
				writeIndex++;
			}
		}
		return writeIndex;
	}
	/*Input: nums = [0,1,2,2,3,0,4,2], val = 2
	Output: 5, nums = [0,1,4,0,3,_,_,_]*/
}
