package leetcode.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LC_58 {

	public int lengthOfLastWord(String s) {
		s = s.trim();
		int n = s.length();
		int count = 0;
		for (int i=n-1 ; i >= 0 ; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;
    }
    
    @Test
    public void test() {
    	LC_58 test = new LC_58();
    	String input = "rohan is ";
    	int result = test.lengthOfLastWord(input);
    	assertEquals(2, result);
    }
}