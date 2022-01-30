package leetcode.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LC_55_Jump_Game {
    public boolean canJump(int[] array) {
        int reach = 0;
        for (int i = 0; i <= reach; i++) {
            reach = Math.max(reach, i + array[i]);
            if (reach >= array.length - 1) {
                return true;
            }
        }
        return false;
    }
    
    @Test
    public void test() {
    	LC_55_Jump_Game test = new LC_55_Jump_Game();
    	int[] input = {3,2,1,0,4};
    	boolean result = test.canJump(input);
    	assertEquals(result, false);
    }
    
}
