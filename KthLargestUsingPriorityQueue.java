package gut.dsa;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestUsingPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 2, 1, 7, 4, 9 };
		int k = 3;
		Queue<Integer> q = new PriorityQueue<>();
		for (int n : arr) {
			q.offer(n);
			// System.out.println(q);
			if (q.size() > k) {
				q.poll();
			}
			// System.out.println(q);
			// System.out.println("==================");
		}
		System.out.println(q.peek());
	}

}
