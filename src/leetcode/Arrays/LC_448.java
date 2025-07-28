package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]);
			if (nums[index - 1] > 0) {
				nums[index - 1] *= - 1;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	}

	@Test
	public void test() {
		LC_448 test = new LC_448();
		int[] input = { 1, 2, 2, 4 };
		List<Integer> list = test.findDisappearedNumbers(input);
		Assertions.assertEquals(list, Arrays.asList(3));
	}
}
