package gut.dsa;

import java.util.HashMap;
import java.util.Map;

public class MaxSubStringWithUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcbcdbcbcddcbdcbbcd";
		int l = 0;
		int r = 0;
		int max = 0;
		int s = 0;
		int e = 0;
		Map<Character, Integer> pos = new HashMap<>();
		while (r < str.length()) {
			if (!pos.containsKey(str.charAt(r))) {
				pos.put(str.charAt(r), r);
			} else {
				if (pos.get(str.charAt(r)) >= l) {
					l = pos.get(str.charAt(r)) + 1;
				}
				pos.put(str.charAt(r), r);
			}
			if (max < (r - l + 1)) {
				max = r - l + 1;
				s = l;
				e = r;
			}
			r++;
			System.out.println(pos);
		}
		for (int i = s; i <= e; i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
