package leetcode.Arrays;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LC_122 {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i-1];
			}
		}
		return maxProfit;
	}

	@Test
	public void test() {
		LC_122 test = new LC_122();
		int[] inputArray = {7,1,5,6,7,8};
		int result = test.maxProfit(inputArray);
		Assert.assertEquals(7, result);
	}
}
