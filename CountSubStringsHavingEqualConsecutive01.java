package gut.dsa;

public class CountSubStringsHavingEqualConsecutive01 {

	public static int countBinarySubstrings(String s) {

		int prev = 0;
		int curr = 1;
		int count = 0;

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				curr++;
			} else {
				count += Math.min(prev, curr);
				prev = curr;
				curr = 1;
			}
		}

		return count + Math.min(prev, curr);
	}

	public static void main(String[] args) {
		String s = "0011001100001111";
		System.out.println(countBinarySubstrings(s));
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "0011001100001111";
//		int c1 = 0;
//		int c0 = 0;
//		int c = 0;
//		if (s.charAt(0) == '0') {
//			c0++;
//		} else {
//			c1++;
//
//		}
//
//		for (int i = 1; i < s.length(); i++) {
//			if (s.charAt(i) != s.charAt(i - 1)) {
//				if (s.charAt(i) == '0') {
//					c0 = 1;
//				} else {
//					c1 = 1;
//
//				}
//				c++;
//			} else {// s.charAt(i) == s.charAt(i - 1)
//				if (s.charAt(i) == '0') {
//					c0++;
//
//					if (c0 > 1 && c0 <= c1) {
//						c++;
//					}
//				} else {
//					c1++;
//					if (c1 > 1 && c1 <= c0) {
//						c++;
//					}
//				}
//
//			}
//		}
//
//		System.out.println(c);
//	}

}
