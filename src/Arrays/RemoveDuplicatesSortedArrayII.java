package Arrays;

public class RemoveDuplicatesSortedArrayII {

    public static int removeDuplicates(int[] nums) {

        // Edge case: if array has 2 or fewer elements
        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 2; // write pointer (first 2 elements are always allowed)

        for (int j = 2; j < nums.length; j++) {

            // Compare with element two positions behind
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    // Optional: main method for testing in IntelliJ
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int length = removeDuplicates(nums);

        System.out.println("Length: " + length);
        System.out.print("Array: ");
        for (int k = 0; k < length; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}

