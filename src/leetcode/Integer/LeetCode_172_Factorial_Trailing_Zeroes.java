package leetcode.Integer;

public class LeetCode_172_Factorial_Trailing_Zeroes {

	private static int findTrailingZeros(int number) {
		int count = 0;
		for (int i=5; i<=number ;i=i*5) {
			count = count + number/i; 
		}
		return count;
		/*
		  	while (number > 0) { 
			count = count  + number/5;
			number = number / 5;
		  }
		  */
	}
	
	// Driver Code
	public static void main(String[] args) {
		int n = 49;
		System.out.println("Count of trailing 0s in " + n + "! is " + findTrailingZeros(n));
	}
}
