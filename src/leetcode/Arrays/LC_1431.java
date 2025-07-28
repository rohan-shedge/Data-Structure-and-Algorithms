package leetcode.Arrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_1431 {

	// java 8
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<Boolean>();
		int maxValue = Arrays.stream(candies).max().getAsInt();
		Arrays.stream(candies).forEach(candy -> {
			if (candy + extraCandies >= maxValue) {
				list.add(true);
			} else {
				list.add(false);
			}
		});
		return list;
	}

	@Test
	public void test() {
		LC_1431 test = new LC_1431();
		int[] inputArray = { 12, 1, 12 };
		List<Boolean> actualArray = test.kidsWithCandies(inputArray, 10);
		List<Boolean> expectedArray = Arrays.asList(true, false, true);
		Assertions.assertEquals(actualArray, expectedArray);
	}

}
