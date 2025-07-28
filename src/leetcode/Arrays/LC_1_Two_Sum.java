package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LC_1_Two_Sum {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (map.containsKey(target - nums[i])) {
				return IntStream.of((int) map.get(target - nums[i]), i).toArray();
			} else {
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	@Test
	public void test() {

	}
}
