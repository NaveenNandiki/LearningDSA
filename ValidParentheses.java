package gut.dsa;

import java.util.Stack;

public class ValidParentheses {

	public static boolean validParentheses(String str) {
		Stack<Character> stack = new Stack<>();
		int top = 0;
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				top++;
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char topel = stack.pop();
				if (ch == ')' && topel != '(') {
					return false;
				} else if (ch == '}' && topel != '{') {
					return false;
				} else if (ch == ']' && topel != '[') {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{({()})}{{}}[";
		System.out.println(validParentheses(str));

	}

}
