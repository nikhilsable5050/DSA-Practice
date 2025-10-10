package Arrays;

public class lc66 {
        public static int[] plusOne(int[] digits) {
            int n = digits.length;

            // Traverse from the end
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;  // no carry needed
                    return digits;
                }
                digits[i] = 0;  // carry over
            }

            // If all digits were 9, we need an extra digit at the beginning
            int[] newNumber = new int[n + 1];
            newNumber[0] = 1;
            return newNumber;
        }

        public static void main(String[] args) {
            int[] digits = {9, 9, 9};
            int[] result = plusOne(digits);

            for (int num : result) {
                System.out.print(num + " ");
            }
        }
}
