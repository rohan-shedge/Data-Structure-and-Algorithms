package leetcode.Integer;

public class LeetCode_9_Integer_Pallindrome {
	public static void main(String[] args) {
		System.out.println(integerPallindrome(121));
	}

	private static boolean integerPallindrome(int num) {
		int original = num;
		int remainder, reversed = 0;
		while (num != 0) {
			remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num = num / 10;
		}
		return original == reversed;
	}
}