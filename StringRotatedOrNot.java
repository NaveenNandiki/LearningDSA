package gut.dsa;

public class StringRotatedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD";
		String str2 = "CDAB";
		boolean stat = true;
		int start = str2.indexOf(str.charAt(0));
		if (start == -1) {
			System.out.println("flase");
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != str2.charAt(start)) {
					stat = false;
					break;
				}
				start++;
				start = start % str.length();
			}
			System.out.println(stat);
		}
	}

}
