package leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class LC_20_Valid_Parenthesis {
	private static boolean validParenthesis(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (!stack.isEmpty() && isParenthesisPair(stack.peek(), ch))
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();

	}

	private static boolean isParenthesisPair(char c1, char c2) {
		return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']');
	}

	@Test
	public void test() {

		assertEquals(validParenthesis("]"), false);
		assertEquals(validParenthesis("[]"), true);
		assertEquals(validParenthesis("}{"), false);
		assertEquals(validParenthesis("{}"), true);
		assertEquals(validParenthesis("{[()]}"), true);
		assertEquals(validParenthesis("{[()]"), false);
		assertEquals(validParenthesis("["), false);

	}

}
