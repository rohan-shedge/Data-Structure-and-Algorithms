package leetcode.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LC_121 {
    public int maxProfit(int[] prices) {
        // if the given array is empty return 0
        if (prices.length == 0) return 0;
        // initialize maxProfit to 0
        int maxProfit = 0;
        // we are storing the buying price & keep it smaller
        int buyAt = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i]-buyAt);
            // if buy price greater than current price, then set buyAt = currentPrice
            if (buyAt > prices[i]) {
                buyAt = prices[i];
            }
        }
        return maxProfit;
    }
    
	@Test
	public void test() {
		LC_121 test = new LC_121();
		int[] inputArray = { 2, 1, 2, 1, 0, 1, 2 };
		int result = test.maxProfit(inputArray);
		Assert.assertEquals(2, result);
	}
}
