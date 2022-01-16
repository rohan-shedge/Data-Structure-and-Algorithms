package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC_232_Integer_2_English {

	private final String[] LESS_THAN_20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private final String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public String numberToWords(int num) {
		if (num == 0)
			return "Zero";
		return helper(num);
	}

	private String helper(int num) {
		String ret = "";
		if (num < 20) {
			ret = LESS_THAN_20[num];
		} else if (num < 100) {
			ret = TENS[num / 10] + " " + helper(num % 10);
		} else if (num < 1000) {
			ret = helper(num / 100) + " Hundred " + helper(num % 100);
		} else if (num < 1000000) {
			ret = helper(num / 1000) + " Thousand " + helper(num % 1000);
		} else if (num < 1000000000) {
			ret = helper(num / 1000000) + " Million " + helper(num % 1000000);
		} else if (num < 1000000000000l) {
			ret = helper(num / 1000000000) + " Billion " + helper(num % 1000000000);
		}
		return ret.trim();
	}

	@Test
	public void Test() {
		LC_232_Integer_2_English test = new LC_232_Integer_2_English();

		Assertions.assertEquals("Zero", test.numberToWords(0));
		Assertions.assertEquals("One", test.numberToWords(1));
		Assertions.assertEquals("Ten", test.numberToWords(10));
		Assertions.assertEquals("Twenty", test.numberToWords(20));
		Assertions.assertEquals("Twenty One", test.numberToWords(21));
		Assertions.assertEquals("Thirty One", test.numberToWords(31));

		Assertions.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
				test.numberToWords(1234567));

	}

}

//2