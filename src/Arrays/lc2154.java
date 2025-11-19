package Arrays;

public class lc2154 {

        // Easy brute force solution
        public int findFinalValue(int[] nums, int original) {

            boolean found = true;

            while (found) {
                found = false;

                for (int n : nums) {
                    if (n == original) {
                        original *= 2;
                        found = true;
                        break;
                    }
                }
            }
            return original;
        }

        // Main method for testing
        public static void main(String[] args) {

            lc2154 obj = new lc2154();

            int[] nums = {5, 3, 6, 1, 12};
            int original = 3;

            int result = obj.findFinalValue(nums, original);

            System.out.println("Final Value = " + result);
        }

}
