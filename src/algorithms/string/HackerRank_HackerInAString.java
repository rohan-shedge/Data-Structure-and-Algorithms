package algorithms.string;

import java.util.Scanner;

public class HackerRank_HackerInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i = 0 ; i < q ; i++) {
			String s = sc.next();
			if (s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k")) {
				System.out.print("YES" + "\n");				
			}
			else if (s.matches(".*H.*a.*c.*k.*e.*r.*r.*a.*n.*k")) {
				System.out.print("YES" + "\n");				
			}
			else {
				System.out.print("YES" + "\n");
			}
		}
	}
}

