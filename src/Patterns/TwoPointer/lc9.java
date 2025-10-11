package Patterns.TwoPointer;

public class lc9 {

        public static boolean isPalindrome(int x) {
            // Negative numbers and numbers ending with 0 (except 0 itself) are not palindrome
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            String str = String.valueOf(x);
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {
            int testNumber1 = 121;
            int testNumber2 = -121;
            int testNumber3 = 10;

            System.out.println(testNumber1 + " is palindrome? " + isPalindrome(testNumber1));
            System.out.println(testNumber2 + " is palindrome? " + isPalindrome(testNumber2));
            System.out.println(testNumber3 + " is palindrome? " + isPalindrome(testNumber3));
        }
}
