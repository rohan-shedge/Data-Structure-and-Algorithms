package leetcode.String;

import java.util.Stack;

public class LC_151_Reverse_Words_String {

	private static String reverseWordsString(String s) {
		Stack<String> st = new Stack<>();
		String temp = "";
		String ans = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				if (temp.length() > 0)
					st.push(temp);
				temp = "";
			} else
				temp = temp + s.charAt(i);
		}

		ans = ans + temp;

		while (!st.isEmpty()) {
			ans = ans + " " + st.pop();
		}

		if (ans.length() != 0 && ans.charAt(0) == ' ')
			ans = ans.substring(1);

		return ans;
	}

	// Driver Code
	public static void main(String[] args) {
		String s = "     Rohan is a bad boy        ";
		System.out.println("Reverse of the string is => " + reverseWordsString(s));
	}
}
