package day1;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		System.out.println(validParenthesis("{}{}"));
	}

	public static boolean validParenthesis(String s) {

		if (s.length() == 0 || s.length() == 1 || s == null)
			return false;

		Stack<String> stack = new Stack<String>();
		String temp;

		for (int i = 0; i < s.length(); i++) {
			temp = s.substring(i, i + 1);
			if (temp.equals("[") || temp.equals("{") || temp.equals("(")) {
				stack.push(temp);
			} else if (temp.equals(")")) {
				if (stack.isEmpty())
					return false;
				else if (!stack.peek().equals("("))
					return false;
				else
					stack.pop();
			}
			else if (temp.equals("]")) {
				if (stack.isEmpty())
					return false;
				else if (!stack.peek().equals("["))
					return false;
				else
					stack.pop();
			}
			else if (temp.equals("}")) {
				if (stack.isEmpty())
					return false;
				else if (!stack.peek().equals("{"))
					return false;
				else
					stack.pop();
			}
		}

		if(stack.isEmpty()) return true;
		else return false;
	}
}
