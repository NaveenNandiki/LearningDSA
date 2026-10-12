package gut.dsa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepeatingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";
		Map<Character, Integer> fre = new LinkedHashMap<>();
		for (char ch : s.toCharArray()) {
			if (!fre.containsKey(ch)) {
				fre.put(ch, 1);
			} else {
				fre.put(ch, fre.get(ch) + 1);
			}
		}
//		Set<Character> characters=fre.keySet();
//		System.out.println(fre.keySet().iterator().next());
		for (Entry<Character, Integer> ch : fre.entrySet()) {
			if (ch.getValue() > 1) {
				System.out.println(ch.getKey());
				break;
			}
		}
	}

}
