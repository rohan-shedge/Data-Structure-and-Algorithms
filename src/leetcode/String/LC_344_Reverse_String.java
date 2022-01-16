package leetcode.String;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LC_344_Reverse_String {
	
	private static char[] reverse(char[] s) {
		
		int l = 0;
		int r = s.length - 1;
		char temp;
		while(l < r) {
			temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
		return s;
	}
	
	@Test
	public void test() {
		assertArrayEquals(reverse(new char[] {'R','o','h','a','n'}), new char[] {'n','a','h','o','R'});
	}
}
