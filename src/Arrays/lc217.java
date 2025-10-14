package Arrays;

import java.util.Arrays;
public class lc217 {


        public boolean containsDuplicate(int[] nums) {
            // Sort the array in place.
            Arrays.sort(nums);

            // Loop through the array starting from the second element.
            for (int i = 1; i < nums.length; i++) {
                // If the current element is equal to the previous one, it's a duplicate.
                if (nums[i] == nums[i - 1]) {
                    return true;
                }
            }

            // No duplicates were found.
            return false;
        }
}
