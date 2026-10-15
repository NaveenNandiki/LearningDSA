package gut.dsa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindComnEleIn3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 5, 10 };
		int[] arr2 = { 1, 4, 10 };
		int[] arr3 = { 1, 6, 10 };
		Map<Integer, Integer> freq = new LinkedHashMap<>();
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = arr3.length;
		int max = Math.max(n1, n2);
		max = Math.max(max, n3);
		int i = 0;
		while (i < max) {
			if (i < n1) {
				if (freq.containsKey(arr1[i])) {
					freq.put(arr1[i], freq.get(arr1[i]) + 1);
				} else {
					freq.put(arr1[i], 1);
				}
			}
			if (i < n2) {
				if (freq.containsKey(arr2[i])) {
					freq.put(arr2[i], freq.get(arr2[i]) + 1);
				} else {
					freq.put(arr2[i], 1);
				}
			}
			if (i < n3) {
				if (freq.containsKey(arr3[i])) {
					freq.put(arr3[i], freq.get(arr3[i]) + 1);
				} else {
					freq.put(arr3[i], 1);
				}
			}
			i++;
		}

		for (Entry<Integer, Integer> n : freq.entrySet()) {
			if (n.getValue() == 3) {
				System.out.println(n.getKey());
			}
		}

	}

}
