package leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class LC_242_Anagram {

	public static boolean isAnagram(String s, String t) {
		
		int[] array = new int[26];
		
		if (s.length() != t.length()) {
			return false;
		}
		
		for (int i=0 ; i< s.length() ; i++) {
			array[s.charAt(i) - 'a']++;
			array[t.charAt(i) - 'a']--;
		}

		boolean flag = Arrays.stream(array).anyMatch(x -> (x!=0));
		if (flag) return false;
		return true;
	}
	
	@Test
	public void test() {
		boolean testResult = LC_242_Anagram.isAnagram("rat", "car");
		assertEquals(testResult, false);
	}
}
