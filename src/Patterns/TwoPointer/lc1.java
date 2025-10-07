package Patterns.TwoPointer;

import java.util.Arrays;

    public class lc1 {



        public static int[] twoSum(int[] nums, int target) {
            // Step 1: Create a pair array (value, index)
            int[][] pair = new int[nums.length][2];
            for (int i = 0; i < nums.length; i++) {
                pair[i][0] = nums[i];  // value
                pair[i][1] = i;        // index
            }

            // Step 2: Sort by value
            Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));

            // Step 3: Use two pointers
            int left = 0, right = nums.length - 1;
            while (left < right) {
                int sum = pair[left][0] + pair[right][0];
                if (sum == target) {
                    // Return original indices
                    return new int[]{pair[left][1], pair[right][1]};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            // Should never reach here (problem guarantees one solution)
            return new int[]{-1, -1};
        }

        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

    }


