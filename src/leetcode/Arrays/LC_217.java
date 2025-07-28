package leetcode.Arrays;

import java.util.HashMap;

public class LC_217 {
    public static void main(String[] args) {
        LC_217 test = new LC_217();
        int[] a = {1,1,1,3,3,4,3,2,4,2};
        boolean result = test.containsDuplicate(a);
        System.out.println(result);
    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for ( int num : nums ) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }

}
