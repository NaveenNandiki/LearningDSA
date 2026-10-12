package gut.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 11, 12, 13, 14 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			boolean stat = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
					stat = true;
				}

			}
			if (!stat)
				break;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
