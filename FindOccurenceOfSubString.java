package gut.dsa;

public class FindOccurenceOfSubString {

	public static boolean check(String substr, String str, int start) {
		for (int i = 0; i < substr.length(); i++) {
			if (substr.charAt(i) != str.charAt(start++)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "AABAACAADAABAABA";
		String substr = "AABA";
		int n = str.length() - substr.length();
		for (int i = 0; i <= n; i++) {
			if (check(substr, str, i)) {
				System.out.print(i + " ");
			}
		}
	}
}
