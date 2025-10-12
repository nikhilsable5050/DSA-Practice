package Arrays;

public class SumOfElementsWithFrequencyDivisibleByK {
    public static int sumOfElements(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count frequency of nums[i]
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // If frequency divisible by k, add nums[i]
            if (count % k == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }

    // ✅ For IntelliJ testing
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 3, 4};
        int k = 2;
        System.out.println(sumOfElements(nums, k)); // Output: 16
    }
}
