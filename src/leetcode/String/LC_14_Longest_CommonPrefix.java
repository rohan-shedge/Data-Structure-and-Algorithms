package leetcode.String;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC_14_Longest_CommonPrefix {

	 public String longestCommonPrefix(String[] strs) {
		 String prefix = strs[0];
		 for (int i=1 ; i<strs.length ; i++) {
			 while(strs[i].indexOf(prefix) != 0) {
				 prefix = prefix.substring(0, prefix.length() -1);
			 }
		 }
		 return prefix;
	 }

	@Test
	public void test() {
		String[] strs = {"flower","flow","abcight"};
		Assertions.assertEquals(longestCommonPrefix(strs),"");
	}
}



