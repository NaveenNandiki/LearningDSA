package gut.dsa;

public class LongestWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "In Vcube, Java is simple";
		String[] strs = s.split(" ");
		int max = Integer.MIN_VALUE;
		String maxstr = "";
		for (String str : strs) {
			if (str.length() > max) {
				max = str.length();
				maxstr = str;
			}
		}
		System.out.println(maxstr);
	}

}
