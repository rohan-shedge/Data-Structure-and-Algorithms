package leetcode.Arrays;

public class LC_152 {
    public static void main(String[] args) {
        LC_152 test = new LC_152();
        int[] a = {5,4,-1,7,8};
        System.out.println(test.maxProduct(a));
    }

    public int maxProduct(int[] nums) {
        int max_product = Integer.MIN_VALUE;
        int max_product_till_here = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                max_product_till_here  = 1;
                continue;
            }
            max_product_till_here *= nums[i];
            if (max_product_till_here > max_product) {
                max_product = max_product_till_here;
            }
        }
        return max_product;
    }
}
// 1 2 3 4 5