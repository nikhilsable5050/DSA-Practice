package MathCodingProblems;

public class lc7 {

    // Method to reverse integer
    public int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;

            // check for overflow
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }

            x /= 10;
        }

        return (int) rev;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        lc7 solution = new lc7();

        int[] testCases = {123, -123, 1534236469};

        for (int x : testCases) {
            System.out.println("Reverse of " + x + " is " + solution.reverse(x));
        }
    }
}
