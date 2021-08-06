package algorithms.string;

import java.util.Scanner;

public class HackerRank_MarsExploration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int answer = marsExploration(in);
		System.out.println(answer);
    }

	private static int marsExploration(String message) {
		int mismatchCount = 0;
		char[] expected = {'S','O','S'}; 
		for (int i = 0 ; i < message.length(); i++) {
			if (expected[i % 3] != message.charAt(i)) {
				mismatchCount++;
			}
		}
		return mismatchCount;
	}
}
