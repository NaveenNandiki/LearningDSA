package gut.dsa;

public class FindAllSubSeqInString {

	public static void subseq(String str, int i, String res) {
		if (i == str.length()) {
			System.out.println(res);
			return;
		}
		subseq(str, i + 1, res + str.charAt(i));
		subseq(str, i + 1, res);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABC";
//		ArrayList<String> res = new ArrayList<>();
		subseq(s, 0, "");

	}

//	ArrayList<String> res = new ArrayList<>();
//	for (int i = 0; i < s.length(); i++) {
//		String str = "" + s.charAt(i);
//		res.add("" + s.charAt(i));
//		for (int j = i + 1; j < s.length(); j++) {
//			String seq = "";
//			seq = seq + s.charAt(i) + s.charAt(j);
//			str = str + s.charAt(j);
//			res.add(seq);
//		}
//		res.add(str);
//	}
//
//	System.out.println(res);

}
