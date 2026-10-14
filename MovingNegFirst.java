package gut.dsa;

import java.util.Arrays;

public class MovingNegFirst {

	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 1, -2, 3, -4, 5, -6 };
		int n = nums.length;
		int i = 0;
		int j = 1;
		while (j < n) {
			if (nums[i] < 0) {
				i++;
				j++;
				continue;
			}
			if (nums[j] < 0) {
				swap(i, j, nums);
				i++;
			}
			j++;
		}

		System.out.println(Arrays.toString(nums));
	}

}
