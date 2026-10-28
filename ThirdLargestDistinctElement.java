package gut.dsa;

public class ThirdLargestDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 5, 5, 4, 4, 4, 45, 6 };
		int m = Integer.MIN_VALUE;
		int sm = Integer.MIN_VALUE;
		int tm = Integer.MIN_VALUE;
		int n = a.length;
		for (int i = 1; i < n; i++) {
			if (m < a[i]) {
				tm = sm;
				sm = m;
				m = a[i];
			} else if (a[i] > sm && a[i] != m) {
				tm = sm;
				sm = a[i];
			} else if (a[i] > tm && a[i] != sm && a[i] != m) {
				tm = a[i];
			}
		}
		System.out.println("max: " + tm);
	}

}
