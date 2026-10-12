package gut.dsa;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithOutRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";
		Map<Character, Integer> fre = new HashMap<>();
		int i = 0;
		int j = 1;
		int len = 1;
		fre.put(str.charAt(0), 0);
		while (j < str.length()) {
			char ch = str.charAt(j);
			if (fre.containsKey(ch)) {
				if (fre.get(ch) >= i) {

				}
			}
		}

	}

}
