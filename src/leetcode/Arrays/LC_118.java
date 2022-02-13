package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LC_118 {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0)
			return result;

		result.add(Arrays.asList(1));
		for (int i = 1; i < numRows; i++) {
			List<Integer> curr = new ArrayList<>();
			curr.add(1);

			for (int j = 1; j < i; j++) {
				curr.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
			}

			curr.add(1);
			result.add(curr);
		}

		result.forEach(System.out::println);
		return result;
	}

	@Test
	public void test() {
		LC_118 test = new LC_118();
		List<List<Integer>> actual = test.generate(5);

		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(1, 1));
		expected.add(Arrays.asList(1, 2, 1));
		expected.add(Arrays.asList(1, 3, 3, 1));
		expected.add(Arrays.asList(1, 4, 6, 4, 1));

		Assert.assertEquals(expected, actual);
	}

}
