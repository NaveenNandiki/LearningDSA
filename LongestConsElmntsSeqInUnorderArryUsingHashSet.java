package gut.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestConsElmntsSeqInUnorderArryUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 5, 100, 4, 200, 1, 3, 2 };
		Set<Integer> s = new HashSet<>();
		for (int m : arr) {
			s.add(m);
		}
		int max = 0;
		for (int i : s) {
			int l = 0;
			int curr = i;
			while (s.contains(curr++)) {
				l++;
			}
			max = Math.max(l, max);
		}
		System.out.println(max);
	}

}
