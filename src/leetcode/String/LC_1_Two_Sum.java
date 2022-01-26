package leetcode.String;

import static org.junit.Assert.assertArrayEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class LC_1_Two_Sum {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (map.containsKey(target - nums[i])) {
				return IntStream.of((int)map.get(target - nums[i]), i).toArray();
			}
			else {
				map.put(nums[i], i);
			}
		}
		 throw new IllegalArgumentException("No two sum solution");
	}
	
	@Test
	public void test() {
		int[] array = {2, 3, 8, 7};
		LC_1_Two_Sum test = new LC_1_Two_Sum();
		int[] actual = test.twoSum(array, 15);
		int[] expected = {2, 3};
		assertArrayEquals(expected, actual);
	}
}
