package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LC_1491 {
	// java 8
	public double average(int[] salary) {
		double minValue = Arrays.stream(salary).min().getAsInt();
		double maxValue = Arrays.stream(salary).max().getAsInt();
		final double[] sum = { 0.0d };
		Arrays.stream(salary).forEach(sal -> {
			if (sal != maxValue && sal != minValue) {
				sum[0] += sal;
			}
		});
		return (double) sum[0] / (double) (salary.length - 2);
	}

	@Test
	public void test() {
		LC_1491 test = new LC_1491();
		int[] inputArray = { 1000, 2000, 3000 };
		double actual = test.average(inputArray);
		double expected = 2000.00000;
		Assert.assertEquals(expected, actual);
	}
}
