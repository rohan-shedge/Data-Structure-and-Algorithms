package leetcode.Arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LC_283_move_zeros {
	public void moveZeroes(int[] nums) {

	}
	
	@Test
	public void test() {
		LC_283_move_zeros test = new LC_283_move_zeros();
		int[] array = { 2, 0, 1 };
		test.moveZeroes(array);
		assertArrayEquals(new int[] { 1, 2, 0 }, array);
	}
}
