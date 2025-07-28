package leetcode.Arrays;

public class LC_53 {
    public static void main(String[] args) {
        LC_53 test = new LC_53();
        int[] testArray = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(test.maxSubArraySum(testArray));
    }

    // Function Call
    int maxSubArraySum(int a[]) {
        int max_sum = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < a.length; i++) {
            max_ending_here += a[i];
            if (max_sum < max_ending_here) {
                max_sum = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }

        }
        return  max_sum;
    }
}
//nums = [-2,1,-3,4,-1,2,1,-5,4]\''
// -2 -3
// -2 -1
// -2  1
