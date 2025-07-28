import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        System.out.println("Testing");
        Test test = new Test();
        System.out.println(test.maxProfit(new int[] {7,1,5,3,6,4}));

    }

    public int maxProfit(int[] prices) {
        int base = prices[0];
        int profit = 0;
        if (prices.length == 1) return 0;
        for (int i = 1; i < prices.length; i++) {
            if (base > prices[i]) {
                base = prices[i];
                continue;
            } else if (prices[i] - base > profit) {
                profit = prices[i] - base;
            }
        }
        return profit;
    }
}




