package gut.dsa;

public class Add3BinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1111";
		String s2 = "1111";
		String s3 = "1111";
		String res = "";
		int n1 = s1.length() - 1;
		int n2 = s2.length() - 1;
		int n3 = s3.length() - 1;
		int carry = 0;
		while (n1 >= 0 || n2 >= 0 || n3 >= 0) {
			int sum = carry;
			if (n1 >= 0) {
				sum += s1.charAt(n1) - '0';
			}
			if (n2 >= 0) {
				sum += s2.charAt(n2) - '0';
			}
			if (n3 >= 0) {
				sum += s3.charAt(n3) - '0';
			}
			carry = sum / 2;
			res = (sum % 2) + res;
			n1--;
			n2--;
			n3--;
			System.out.println(res + " " + sum + " " + carry);
		}
		if (carry == 2) {
			res = "10" + res;
		}
		if (carry == 1) {
			res = "" + carry + res;
		}
		System.out.println(res);

	}

}
