package Arrays;

public class lc3512 {
    public static void main(String[] args) {

        int[] nums = {3, 9, 7};   // sample input
        int k = 5;

        Solution sol = new Solution();
        int ans = sol.minOperations(nums, k);

        System.out.println("Answer: " + ans);
    }
}

class Solution {
    public int minOperations(int[] nums, int k) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return (int)(sum % k);
    }
}

