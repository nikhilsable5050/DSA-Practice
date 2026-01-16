package Strings;

public class LongestPalimdrome {

    public static void main(String[] args) {
        LongestPalimdrome solution = new LongestPalimdrome();

        String input = "babad";
        String result = solution.longestPalindrome(input);

        System.out.println("Longest Palindromic Substring: " + result);
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        String longest = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);

                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
