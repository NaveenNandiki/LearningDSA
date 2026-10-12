package gut.dsa;

public class TwoStringsAnnagramsOrNot {

//	public static String sort() {
//		return null;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silnt";
		boolean stat = true;
		if (str1.length() != str2.length()) {
			System.out.println("Not Annagram");
			return;
		} else {
			for (char ch : str1.toCharArray()) {
				if (str2.indexOf(ch) == -1) {
					System.out.println("Not Annagram");
					stat = false;
					break;
				}
			}
		}
		if (stat) {
			System.out.println("Annagram");
		}

	}

}
