package gut.dsa;

import java.util.Arrays;

public class MovingZerosRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 1, 2, 3, 4, 0, 1, 0, 3, 12 };
		int n = nums.length;
		int i = 0;
		int j = i + 1;
		while (j < n && i < n - 1) {
			if (nums[i] != 0) {
				i++;
				j++;
				continue;
			}
			if (nums[j] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
				i++;
			} else
				j++;
		}

		System.out.println(Arrays.toString(nums));
	}

}
