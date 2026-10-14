package gut.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindPairsUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 7, -1, 5 };
		int target = 6;
		ArrayList<Integer> nums = new ArrayList<>();
		Map<Integer, Integer> pairs = new HashMap<>();
		for (int n : arr) {
			int x = target - n;
			if (nums.contains(x)) {
				pairs.put(x, n);
				System.out.println("(" + x + "," + n + ")");
			}
			nums.add(n);
		}
		System.out.println(pairs);

	}

}
