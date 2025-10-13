package Arrays;

public class lc268 {
    public static void main(String[] args) {

        // Example input array
        int[] nums = {3, 0, 1};

        int n = nums.length;

        // Step 1: Calculate expected sum of numbers 0..n
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate actual sum of array elements
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum = actualSum + nums[i];
        }

        // Step 3: Missing number = expected - actual
        int missing = expectedSum - actualSum;

        System.out.println("Expected sum (0 to " + n + "): " + expectedSum);
        System.out.println("Actual sum of array elements: " + actualSum);
        System.out.println("Missing number is: " + missing);
    }
}
