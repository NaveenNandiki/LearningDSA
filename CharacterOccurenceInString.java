package gut.dsa;

public class CharacterOccurenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Program";
		char ch = 'r';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
