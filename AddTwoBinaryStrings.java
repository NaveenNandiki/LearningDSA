package gut.dsa;

public class AddTwoBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1011";
		String s2 = "1";
		String res = "";
		int n1 = s1.length() - 1;
		int n2 = s2.length() - 1;
//		int i = Math.max(n1, n2);
		int carry = 0;
		while (n1 >= 0 || n2 >= 0) {
			int sum = carry;
			if (n1 >= 0) {
				sum += s1.charAt(n1) - '0';
			}
			if (n2 >= 0) {
				sum += s2.charAt(n2) - '0';
			}
			carry = sum / 2;
			res = (sum % 2) + res;
			n1--;
			n2--;
//			i--;
		}
		if (carry != 0)
			res = carry + res;
		System.out.println(res);

	}
}

//String s1 = "111";
//String s2 = "101";
//int carry = 0;
//String res = "";
//int i = s1.length() - 1;
//int j = s2.length() - 1;
//while (i >= 0 && j >= 0) {
//	int n1 = 0;
//	int n2 = 0;
//// int carry=0;
//	if (s1.charAt(i) == '1') {
//		n1 = 1;
//	}
//	if (s2.charAt(j) == '1') {
//		n2 = 1;
//	}
//	if ((n1 + n2 + carry) == 2) {
//		res = "0" + res;
//		carry = 1;
//	} else if ((n1 + n2 + carry) == 3) {
//		res = "1" + res;
//		carry = 1;
//	} else {
//		res = "" + (n1 + n2 + carry) + res;
//		carry = 0;
//	}
//	i--;
//	j--;
//
//}
//while (i >= 0) {
//	int n1 = 0;
//	if (s1.charAt(i) == '1') {
//		n1 = 1;
//	}
//	if ((n1 + carry) == 2) {
//		res = "0" + res;
//		carry = 1;
//	} else {
//		res = "" + (n1 + carry) + res;
//		carry = 0;
//	}
//	i--;
//}
//while (j >= 0) {
//	int n1 = 0;
//	if (s1.charAt(j) == '1') {
//		n1 = 1;
//	}
//	if ((n1 + carry) == 2) {
//		res = "1" + res;
//		carry = 1;
//	} else {
//		res = "" + (n1 + carry) + res;
//		carry = 0;
//	}
//	j--;
//}
//if (carry == 1)
//	res = "" + carry + res;
//System.out.println(res);
//
//}
//String s1 = "111";
//String s2 = "101";
//int carry = 0;
//String res = "";
//int i = s1.length() - 1;
//int j = s2.length() - 1;
//while (i >= 0 && j >= 0) {
//	int n1 = 0;
//	int n2 = 0;
//// int carry=0;
//	if (s1.charAt(i) == '1') {
//		n1 = 1;
//	}
//	if (s2.charAt(j) == '1') {
//		n2 = 1;
//	}
//	if ((n1 + n2 + carry) == 2) {
//		res = "0" + res;
//		carry = 1;
//	} else if ((n1 + n2 + carry) == 3) {
//		res = "1" + res;
//		carry = 1;
//	} else {
//		res = "" + (n1 + n2 + carry) + res;
//		carry = 0;
//	}
//	i--;
//	j--;
//
//}
//while (i >= 0) {
//	int n1 = 0;
//	if (s1.charAt(i) == '1') {
//		n1 = 1;
//	}
//	if ((n1 + carry) == 2) {
//		res = "0" + res;
//		carry = 1;
//	} else {
//		res = "" + (n1 + carry) + res;
//		carry = 0;
//	}
//	i--;
//}
//while (j >= 0) {
//	int n1 = 0;
//	if (s1.charAt(j) == '1') {
//		n1 = 1;
//	}
//	if ((n1 + carry) == 2) {
//		res = "1" + res;
//		carry = 1;
//	} else {
//		res = "" + (n1 + carry) + res;
//		carry = 0;
//	}
//	j--;
//}
//if (carry == 1)
//	res = "" + carry + res;
//System.out.println(res);
//
//}
