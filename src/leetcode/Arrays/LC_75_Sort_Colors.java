package leetcode.Arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LC_75_Sort_Colors {

	public void sortColors(int[] array) {
		int mid = 0, low = 0, high = 0;
		low = mid = 0;
		high = array.length - 1;
		while (mid <= high) {
			if (array[mid] == 0) {
				swap(array, low, mid);
				low++;
				mid++;
			} else if (array[mid] == 1) {
				mid++;
			} else if (array[mid] == 2) {
				swap(array, mid, high);
				high--;
			}

		}
	}

	private void swap(int[] nums, int left, int right) {
		int tmp = nums[left];
		nums[left] = nums[right];
		nums[right] = tmp;
	}

	@Test
	public void test() {
		LC_75_Sort_Colors test = new LC_75_Sort_Colors();
		int[] array = { 2, 0, 1 };
		test.sortColors(array);
		assertArrayEquals(new int[] { 0, 1, 2 }, array);
	}

}
