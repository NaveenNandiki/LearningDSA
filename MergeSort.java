package gut.dsa;

import java.util.Arrays;

public class MergeSort {
	static int i = 0;

	static int[] divide(int[] nums, int s, int e) {
		if (s == e) {
			return new int[] { nums[s] };
		}
//		System.out.println(Arrays.toString(nums));
		int mid = (s + e) / 2;
		int[] left = divide(nums, s, mid);
//		System.out.println();
		int[] right = divide(nums, mid + 1, e);
//		System.out.println(i++);
		return merge(left, right);
	}

	static int[] merge(int[] l, int[] r) {
		int n = l.length;
		int m = r.length;
		int i = 0, j = 0;
		int k = 0;
		int[] res = new int[m + n];
		while (i < n && j < m) {
			if (l[i] < r[j]) {
				res[k++] = l[i++];
			} else if (l[i] > r[j]) {
				res[k++] = r[j++];
			}

		}
		if (i < n) {
			while (i < n) {
				res[k++] = l[i++];
			}
		}
		if (j < m) {
			while (j < m) {
				res[k++] = r[j++];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 38, 27, 43, 3, 9, 82, 10 };
		int[] res = divide(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(res));
	}

}
