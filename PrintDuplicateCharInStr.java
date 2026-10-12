package gut.dsa;

import java.util.ArrayList;

public class PrintDuplicateCharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";
		ArrayList<Character> arr = new ArrayList<>();
		for (char c : s.toCharArray()) {
			if (arr.contains(c)) {
				System.out.println(c + " ");
			} else {
				arr.add(c);
			}
		}
	}

}
