package Arrays;

public class lc3190 {

    // LeetCode 3190 Solution Method
    public static int minimumOperations(int[] nums) {
        int operations = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                operations++;
            }
        }

        return operations;
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {1, 3, 6, 7, 10};
        System.out.println("Operations needed: " + minimumOperations(nums1));

        // Test Case 2
        int[] nums2 = {3, 9, 12};
        System.out.println("Operations needed: " + minimumOperations(nums2));

        // Test Case 3
        int[] nums3 = {2, 4, 5, 8};
        System.out.println("Operations needed: " + minimumOperations(nums3));
    }
}
