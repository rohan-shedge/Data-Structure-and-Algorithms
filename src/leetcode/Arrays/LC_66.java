package leetcode.Arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LC_66 {
    public int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i=n-1 ; i>=0 ; i--) {
			if (digits[i] != 9) {
				digits[i] = digits[i] + 1;
				break;
			}
			else {
				digits[i] = 0;
			}
		}
		
		if (digits[0] == 0) {
			digits = new int[n + 1];
			digits[0] = 1;
		}
		return digits;
    }
    
    @Test
    public void test() {
    	LC_66 test = new LC_66();
    	int[] inputArray = {9, 9, 9, 9, 9};
    	int[] actualArray = test.plusOne(inputArray);
    	int[] expected = {1, 0, 0, 0, 0, 0};
    	assertArrayEquals(expected, actualArray);
    }
}
