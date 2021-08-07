package algorithms.string;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HackerRank_Pangrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String answer = pangrams(input);
		System.out.println(answer);
		sc.close();
	}

	//	Add the characters in a set and finally, count the number of characters in the set.
	//  26 characters will represent a pangram. 
	private static String pangrams(String input) {
		
		Set<Character> set= new TreeSet<>();
		for(Character c : input.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				set.add(Character.toLowerCase(c));
			}
		}
		if (set.size() == 26) {
			return "pangram";	
		}
		return "not pangram";
	}
}


