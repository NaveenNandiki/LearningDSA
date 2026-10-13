package gut.dsa;

import java.util.Arrays;
import java.util.LinkedList;

public class FindMidNodeInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
		int mid = 0;
		int n = nums.size();
		int i = 0, j = 0;
		while (j < n - 1) {
			i++;
			j = j + 2;
			if (j == n - 1) {
				System.out.println("mid= " + nums.get(i));
				break;
			}
			if (j == n) {
				System.out.println("mid= " + nums.get(i - 1) + " " + nums.get(i));
				break;
			}
		}

	}

}
